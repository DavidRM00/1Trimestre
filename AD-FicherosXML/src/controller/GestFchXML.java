package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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


public class GestFchXML {
	
	
	
	
	
	/*public static void mostrarFchXML(String FileName) {
		try {
			File fch = new File(FileName);
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			
			Document docXML = dBuilder.parse(fch);
			docXML.getDocumentElement().normalize();
			
			String expression = "/game/Jugador";
			
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
			
			for (int i=0; i<nodeList.getLength(); i++) {
				Node nNode= nodeList.item(i);
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement= (Element) nNode;
					System.out.println("Jugador Número    = " + eElement.getAttribute("numero"));
					System.out.println("        Nombre    = " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("        Apellidos = " + eElement.getElementsByTagName("apellidos").item(0).getTextContent());
					System.out.println("        Nick      = " + eElement.getElementsByTagName("nick").item(0).getTextContent());
					System.out.println("        Puntos    = " + eElement.getElementsByTagName("puntos").item(0).getTextContent());
					System.out.println("");
					}
				}
			}
			
			
		catch (XPathExpressionException e) {
			System.err.println("Fallo aplicando la expresión (filtro). ");
		}
		catch (ParserConfigurationException | SAXException e) {
			System.err.println("Fallo durante el parsing. ");
		}
		catch (IOException e) {
			System.err.println("Fallo accediendo al fichero. ");
		}
		
		*/
	
	private Document docXML;
	
	
	
	public GestFchXML(String FileName) {
		try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document docXML = dBuilder.parse(FileName);
		docXML.getDocumentElement().normalize();
		}
		catch (ParserConfigurationException | SAXException e) {
			System.err.println("Fallo durante el parsing. ");
		}
		catch (IOException e) {
			System.err.println("Fallo accediendo al fichero. ");
		}
	}
	
	
	private NodeList getNodeList(String expression) {
		NodeList nodeList = null;
		try{
		XPath xPath = XPathFactory.newInstance().newXPath();
		nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
		}
		catch (XPathExpressionException e) {
			System.err.println("Fallo aplicando la expresión: " + expression);
	}
		return nodeList;
	}
	
	
	
	
	
	
	
	public  List<Jugador> getJugadores (String FileName) {
		
		List<Jugador> j = new ArrayList<Jugador>();
		
		
			
			String expression = "/game/jugador";
			NodeList nodeList = getNodeList ("/game/jugador");
			
			for (int i=0; i<nodeList.getLength(); i++) {
				Node nNode= nodeList.item(i);
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement= (Element) nNode;
					
					int numero		 = Integer.parseInt(eElement.getAttribute("numero"));
					String nombre	 = eElement.getElementsByTagName("nombre").item(0).getTextContent();
					String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
					String nick		 = eElement.getElementsByTagName("nick").item(0).getTextContent();
					int puntos		 = Integer.parseInt(eElement.getElementsByTagName("puntos").item(0).getTextContent());
					
					j.add( new Jugador(numero, nombre, apellidos, nick, puntos));
					
					}
				}	
			return j;

			}
			
			
		public List<Entrenador> getEntrenadores(){
		List<Entrenador> entrenador = new ArrayList<Entrenador>();
		
		
			
			String expression = "/game/entrenador";
			NodeList nodeList = getNodeList (expression);
			
			for (int i=0; i<nodeList.getLength(); i++) {
				Node nNode= nodeList.item(i);
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement= (Element) nNode;
					
					int colegiado		 = Integer.parseInt(eElement.getAttribute("numero"));
					
					String nombre	 = eElement.getElementsByTagName("nombre").item(0).getTextContent();
					String apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
					int edad		 = Integer.parseInt(eElement.getElementsByTagName("edad").item(0).getTextContent());
					entrenador.add(new Entrenador(colegiado,nombre,apellidos,edad));
					

					
					}
				}	
			return entrenador;

	}
		
		
			
		public void addNodeJugador(Jugador j) {
		
		//Se crea un nodo tipo element con el nombre "nombre", y quedaria así: <nombre>
		
			
			//Se crea la etiqueta jugador
		Node nNombre_tag = docXML.createElement("nombre");
			//Se crea un xcontenido: getNombre()
		Node nNombre_content = docXML.createTextNode(j.getNombre());	
			//A la etiqueta se le añade el contenido
		nNombre_tag.appendChild(nNombre_content);
			

		Node nApellidos_tag = docXML.createElement("apellidos");
		nNombre_tag.appendChild(docXML.createTextNode(j.getApellido()));
		
		
		Node nNick_tag = docXML.createElement("nick");
		nNick_tag.appendChild(docXML.createTextNode(j.getNick()));
		
		
		Node nPuntos_tag = docXML.createElement("nick").appendChild(docXML.createTextNode(j.getPuntos()));
		
		Node nJugador = docXML.createElement("jugador");
		
		((Element) nJugador).setAttribute("numero", "", + j.getNumero());
		nJugador.appendChild(nNombre_tag);
		nJugador.appendChild(nApellidos_tag);
		nJugador.appendChild(nNick_tag);
		nJugador.appendChild(nPuntos_tag);
		
		Node nRaiz = docXML.getFirstChild();
		nRaiz.appendChild(nJugador);
		
		
		}
		
	
	
	

}

