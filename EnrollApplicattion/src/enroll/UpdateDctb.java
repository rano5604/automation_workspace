package enroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UpdateDctb {
	

	String URL;
	String Pass;
	String User;
	//String dctb_no;
	ResultSet rs_app = null;
	ResultSet rs_person = null;
	String id = null;
	String authority;
	String reference_no;
	

	final JPanel panel = new JPanel();

	Connection myConn;
	PreparedStatement myStmt;
	PreparedStatement myStmt1;
	PreparedStatement myStmt2;

	public UpdateDctb(String url, String user, String pass) {
		this.URL = url;
		this.User = user;
		this.Pass = pass;
	}

	public void addDctb(String ref,String authority) throws SQLException {
		String dctb_no = null;
		String dctb_date = null;
		String applicant_name = null;
		String date_of_birth = null;
		String father_or_husband_name = null;
		String marital_status;
		
		String gender = null;
		this.authority = authority;
		this.reference_no = ref;

		try {
			myConn = DriverManager.getConnection(URL, User, Pass);
			String sql1 = "select * from application_form where pin=? and status!=?";
			myStmt = myConn.prepareStatement(sql1);
			myStmt.setString(1, reference_no);
			myStmt.setString(2, "Submitted");
			
			rs_app = myStmt.executeQuery();
			if (rs_app.isBeforeFirst()) {
				for (; rs_app.next();) {
					id = rs_app.getString("id");
					dctb_no = rs_app.getString("dtcb_no");
					dctb_date = rs_app.getString("dtcb_date");
					
				}
				
				String sql2 = "select * from person_info where pin = ?";
				myStmt1 = myConn.prepareStatement(sql2);
				myStmt1.setString(1, reference_no);
				rs_person = myStmt1.executeQuery();
				for (; rs_person.next();) {
					applicant_name = rs_person.getString("name_eng");
					date_of_birth = rs_person.getString("dob");
					marital_status = rs_person.getString("marital_status");
					gender = rs_person.getString("gender");
					if(marital_status.equals("MARRIED")&& gender.equals("FEMALE"))
					{
						father_or_husband_name = rs_person.getString("spouse_eng");
					}
					else
						father_or_husband_name = rs_person.getString("father_eng");
				}
				
				myStmt1.close();

				myStmt.close();
			}
			
			String dctb = "insert into dctb_resolution(id,dctb_no,dctb_date,authority,learner_license_no,applicant_name,date_of_birth,father_or_husband_name,vehicle_class,vehicle_class_other,telephone_no,remark,status,software_version,created_by,creation_date,last_updated_by,last_updated_on) values (?,?,?,?,'Test001',?,?,?,'LIGHT','','','','PENDING','v-03.01.63#db:v-1.0.11@en:JAYED5','jayed_ctg','2019-01-24 17:59:57','jayed_ctg','2019-01-24 17:59:57')";
			String id_dctb = UUID.randomUUID().toString();

			myStmt = myConn.prepareStatement(dctb);
			myStmt.setString(1,id_dctb);
			myStmt.setString(2,dctb_no);
			myStmt.setString(3, dctb_date);
			myStmt.setString(4, authority);
			myStmt.setString(5, applicant_name);
			myStmt.setString(6, date_of_birth);
			myStmt.setString(7, father_or_husband_name);
			myStmt.executeUpdate();
			
			JOptionPane.showMessageDialog(panel, "Completed", dctb_no, 1, null);
			myStmt.close();
			myConn.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
	}



}
