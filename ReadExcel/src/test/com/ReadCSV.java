package test.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ReadCSV {
	static QueryBuilder qb;
	private static final String SAMPLE_CSV_FILE_PATH = "E:\\Project\\HSDL_Project_Work\\Backup_database\\hsdl_item_details-14Mar2022.csv";

	public static void main(String[] args) throws IOException, SQLException {

	
		try (Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));

			CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);) {
			FileWriter fw = null;
			BufferedWriter bw = null;
			PrintWriter pw = null;
			fw = new FileWriter("item_detail.txt", true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
/*			String query = "INSERT INTO HSDL_APPLIATION(ID,REFERENCE_NUMBER,LICENSE_NUMBER_EN,APPLICATION_STATUS,CARD_STATUS,AFIS_STATUS,STATUS,ISSUE_DATE,EXPIRY_DATE)"
					+ "VALUES({ID},{REFERENCE_NUMBER},{LICENSE_NUMBER_EN},{APPLICATION_STATUS},{CARD_STATUS},{AFIS_STATUS},{STATUS},TO_DATE({ISSUE_DATE},'DD-MON-YYYY HH12: MI:SS:FF AM'),"
					+ "TO_DATE({EXPIRY_DATE},'DD-MON-YYYY HH12: MI:SS:FF AM'));";*/
			
			
/*			String query="UPDATE HSDL_APPLICATION SET REFERENCE_NUMBER={REFERENCE_NUMBER},LICENSE_NUMBER_EN={LICENSE_NUMBER_EN},"
					+ "APPLICATION_STATUS={APPLICATION_STATUS},"
					+ "CARD_STATUS={CARD_STATUS},AFIS_STATUS={AFIS_STATUS},"
					+ "ISSUE_DATE=to_timestamp({ISSUE_DATE},'DD-MON-YYYY HH12: MI:SS:FF AM'),EXPIRY_DATE=to_timestamp({EXPIRY_DATE},"
					+ "'DD-MON-YYYY HH12: MI:SS:FF AM'),STATUS={STATUS} WHERE ID={ID};";*/
			String query="Insert into HSDL_ITEM_DETAILS (ID,BOX_ID,ITEM_STATUS,CREATED_BY,CREATION_DATE,LAST_UPDATED_BY,LAST_UPDATE_DATE,VERSION_ID,STATUS,ITEM_SERIAL_NUMBER,ITEM_NO,DL_TYPE) "
					+ "values ({ID},{BOX_ID},{ITEM_STATUS},{CREATED_BY},to_timestamp({CREATION_DATE},'DD-MON-RR HH.MI.SSXFF AM'),{LAST_UPDATED_BY},to_timestamp({LAST_UPDATE_DATE},'DD-MON-RR HH.MI.SSXFF AM'),"
					+ "{VERSION_ID},{STATUS},{ITEM_SERIAL_NUMBER},{ITEM_NO},{DL_TYPE});";
			
			String final_query = null;

			for (CSVRecord csvRecord : csvParser) {
				if(csvRecord.getRecordNumber()==1){
					qb = new QueryBuilder(query, csvRecord);
					qb.parameterMatcher();
				}
				if(csvRecord.getRecordNumber()>1)
					final_query=qb.buildQuery(query,csvRecord);

					

				try {

					pw.println(final_query);
					pw.flush();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (IOException io) {// can't do anything } } }
			}
		}
	}
}
