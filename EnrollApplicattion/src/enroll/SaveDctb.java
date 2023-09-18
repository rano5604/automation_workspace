package enroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SaveDctb {
	

	String URL;
	String Pass;
	String User;
	String dctb_no;
	String app_type;
	String dctb_date;
	String authority;

	final JPanel panel = new JPanel();

	Connection myConn;
	PreparedStatement myStmt;

	public SaveDctb(String url, String user, String pass) {
		this.URL = url;
		this.User = user;
		this.Pass = pass;
	}

	public void UpdateDctb(String dc_no,String dc_date, String app_type,String auth) throws SQLException {
		this.dctb_no = dc_no;
		this.app_type = app_type;
		this.dctb_date = dc_date;
		this.authority = auth;
		if(app_type.equals("RENEWAL"))
			dctb_no=dctb_no+"R";
		try {
			myConn = DriverManager.getConnection(URL, User, Pass);
			String id = UUID.randomUUID().toString();
			String dctb = "insert into dctb_resolution(id,dctb_no,dctb_date,authority,learner_license_no,applicant_name,date_of_birth,father_or_husband_name,vehicle_class,vehicle_class_other,telephone_no,remark,status,software_version,created_by,creation_date,last_updated_by,last_updated_on) values (?,?,?,?,'Test001','Jayed Ibrahim','1950-01-01 00:00:00','Father Name','LIGHT','','','','PENDING','v-03.01.63#db:v-1.0.11@en:JAYED5','jayed_ctg','2019-01-24 17:59:57','jayed_ctg','2019-01-24 17:59:57')";
			myStmt = myConn.prepareStatement(dctb);
			myStmt.setString(1,id);
			myStmt.setString(2,dctb_no);
			myStmt.setString(3, dctb_date);
			myStmt.setString(4, authority);
			myStmt.executeUpdate();
			JOptionPane.showMessageDialog(panel, "Completed", dctb_no, 1, null);
			myStmt.close();
			myConn.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
	}



}
