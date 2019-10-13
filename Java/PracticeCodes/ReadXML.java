package PracticeCodes;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void display() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(".//Java//PracticeCodes//pom.xml");
		XPath xp=XPathFactory.newInstance().newXPath();
		NodeList n = (NodeList) xp.compile("//dependency").evaluate(doc, XPathConstants.NODESET);
		System.out.println("No of Dependencies :"+n.getLength());
		System.out.println("=============================");
		for (int i = 0; i < n.getLength(); i++) {
			System.out.println("Group ID: "+xp.compile("./groupId").evaluate(n.item(i)));
			System.out.println("Artifact ID: "+xp.compile("./artifactId").evaluate(n.item(i)));
			System.out.println("Version: "+xp.compile("./version").evaluate(n.item(i)));
			System.out.println("=============================");
		}
	}
	
	public static void main(String[] args) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		display();
	}
}
