import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SaveToXML {
	Document dom;
	Element rootEle;
	Element e = null;
	Element r= null;
	
	DocumentBuilderFactory dbf;
	DocumentBuilder db;
	String outputFileName;
	String DL;
	String Number;
	String ChipSequenceNo;
	String ChipSerialNo;
	String ReferenceNumber;
	String Name;
	String dob;

	NodeList nodeList;
	// instance of a DocumentBuilderFactory

	public SaveToXML(String outputFileName) {
		dbf = DocumentBuilderFactory.newInstance();
		this.outputFileName = outputFileName;
		
		try {
			// use factory to get an instance of document builder
			db = dbf.newDocumentBuilder();
			// create instance of DOM
			dom = db.newDocument();
			rootEle = dom.createElement("Cards");
			dom.appendChild(rootEle);
		} catch (Exception e) {
		}
	}

	
	public void outputXMLFormat(String fileName) throws ParserConfigurationException, SAXException, IOException{
		
		String rootNode;
		Document doc;
		
		File file = new File(fileName);
		// an instance of factory that gives a document builder
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// an instance of builder to parse the specified xml file
		DocumentBuilder db = dbf.newDocumentBuilder();
		doc = db.parse(file);
		doc.getDocumentElement().normalize();
		rootNode= doc.getDocumentElement().getNodeName();
		
		nodeList = doc.getElementsByTagName("*");
	}
	
	
	public void addElement(List<String> nodeList, List<String> parameterList){
		
	}
	
/*	public void addElement(String DL, String Number, String ChipSequenceNo, String ChipSerialNo, String ReferenceNumber, String Name, String Dob ) throws FileNotFoundException {

		
		// create the root element
	
		this.ChipSequenceNo=ChipSequenceNo;
		this.ChipSerialNo=ChipSerialNo;
		this.DL=DL;
		this.dob=Dob;
		this.ReferenceNumber=ReferenceNumber;
		this.Name=Name;
		this.Number=Number;

		r = dom.createElement("Card");
		r.setAttribute("Name", DL);
		r.setAttribute("Number", Number);
		rootEle.appendChild(r);


		// create data elements and place them under root
		e = dom.createElement("Status");
		e.appendChild(dom.createTextNode("Finished"));
		r.appendChild(e);

		e = dom.createElement("ChipSequenceNo");
		e.appendChild(dom.createTextNode(this.ChipSequenceNo));
		r.appendChild(e);

		e = dom.createElement("ChipSerialNo");
		e.appendChild(dom.createTextNode(this.ChipSerialNo));
		r.appendChild(e);

		e = dom.createElement("RejectionUnit");
		e.appendChild(dom.createTextNode(" "));
		r.appendChild(e);

		e = dom.createElement("ErrorCode");
		e.appendChild(dom.createTextNode("0"));
		r.appendChild(e);

		e = dom.createElement("ErrorMessage");
		e.appendChild(dom.createTextNode(""));
		r.appendChild(e);

		e = dom.createElement("FinishedAtTime");
		e.appendChild(dom.createTextNode("2022-05-17T22:56:53.2262520+06:00"));
		r.appendChild(e);

		e = dom.createElement("LicenseId");
		e.appendChild(dom.createTextNode(" "));
		r.appendChild(e);

		e = dom.createElement("ReferenceNumber");
		e.appendChild(dom.createTextNode(this.ReferenceNumber));
		r.appendChild(e);

		e = dom.createElement("Name");
		e.appendChild(dom.createTextNode(this.Name));
		r.appendChild(e);

		e = dom.createElement("DateOfBirth");
		e.appendChild(dom.createTextNode(this.dob));
		r.appendChild(e);

		e = dom.createElement("Authority");
		e.appendChild(dom.createTextNode(" "));
		r.appendChild(e);

		e = dom.createElement("ApplicationType");
		e.appendChild(dom.createTextNode(" "));
		r.appendChild(e);
		
		
		
		try

		{
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			tr.setOutputProperty(OutputKeys.METHOD, "xml");
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-16");
			tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
			tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			// send DOM to file
			tr.transform(new DOMSource(dom), new StreamResult(new FileOutputStream(outputFileName)));

		} catch (TransformerException te) {
			System.out.println(te.getMessage());
		}

	}*/
}