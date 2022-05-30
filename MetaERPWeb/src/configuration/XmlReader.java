package configuration;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {

	private String xmlPath;
	private File xmlFile;
	private Document document;
	
	public XmlReader(String xmlPath) {
		
		setXmlPath(xmlPath);
		
		readXml();
		
	}
	
	private void readXml() {
		
		xmlFile = new File(xmlPath);
		
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder dBuilder;
        
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			document = (Document) dBuilder.parse(xmlFile);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getTagValue(String tag) throws Exception {
				
		NodeList nodes = document.getElementsByTagName(tag);
		
		if(nodes.getLength() == 0) {
			throw new Exception("Tag " + tag + " not found on " + xmlPath);
		} else if(nodes.getLength() > 1) {
			throw new Exception("One or more tags " + tag + " found on " + xmlPath);
		}
		
		Node node = nodes.item(0);
		
		return node.getTextContent();
		
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	
	public String getXmlPath() {
		return xmlPath;
	}
	
	private void setXmlPath(String xmlPath) {
		this.xmlPath = xmlPath;
	}
	
}
