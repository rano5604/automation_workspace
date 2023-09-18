package test.com;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath){
		
		File src = new File(excelPath);
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	public String getData(int sheetNo, int row, int column){
		
		sheet = wb.getSheetAt(sheetNo);
		Cell cellValue = sheet.getRow(row).getCell(column);
		
		String Data = cellValue.toString();
		
		//String Data = sheet.getRow(row).getCell(column).getStringCellValue();
		
		return Data;
		
	}
	
	
	public int getRowCount(int sheetIndex){
		int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum();
		
		rowCount=rowCount+1;
		return rowCount;
		
	}
	public int getColumnCount(int sheetIndex, int row){
		sheet = wb.getSheetAt(sheetIndex);
		int columnCount = sheet.getRow(row).getLastCellNum();
		return columnCount;
		
	}

}
