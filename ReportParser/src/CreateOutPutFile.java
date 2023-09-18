import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

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

public class CreateOutPutFile {
	
	Document dom;
	String doc;
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
	String rootNodeT;
	FileWriter fw;

	NodeList nodeList;
	// instance of a DocumentBuilderFactory

	public CreateOutPutFile(String outputFileName, String doc) {
		dbf = DocumentBuilderFactory.newInstance();
		this.outputFileName = outputFileName;
		this.doc = doc;
		
		try{
			fw=new FileWriter(".\\testout.txt");    
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
/*		try {
			// use factory to get an instance of document builder
			db = dbf.newDocumentBuilder();
			// create instance of DOM
			dom = db.newDocument();
			rootEle = dom.createElement(rootNodeT);
			dom.appendChild(rootEle);
		} catch (Exception e) {
		}*/
	}
	
	public void appendChild() throws FileNotFoundException
	{
		try{
	        File text = new File(doc);
	        
	        //Creating Scanner instance to read File in Java
	        Scanner scnr = new Scanner(text);
	     
	        //Reading each line of the file using Scanner class
	        int lineNumber = 1;
	        while(scnr.hasNextLine()){
	            String line = scnr.nextLine();
	            System.out.println("line " + lineNumber + " :" + line);
	            fw.write(line);
	            fw.write("\n");
	            lineNumber++;
	        }
	        fw.close();
	        scnr.close();


		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
