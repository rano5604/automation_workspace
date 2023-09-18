import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DataSetCreator {


	public void  dataSetBuilder(String dataFileName, String outFormatFileName, String parentNode, String childNode) {
		Map<String, String> dict = new HashMap<>();
		try {
			// creating a constructor of file class and parsing an XML file
			File file = new File(dataFileName);
			// an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			//System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName(parentNode);

			StructureFinder sc = new StructureFinder();
			List<String> parameter = sc.ParameterList(outFormatFileName);

			WriteTextFile final_output = new WriteTextFile();

			for (int itr = 1; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);
				System.out.println(itr);
				System.out.println("\nNode Name :" + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;

					NodeList cNodeList = eElement.getElementsByTagName(childNode);

					for (int citr = 0; citr < cNodeList.getLength(); citr++) {
						Node c = cNodeList.item(citr);
						NamedNodeMap attributes = c.getAttributes();
						Node attr = attributes.getNamedItem("Name");
						if (attr != null) {

							for (int i = 0; i < parameter.size(); i++) {
								if (attr.getTextContent().contains(parameter.get(i))) {
									String name = (String) parameter.get(i);
									if (c.getTextContent() != null) {
										dict.put(name, hexToAscii(c.getTextContent()));
									}
								}
							}
						}
					}
					CreateXMLStructure cxs = new CreateXMLStructure("c.xml", "Card");
					cxs.createXML(".\\output_format.xml",dict, final_output);
					
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	private static String hexToAscii(String data) {
		String newString = new String(data);
		StringBuilder output = new StringBuilder("");
		

		for (int i = 0; i < newString.length(); i += 2) {
			String str = newString.substring(i, i + 2);
			output.append((char) Integer.parseInt(str, 16));

		}
		return output.toString().toString();
	}
}
