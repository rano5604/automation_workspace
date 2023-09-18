import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OutputFileFormat {
	static Document doc;
	static List<String> list = new ArrayList<>();
	static String rootNode;
	public static void main(String argv[]) {
		try {
			// creating a constructor of file class and parsing an XML file
			File file = new File(".\\OutputFormat.XML");
			// an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse(file);
			doc.getDocumentElement().normalize();
			rootNode= doc.getDocumentElement().getNodeName();
			
			CreateXMLStructure xml = new CreateXMLStructure("c.xml", rootNode);
			
			NodeList nodeList = doc.getElementsByTagName("*");
			
			
			
			for(int i=0;i<nodeList.getLength();i++){
				Element em = (Element) nodeList.item(i);
				list.add(em.getNodeName());
			}
			
			for(int i=1;i<list.size();i++){
				NodeList n = doc.getElementsByTagName(list.get(i));
				Element em = (Element) n.item(0);
				Node parent = em.getParentNode();
				if(parent!=null){
					//xml.createNode(parent.getNodeName(), em.getNodeName());
				}		
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
