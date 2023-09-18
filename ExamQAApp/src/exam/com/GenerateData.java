package exam.com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;




public class GenerateData {
	String source_path;
	String destination_path;
	String index;
	int count;
	final JPanel panel = new JPanel();
	
	public GenerateData(String s_path, String d_path,String startIndex,int number)
	{
		this.source_path = s_path;
		this.destination_path = d_path;
		this.index = startIndex;
		this.count = number;
	}
	

	
    public void DataGenerator() throws IOException
    {
    	File sourceFolder = new File(source_path);
    	File[] listOfFiles = sourceFolder.listFiles();

    	    	
    	File destinationFolder = new File(destination_path);

    	if (!destinationFolder.exists()) {
    	    System.out.println("creating directory: " + destinationFolder.getName());
    	    boolean result1 = false;

    	    try{
    	    	destinationFolder.mkdir();
    	        result1 = true;
    	    } 
    	    catch(SecurityException se){
    	        //handle it
    	    }        
    	    if(result1) {    
    	       // System.out.println("DIR created");  
    	    }
    	}
    	
    	String s_index=index.substring(2,index.length());
    	String suffix = index.substring(0,2);
    	int start = Integer.parseInt(s_index);
    	System.out.println((start+count));
    	if(destinationFolder.exists()){
    		String path3 = destinationFolder.getPath();
    		 boolean result2 = false;
    		if(count>=10 && count<=50){
    	         JOptionPane.showMessageDialog(DataGeneratorGUI.panel, "are you sure you want to generate "+count+" folder in the destination path?Please check your disk space before doing that", "Error",  0);
    		}
    		 if (count>99){
    			 count=98;
    		 }
    		for(int i=start;i<(start+count+1);i++)
    		{
    			String path4 = path3+"//"+suffix+i;
    			File childFolder = new File(path4);

    			try{
    				childFolder.mkdir();
    				result2 = true;
    				
    				for (int j = 0; j < listOfFiles.length; j++) {
    					File F = new File(path4+"//"+listOfFiles[j].getName());
    					String Name = F.getName();
    					
    					
    					String extension = (Name.substring(Name.length()-4));
    				    String newName = (Name.substring(0,9).replace(Name.substring(0,9), childFolder.getName()));
    					String bio = Name.replace(extension, "").replace(Name.subSequence(0, 9), "");
    				    newName = newName+bio+extension;
    					
    					
    					//System.out.println(newName);
    					File FF = new File(path4+"//"+newName);


	
    			    	  if (listOfFiles[j].isFile()) {
    			    		  FileUtils.copyFile(listOfFiles[j], FF);
    			    	  }
    			    	  

    		
    			    	  //String p1 = txtFile[3];
    			    	  //System.out.println(p1);

    				}
    			}
    			
    			catch(SecurityException se)
    			{
    				
    			}
        	    if(result2) {    
        	       // System.out.println("DIR created");  
        	    }
        	    
		    	  String content = IOUtils.toString(new FileInputStream(path4+"//"+childFolder.getName()+".txt"), "UTF-8");
		    	  String[] txtFile = content.split("\\|");
		    	  
		    	  String nid_no=nidGenerator.getNID(13);

		    	  
		    	  content = content.replaceAll(txtFile[0],childFolder.getName() );
		    	  content = content.replaceAll(txtFile[3],nid_no );
		    	  content = content.replaceAll(txtFile[10],"");
		    	  content = content.replaceAll("\\|", "\r\n");
		    	  IOUtils.write(content, new FileOutputStream(path4+"//"+childFolder.getName()+".txt"),"UTF-8");
        	    
    		}
    	}
    
    }

}