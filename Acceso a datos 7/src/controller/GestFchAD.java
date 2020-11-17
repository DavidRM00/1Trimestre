package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Entrenador;
import model.Jugador;

public class GestFchAD {

	private static Document docXML;
	private String File_Name;

	public GestFchAD(String FileName) {
	
		this.File_Name = FileName;
		try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		docXML = dBuilder.parse(File_Name);
		docXML.getDocumentElement().normalize();
		
		} catch (ParserConfigurationException | SAXException e) {
			System.err.println("Fallo durante el parsing.");
		}catch (IOException e) {
			System.err.println("Fallo accediendo al fichero.");
		}
		
	}
	
	private NodeList getNodeList(String expression) {
		NodeList nodeList = null;
		XPath xPath = XPathFactory.newInstance().newXPath();
		try {
			nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			System.err.println("Fallo aplicando la expression."+ expression);
		}
		return nodeList;
	}

	public List<Jugador> getJugadores() {
		
		Element eElement;
		List <Jugador> ListaJugadores = new ArrayList<Jugador>();
		
		NodeList nodeList = getNodeList("/game/jugador");
			
		for (int i=0; i<nodeList.getLength(); i++) {
				
				eElement = (Element) nodeList.item(i);
					
				int numero =Integer.parseInt(eElement.getAttribute("numero"));
				String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
				String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
				String nick = eElement.getElementsByTagName("nick").item(0).getTextContent();
				int puntos = Integer.parseInt(eElement.getElementsByTagName("puntos").item(0).getTextContent());
					
				ListaJugadores.add(new Jugador(nombre, apellidos, nick, puntos));
					
		}
		
		return ListaJugadores;
		
	} 
	
	
	public List<Entrenador> getEntrenadores() {
		
		Element eElement;
		List <Entrenador> ListaEntrenadores = new ArrayList<Entrenador>();
		
		NodeList nodeList = getNodeList("/game/entrenador");
		
		for (int i=0; i<nodeList.getLength(); i++) {
				
				eElement = (Element) nodeList.item(i);
					
				int colegiado =Integer.parseInt(eElement.getAttribute("colegiado"));
				String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
				String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
				int edad = Integer.parseInt(eElement.getElementsByTagName("edad").item(0).getTextContent());
					
				ListaEntrenadores.add((new Entrenador(colegiado, nombre, apellidos, edad)));
		
		}
		
		return ListaEntrenadores;
	}

	public static   void addNodeJugador(Jugador j) {
		
		Node nNombre_tag = docXML.createElement("nombre");
		Node nNombre_content = docXML.createTextNode(j.getNombre());
		nNombre_tag.appendChild(nNombre_content);
		
		Node nApellidos_tag = docXML.createElement("Apellidos");
		Node nApellidos_content = docXML.createTextNode(j.getApellidos());
		nApellidos_tag.appendChild(nApellidos_content);
		
		Node nNick_tag = docXML.createElement("nick");
		Node nNick_content = docXML.createTextNode(j.getNick());
		nNick_tag.appendChild(nNick_content);
		
		Node nPuntos_tag = docXML.createElement("puntos");
		Node nPuntos_content = docXML.createTextNode(""+j.getPuntos());
		nPuntos_tag.appendChild(nPuntos_content);
		
		Node nJugador = docXML.createElement("jugador");
		((Element) nJugador).setAttribute("numero", ""+j.getNumero());
		nJugador.appendChild(nNombre_tag);
		nJugador.appendChild(nApellidos_tag);
		nJugador.appendChild(nNick_tag);
		nJugador.appendChild(nPuntos_tag);
		
		
		Node nRaiz = docXML.getFirstChild();
		nRaiz.appendChild(nJugador);
	
	}
	
	public void saveData() {
		try {
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			tr.setOutputProperty(OutputKeys.METHOD, "xml");
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tr.setOutputProperty("{http://xml.apache.org/xlst}indent-amount", "4");
			
			//Enviar Documento XML al Fichero
			
			tr.transform(new DOMSource(docXML), new StreamResult(new FileOutputStream(File_Name)));
			
			
		} catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
			System.err.println("Fallo convirtiendo el XML.");
		}catch (IOException e) {
			System.err.println("Fallo escrbiendo en el archivo "+ File_Name);
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
	
}
