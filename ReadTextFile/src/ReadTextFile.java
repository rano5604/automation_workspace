
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {

		
		Charset charset = Charset.forName("UTF-8");
		PrintWriter pw = new PrintWriter(".\\file.txt");

		//Path path = FileSystems.getDefault().getPath("C:\\Users\\Rano\\Downloads\\Dhanmondi\\RFID_Data_04-11-2022.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rano\\Downloads\\Dhanmondi\\RFID_Data_04-11-2022.txt"));

		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		br.close();
		
		//path = FileSystems.getDefault().getPath("C:\\Users\\Rano\\Downloads\\Dhanmondi\\RFID_Data_05-11-2022.txt");
		br = new BufferedReader(new FileReader("C:\\Users\\Rano\\Downloads\\Dhanmondi\\RFID_Data_05-11-2022.txt"));

		line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		pw.flush();

		// closing resources
		br.close();
		pw.close();

		Path path1 = FileSystems.getDefault().getPath(".\\file.txt");
		

		BufferedReader br1 = Files.newBufferedReader(path1, charset);

		String st;

		WriteDataToExcel excel = new WriteDataToExcel(".\\excel.xlsx");
		while ((st = br1.readLine()) != null) {

			String[] x = st.split("\\|");
			excel.insertData(x[0], x[1]);
		}
		excel.saveExcel();

	}

}