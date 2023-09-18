package config;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;



public class ModifyXmlFile {
	
	String s_url;
	String l_url;
	String f_url;
	File inputFile=null;
	final JPanel panel = new JPanel();

	public void updateConfigXml(String s_url, String l_url, String f_url) {
		this.s_url=s_url;
		this.l_url=l_url;
		this.f_url=f_url;

		String path1 = "C://Program Files (x86)//TigerIT Bangladesh Ltd//BVRS Data Uploader//Configaration//";
		String path2 = "C://Program Files//TigerIT Bangladesh Ltd//BVRS Data Uploader//Configaration//";
		try {
			inputFile = new File(path1 + "Config.xml");
			
			if(!inputFile.exists()){
				inputFile = new File(path2+"Config.xml");
				if(!inputFile.exists()){
					JOptionPane.showMessageDialog(panel, "File Not Found");
				}
				else
				{
					makeChange(path2, inputFile);
				}
					
			}
			else
			{
				makeChange(path1, inputFile);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void makeChange(String filePath, File inputFile)
	{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Document doc = null;
		try {
			doc = docBuilder.parse(inputFile);
		} catch (SAXException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		Node url = doc.getElementsByTagName("url").item(0);
		NamedNodeMap attr = url.getAttributes();
		Node nodeAttr = attr.getNamedItem("link");

		if (nodeAttr.getNodeValue().contains("VoterService")) {
			nodeAttr.setNodeValue("http://"+s_url+"/service/VoterService");
		}

		Node url1 = doc.getElementsByTagName("url").item(1);
		NamedNodeMap attr1 = url1.getAttributes();
		Node nodeAttr1 = attr1.getNamedItem("link");

		if (nodeAttr1.getNodeValue().contains("LoginService")) {
			nodeAttr1.setNodeValue("http://"+l_url+"/service/LoginService");
		}

		Node url5 = doc.getElementsByTagName("url").item(5);
		NamedNodeMap attr5 = url5.getAttributes();
		Node nodeAttr5 = attr5.getNamedItem("link");

		if (nodeAttr5.getNodeValue().contains("ClientUpdate")) {
			nodeAttr5.setNodeValue("ftp://"+f_url+"/ClientUpdate/");
		}

		// write the content on console
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DOMSource source = new DOMSource(doc);
		System.out.println("-----------Modified File-----------");

		StreamResult streamResult = new StreamResult(filePath + "Config.xml");

		try {
			transformer.transform(source, streamResult);
		} catch (TransformerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StreamResult consoleResult = new StreamResult(System.out);
		try {
			transformer.transform(source, consoleResult);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}