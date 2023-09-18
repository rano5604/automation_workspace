package enroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import util.CloseConnection;

public class DemographicData {

	String url;
	String user;
	String password;
	String newform_no;
	String id = null;
	Connection conn=null;
	PreparedStatement myStmt = null;
	String null_value = null;
	Timestamp date_time = null;
	final JPanel panel = new JPanel();
	
	public DemographicData(String url,String user, String password, String newform_no)
	{
		this.url = url;
		this.user = user;
		this.password = password;
		this.newform_no = newform_no;
		this.id =  UUID.randomUUID().toString();
		
		java.util.Date date=new java.util.Date();
		this.date_time = new java.sql.Timestamp(date.getTime());
	}
	
	public void setDemographicData(String name, String name_en, String father, String mother, String gender, String marital, 
			String occupation, String spouse, String disability, String birth, String birth_place, String religion, String district,
			String division, String rmo, String city, String upozila, String eunion, String ward, String village, String village_other,
			String area, String area_other,String house, String postoffice, String postcode, String voter_at){
		String sql = "INSERT INTO voter(id,form_no,name,name_en,father,mother,gender,marital,occupation,spouce,disability,birth,birth_place,"
				+ "religion,district,division,rmo,city,upozila,eunion,ward,village,village_other,area,area_other,house,postoffice,postcode,voter_at,"
				+ "nid_spouce,incomplete,nid_father,nid_mother,no_finger,no_fingerprint,updated_by,updated_on) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?)";
		
		
		try{
			conn = DriverManager.getConnection(url, user, password);
			myStmt = conn.prepareStatement(sql);


			myStmt.setString(1, id);
			myStmt.setString(2, newform_no);
			myStmt.setString(3, name);
			myStmt.setString(4, name_en);
			myStmt.setString(5, father);
			myStmt.setString(6, mother);
			myStmt.setString(7, gender);
			myStmt.setString(8, marital);
			myStmt.setString(9, occupation);
			myStmt.setString(10, "");
			myStmt.setString(11, disability);
			myStmt.setString(12, birth);
			myStmt.setString(13,birth_place);
			myStmt.setString(14, religion);
			myStmt.setString(15, district);
			myStmt.setString(16, division);
			myStmt.setString(17, rmo);
			myStmt.setString(18, city);
			myStmt.setString(19, upozila);
			myStmt.setString(20, eunion);
			myStmt.setString(21, ward);
			myStmt.setString(22, village);
			myStmt.setString(23, village_other);
			myStmt.setString(24, area);
			myStmt.setString(25, area_other);
			myStmt.setString(26, house);
			myStmt.setString(27, postoffice);
			myStmt.setString(28, postcode);
			myStmt.setString(29,voter_at);
			myStmt.setString(30, "");
			myStmt.setString(31, "");
			myStmt.setString(32, "");
			myStmt.setString(33, "");
			myStmt.setInt(34,0 );
			myStmt.setInt(35,0);
			myStmt.setString(36,"user_entry");
			myStmt.setTimestamp(37,date_time);
			
			myStmt.executeUpdate();
			
			if(!myStmt.isClosed()){
				myStmt.close();
			}
			CloseConnection closeConn = new CloseConnection(conn);
			closeConn.closeConnection();

		} catch (Exception exc) {
			JOptionPane.showMessageDialog(panel, exc.getMessage(), "Error", 0);
		}
	}
}
