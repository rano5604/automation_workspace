import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CreateXMLStructure {

	Document dom;
	Element rootEle;
	Element e = null;
	Element r = null;

	DocumentBuilderFactory dbf;
	DocumentBuilder db;
	String outputFileName;

	Map<String, String> dict;

	public CreateXMLStructure(String outputFileName, String rootNode) {

		dbf = DocumentBuilderFactory.newInstance();
		this.outputFileName = outputFileName;
		try {
			// use factory to get an instance of document builder
			db = dbf.newDocumentBuilder();
			// create instance of DOM
			dom = db.newDocument();
			rootEle = dom.createElement(rootNode);
			dom.appendChild(rootEle);
			//dict = new HashMap<>();
		} catch (Exception e) {
		}
	}

	
	
	public void createXML(String fileName,Map<String, String> dict, WriteTextFile final_output) {

		StructureFinder sf = new StructureFinder();
		List<String> listTagName = sf.TagList();
		Document doc;
		try {
			File file = new File(fileName);
			// an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse(file);
			doc.getDocumentElement().normalize();

			for (int i = 1; i < listTagName.size(); i++) {
				NodeList n = doc.getElementsByTagName(listTagName.get(i));
				Element em = (Element) n.item(0);
				Node parent = em.getParentNode();
				if (parent != null) {
					createNode(parent.getNodeName(), em.getNodeName(), dict);
				}

			}
			WriteTextFile.appendText("final.txt", "c.xml");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	public Document createNode(String parentNodeName, String childNodeName, Map<String, String> dict)
			throws FileNotFoundException {

		//this.dict = (Map<String, String>) dict;
	
			// System.out.println(entry.getKey() + " = " + entry.getValue());


			try {
				if (dom.getElementsByTagName(parentNodeName) != null) {
					e = dom.createElement(childNodeName);
					NodeList r = dom.getElementsByTagName(parentNodeName);
					Node node = r.item(0);
					Element em = (Element) node;
					String key;
					String value;
					for (Map.Entry<String, String> entry : ((Map<String, String>) dict).entrySet()) {
						key = entry.getKey();
						value = entry.getValue();
						if(key.contains(childNodeName))
							e.appendChild(dom.createTextNode(value));
					}

					em.appendChild(e);
					// rootEle.appendChild(em);
				} else {
					String key = null;
					String value = null;
					r = dom.createElement(parentNodeName);
					for (Map.Entry<String, String> entry : ((Map<String, String>) dict).entrySet()) {
						if(key.contains(parentNodeName))
							r.appendChild(dom.createTextNode(value));
					}

					rootEle.appendChild(r);
					e = dom.createElement(childNodeName);
					String key1 = null;
					String value1 = null;
					r = dom.createElement(parentNodeName);
					for (Map.Entry<String, String> entry : ((Map<String, String>) dict).entrySet()) {
						if(key1.contains(childNodeName))
							e.appendChild(dom.createTextNode(value1));
					}

					r.appendChild(e);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		

		try

		{
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			tr.setOutputProperty(OutputKeys.METHOD, "xml");
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-16");

			// send DOM to file
			tr.transform(new DOMSource(dom), new StreamResult(new FileOutputStream(outputFileName)));

		} catch (TransformerException te) {
			System.out.println(te.getMessage());
		}
		return dom;

	}
}
