import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;



public class WriteTextFile {

	public static void appendText(String outputFileName, String inputFileName) throws IOException {

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
        File text = new File(inputFileName);
        
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
        
		try {
			fw = new FileWriter(outputFileName, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
	    
	        while(scnr.hasNextLine()){
	            String line = scnr.nextLine();
	            System.out.println(line);
	            pw.println(line);

	        }
	        pw.flush();
	        
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
				scnr.close();
			} catch (IOException io) {// can't do anything } } }
			}
		}

	}

}