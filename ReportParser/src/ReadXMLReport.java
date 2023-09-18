import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadXMLReport {
	static String LicenseNoEn;
	static String ReferenceNo;
	static String NameEn;
	static String ChipSerialNo;
	static String ChipSequenceNo;
	static String BirthDateEn;
	static int count = 0;
	static String number;


	public static void main(String argv[]) {
	
		String dataFileName = ".\\Report_93312_39885_2022_05_23_07_08_23.xml";
		String outFormatFileName = ".\\output_format.xml";
		String parentNode = "DataFields";
		String childNode = "DataField";
		DataSetCreator cr = new DataSetCreator();
		cr.dataSetBuilder(dataFileName, outFormatFileName, parentNode, childNode);
		
	}
}
