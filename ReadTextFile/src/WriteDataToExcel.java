
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	File file;
	String fileName;
	Workbook workbook;
	Sheet sheet;
	int rowid = 0;
	FileOutputStream fos;
	boolean exists;

	public WriteDataToExcel(String fileName) throws EncryptedDocumentException, IOException {
		this.file = new File(fileName);
		exists = file.exists();

		fos = new FileOutputStream(file);
		this.workbook = new XSSFWorkbook();
		this.sheet = workbook.createSheet("Sheet1");
	}

	public void insertData(String a, String b) {
		Row row = sheet.createRow(rowid++);
		int cellnum = 0;
		Cell cell1 = row.createCell(cellnum++);
		cell1.setCellValue(a);
		Cell cell2 = row.createCell(cellnum++);
		cell2.setCellValue(b);

	}

	public void saveExcel() throws IOException {

		workbook.write(fos);
		fos.close();
	}
}