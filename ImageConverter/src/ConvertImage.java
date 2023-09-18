import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ConvertImage {
	

	public static void main(String[] args) throws IOException {
		
	   
		
		
        //String filePath = "data\\rt.wsq";
        byte[] bytes = Base64.getEncoder().encode(Files.readAllBytes(new File("data\\rt.wsq").toPath()));
        System.out.print(bytes);



    

	}

}
