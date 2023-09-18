import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StructureFinder {
	static Document doc;
	Document dom;
	static List<String> listTagName = new ArrayList<>();
	static List<String> listParameterName = new ArrayList<>();
	static String rootNode;
	StringBuilder content = new StringBuilder();

	public List<String> ParameterList(String fileName) {
		try {
			// creating a constructor of file class and parsing an XML file
			File file = new File(fileName);
			// an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse(file);
			doc.getDocumentElement().normalize();
			rootNode = doc.getDocumentElement().getNodeName();

			NodeList nodeList = doc.getElementsByTagName("*");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node em =  nodeList.item(i);
				listTagName.add(em.getNodeName());

				listParameterName.add(em.getTextContent());

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listParameterName;
	}
	
	
	public List<String> TagList()
	{
		return listTagName;
		
	}

/*	public void createXML() {

		DataSetCreator cr = new DataSetCreator();
		Map<String, String> dict = cr.dataSetBuilder();
		CreateXMLStructure xml = new CreateXMLStructure("c.xml", rootNode);

		try {

			for (int i = 1; i < listTagName.size(); i++) {
				NodeList n = doc.getElementsByTagName(listTagName.get(i));
				Element em = (Element) n.item(0);
				Node parent = em.getParentNode();
				if (parent != null) {
					dom = xml.createNode(parent.getNodeName(), em.getNodeName(),dict);
				}
			}
			CreateOutPutFile final_output = new CreateOutPutFile("final.txt", "c.xml");
			final_output.appendChild();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/

}
