package test.com;

public class ReadExcel {
	
	public static void main(String[] arg){
		
	
		ExcelDataConfig excelData = new ExcelDataConfig("E:\\Project\\HSDL_Project_Work\\Backup_database\\t.xlsx");

		int rows=excelData.getRowCount(0);
		rows = rows-1;
		int columns = excelData.getColumnCount(0, 0);
		Object[][] data = new Object[rows][columns];
		for(int i=0; i<rows;i++ ){
			for(int j=0;j<columns;j++){
				data[i][j]=excelData.getData(0, (i+1), j);
				System.out.println(data[i][j]);
				
			}
		}	
		
	}

}
