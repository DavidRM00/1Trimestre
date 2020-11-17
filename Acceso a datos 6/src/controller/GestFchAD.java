package controller;

import java.io.File;
import java.io.IOException;

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

public class GestFchAD {

	public static void mostrarFchXML(String FileName) {
		
		try {
			
			File fch = new File(FileName);
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document docXML = dBuilder.parse(fch);
			docXML.getDocumentElement().normalize();
			
			String expression = "/game/jugador";
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(docXML, XPathConstants.NODESET);
			
			for (int i=0; i<nodeList.getLength(); i++) {
				
				Node nNode = nodeList.item(i);
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Jugador Número = " + eElement.getAttribute("numero"));
					System.out.println("        Nombre = " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("     Apellidos = " + eElement.getElementsByTagName("apellidos").item(0).getTextContent());
					System.out.println("          Nick = " + eElement.getElementsByTagName("nick").item(0).getTextContent());
					System.out.println("        Puntos = " + eElement.getElementsByTagName("puntos").item(0).getTextContent());
				}
			}
			
		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresión (filtro).");
		} catch (ParserConfigurationException | SAXException e) {
			System.err.println("Fallo durante el parsing.");
		} catch (IOException e) {
			System.err.println("Fallo accediendo al fichero.");
		}
		
	}

}
