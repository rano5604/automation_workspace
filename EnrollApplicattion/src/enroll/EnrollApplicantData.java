package enroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EnrollApplicantData {

	String URL;
	String Pass;
	String User;
	String Pin;
	String Dctb_no;
	String App_type;
	String Authority;

	final JPanel panel = new JPanel();

	Connection myConn;
	PreparedStatement myStmt;

	public EnrollApplicantData(String url, String user, String pass) {
		this.URL = url;
		this.User = user;
		this.Pass = pass;
	}

	public void SaveApplicantData(String pin, String dctb, String app_type, String authority) throws SQLException {
		this.Pin = pin;
		this.Dctb_no = dctb;
		this.App_type = app_type;
		this.Authority = authority;
		
		if(app_type.equals("RENEWAL"))
			Dctb_no = Dctb_no+"R";
		try {
			myConn = DriverManager.getConnection(URL, User, Pass);
			String id = UUID.randomUUID().toString();
			String app_form = "insert into application_form(id,pin,ref_date,serial_no,scroll_no,brta_office_id,most_recent_license_no,application_type_id,category,language,source,vehicle_class,other_vehicle_class,prev_vehicle_class,prev_other_vehicle_class,duplicate_reason,other_duplicate_reason,apply_date,receive_date,delivering_post_office,instructor_id,instructor_name,instructor_license_no,bank_transaction_id,verified_by,application_status,system_flag,status,created_by,creation_date,last_update_by,last_update_date,object_version_id,station_id,verifier_designation,verify_date,authorized_by,auth_date,applicant_type,most_recent_license_issue_date,most_recent_license_expire_date,most_recent_license_issuing_auth,lock_record,dtcb_no,dtcb_date,isPSV,isLabourUnionMember,local_proofcheck_by,local_proofcheck_on,submitted_by,submitted_on,server_app_id,software_version,isCaseToCase,pre_enroll_id,additional_vehicle_class,additional_other_vehicle_class,isRelaxAge) values (?,?,'2019-02-02 00:00:00','','',?,'MDL0006',?,'PROFESSIONAL','ENGLISH','BRTA','LIGHT','','','','','','2019-01-24 00:00:00','2019-01-24 00:00:00',null,null,null,'','','Jayed','','0','Incomplete','jayed_ctg','2019-01-24 15:15:04','jayed_ctg','2019-01-24 15:15:04',null,'DKN','OFFICER','2018-01-01 00:00:00','Ibrahim','2018-01-01 00:00:00','GENERAL',null,null,'',0,?,'2019-01-01 00:00:00','0','0',null,null,null,null,null,'v-03.01.63#db:v-1.0.11@en:JAYED5','0',null,'','','0')";
			String person = "insert into person_info(id,pin,nid,birth_cert_no,dob,name_eng,name_ben,gender,father_eng,father_ben,mother_eng,mother_ben,marital_status,spouse_eng,spouse_ben,occupation,occupation_other,blood_group,nationality,is_foreigner,foreign_citizen,per_zila,per_upozila,per_eunion,per_po,per_house_eng,per_house_ben,zila,upozila,eunion,po,house_eng,house_ben,mail_zila,mail_upozila,mail_eunion,mail_po,mail_house,mail_contact_home,mail_contact_mobile,mail_contact_office,mail_contact_email,emergency_contact_name,emergency_contact_relation,emergency_contact_no,emergency_contact_email,foreign_house,foreign_street,foreign_po,foreign_town,foreign_state,foreign_country,foreign_dl_no,foreign_passport,foreign_social_security_no,no_finger,no_fingerprint) values (?,?,'','','1950-01-01 00:00:00','Jayed Ibrahim','','MALE','Father Name','','Mother Name','','UNMARRIED','','','Pvt Service','','B+','BD','N','','26','',null,'','94','','26','',null,'','94','',null,null,null,null,null,'','01917858019','','','','','','','','','','','','','','','',0,0)";
			myStmt = myConn.prepareStatement(app_form);
			myStmt.setString(1, id);
			myStmt.setString(2, Pin);
			myStmt.setString(3, Authority);
			myStmt.setString(4, App_type);
/*			
			if(!app_type.equals("NEW"))
				myStmt.setString(4, "1");
			else
				myStmt.setString(4, "0");*/
			
			myStmt.setString(5, Dctb_no);
			myStmt.executeUpdate();
			myStmt.close();
			myStmt = myConn.prepareStatement(person);
			myStmt.setString(1, id);
			myStmt.setString(2, Pin);
			myStmt.executeUpdate();
			JOptionPane.showMessageDialog(panel, "Completed", Pin, 1, null);
			myStmt.close();
			myConn.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
	}
}
