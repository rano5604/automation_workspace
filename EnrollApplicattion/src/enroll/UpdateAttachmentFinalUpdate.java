package enroll;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UpdateAttachmentFinalUpdate {
	static Connection myConn;
	static PreparedStatement myStmt;
	static PreparedStatement myStmt1;
	static PreparedStatement myStmt2;
	ResultSet rs_app = null;
	ResultSet rs_person = null;
	ResultSet rs_attachment = null;
	List<String> additional_task = new ArrayList<>();
	static String id = null;
	static String app_type = null;
	static String category = null;
	static String applicant_type = null;
	static String l_union = null;
	static String is_Foreigner = null;
	static String is_PSV = null;
	static String case_to_case = null;
	static String duplicate_reason = null;
	static FileInputStream input = null;

	static String doc_id = null;

	Statement myStmt12 = null;
			
	static String URL;
	static String User;
	static String Password;
	final JPanel panel = new JPanel();

	public UpdateAttachmentFinalUpdate(String URL, String User, String Password) {
		UpdateAttachmentFinalUpdate.URL = URL;
		UpdateAttachmentFinalUpdate.User = User;
		UpdateAttachmentFinalUpdate.Password = Password;
	}

	public void setAttachment(String reference_no) throws SQLException, IOException {
		try {
			myConn = DriverManager.getConnection(URL, User, Password);

			String sql1 = "select id,application_type_id,category,applicant_type,duplicate_reason,isLabourUnionMember,isCaseToCase,isPSV from application_form where pin=? and status!=?";
			
		   
			
			myStmt1 = myConn.prepareStatement(sql1);
			myStmt1.setString(1, reference_no);
			myStmt1.setString(2, "Submitted");

			rs_app = myStmt1.executeQuery();
			if (rs_app.isBeforeFirst()) {
				for (; rs_app.next();) {
					id = rs_app.getString("id");
					app_type = rs_app.getString("application_type_id");
					category = rs_app.getString("category");
					applicant_type = rs_app.getString("applicant_type");
					duplicate_reason = rs_app.getString("duplicate_reason");
					case_to_case = rs_app.getString("isCaseToCase");
					l_union = rs_app.getString("isLabourUnionMember");
					is_PSV = rs_app.getString("isPSV");

					String sql2 = "select is_foreigner from person_info where id = ?";
					myStmt2 = myConn.prepareStatement(sql2);
					myStmt2.setString(1, id);
					rs_person = myStmt2.executeQuery();
					for (; rs_person.next();) {
						is_Foreigner = rs_person.getString("is_foreigner");
					}
					
					myStmt2.close();
					
					String sql3 = "select operation_type from additional_operation where application_id = ?";
					myStmt2 = myConn.prepareStatement(sql3);
					myStmt2.setString(1, id);
					
					ResultSet add_task = myStmt2.executeQuery();
					for(;add_task.next();){
						additional_task.add(add_task.getString("operation_type"));
					}
				}

				// remove previous attachment
				duplicateAttachment();

				if (app_type.equals("NEW") || app_type.equals("VEHICLE_CHANGE") || app_type.equals("VEHICLE_ADD")
						|| app_type.equals("TYPE_CHANGE")) {
					
					setApplicationForm(reference_no);
					setDL(reference_no);
					setNid(reference_no);
					
					if(applicant_type.equals("GENERAL")){
						setMoneyReceipt(reference_no);
						setTest(reference_no);
					}
					if (l_union.equals("1")) {
						setLabourUnion(reference_no);
					}
					if(category.equals("NON_PROFESSIONAL")){
						setPoliceVerification(reference_no);
					}

					if (is_Foreigner.equals("Y")) {
						setPassport(reference_no);
					}
					if (case_to_case.equals("1")) {
						setCaseToCase(reference_no);
					}
					if(is_PSV.equals("1")){
						setRTC(reference_no);
					}

					JOptionPane.showMessageDialog(panel, "Completed", reference_no, 1, null);
				}
				if (app_type.equals("RENEWAL") || app_type.equals("DUPLICATE") || app_type.equals("CORRECTION")) {

					setApplicationForm(reference_no);
					setDL(reference_no);
					setNid(reference_no);
					
					if(applicant_type.equals("GENERAL")){
						setMoneyReceipt(reference_no);
						//setTest(reference_no);
					}
					if(category.equals("PROFESSIONAL") && app_type.equals("RENEWAL")){
						setTest(reference_no);
					}
					for(String task:additional_task){
						if(task.equals("RENEWAL")){
							setTest(reference_no);
						}
					}
					if (l_union.equals("1")) {
						setLabourUnion(reference_no);
					}

					if (is_Foreigner.equals("Y")) {
						setPassport(reference_no);
					}
					if (case_to_case.equals("1")) {
						setCaseToCase(reference_no);
					}
					if (duplicate_reason.equals("LOST")) {
						setGDCopy(reference_no);
					}
					if(is_PSV.equals("1")){
						setRTC(reference_no);
					}
					JOptionPane.showMessageDialog(panel, "Completed", reference_no, 1, null);
				}

				if (app_type.equals("PSV")) {

					setApplicationForm(reference_no);
					setDL(reference_no);
					setRTC(reference_no);
					setNid(reference_no);
			
					if(applicant_type.equals("GENERAL")){
						setMoneyReceipt(reference_no);
						setTest(reference_no);
					}
					if (l_union.equals("1")) {
						setLabourUnion(reference_no);
					}
					if (is_Foreigner.equals("Y")) {
						setPassport(reference_no);
					}
					if (case_to_case.equals("1")) {
						setCaseToCase(reference_no);
					}
					JOptionPane.showMessageDialog(panel, "Completed", reference_no, 1, null);
				}

				if (app_type.equals("ENDORSEMENT")) {
					setApplicationForm(reference_no);
					setDL(reference_no);
					setNid(reference_no);
					setMoneyReceipt(reference_no);
					if (is_Foreigner.equals("Y")) {
						setPassport(reference_no);
					}
					if (case_to_case.equals("1")) {
						setCaseToCase(reference_no);
					}
					JOptionPane.showMessageDialog(panel, "Completed", reference_no, 1, null);

				}
			} else {
				JOptionPane.showMessageDialog(panel, "Application Not Found For: " + reference_no, "Warning", 2);
				myStmt1.close();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		} finally {
			if (rs_app != null) {
				rs_app.close();
			}
			if (rs_person != null) {
				rs_person.close();
			}
			if (myStmt2 != null) {
				myStmt2.close();
			}
			if (myStmt1 != null) {
				close(myConn, myStmt1);
			}
		}
	}

	public void duplicateAttachment() throws SQLException {
		String sql = "select id from attach_docs where id=?";
		myStmt = myConn.prepareStatement(sql);
		myStmt.setString(1, id);
		rs_attachment = myStmt.executeQuery();

		if (rs_attachment.isBeforeFirst()) {
			String sql_delete = "delete from attach_docs where id=?";
			myStmt = myConn.prepareStatement(sql_delete);
			myStmt.setString(1, id);
			myStmt.executeUpdate();
		}
		if (myStmt != null) {
			myStmt.close();
		}

	}

	public void setDL(String reference_no) throws SQLException, IOException {
		doc_id = "DL";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Most Recent DL!");

		if (input != null) {
			input.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setMoneyReceipt(String reference_no) throws SQLException, IOException {
		doc_id = "MONEY_RECEIPT";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Money Receipt!");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setApplicationForm(String reference_no) throws SQLException, IOException {
		doc_id = "FORM";

		String sql = "insert into attach_docs (id,pin,app_id,doc_id,data,data2,data3,data4) values (?,?,?,?,?,?,?,?)";
		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		File theFile_data2 = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data2);
		myStmt.setBinaryStream(6, input);

		File theFile_data3 = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data3);
		myStmt.setBinaryStream(7, input);

		File theFile_data4 = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data4);
		myStmt.setBinaryStream(8, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Application Form Doc!");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setTest(String reference_no) throws SQLException, IOException {
		doc_id = "TEST";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Test Doc!");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setLabourUnion(String reference_no) throws SQLException, IOException {
		doc_id = "LABOUR_UNION";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Labour Union Doc!");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setCaseToCase(String reference_no) throws SQLException, IOException {
		doc_id = "CASE_TO_CASE";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Case To Case Doc");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setPassport(String reference_no) throws SQLException, IOException {
		doc_id = "PASSPORT";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully Passport Doc");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setGDCopy(String reference_no) throws SQLException, IOException {
		doc_id = "GD";

		String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

		myStmt = myConn.prepareStatement(sql);

		myStmt.setString(1, id);
		myStmt.setString(2, reference_no);
		myStmt.setString(3, app_type);
		myStmt.setString(4, doc_id);

		File theFile_data = new File("data_image\\attachment.jpg");
		input = new FileInputStream(theFile_data);
		myStmt.setBinaryStream(5, input);

		myStmt.executeUpdate();

		System.out.println("\n" + reference_no + " Completed successfully GD Copy");

		if (input != null) {
			input.close();
		}
		if (myStmt != null) {
			myStmt.close();
		}
	}

	public void setRTC(String reference_no) throws SQLException {
		doc_id = "RTC_APPROVAL";
		try {
			String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

			myStmt = myConn.prepareStatement(sql);

			myStmt.setString(1, id);
			myStmt.setString(2, reference_no);
			myStmt.setString(3, app_type);
			myStmt.setString(4, doc_id);

			File theFile_data = new File("data_image\\attachment.jpg");
			input = new FileInputStream(theFile_data);
			myStmt.setBinaryStream(5, input);

			myStmt.executeUpdate();
			System.out.println("\n" + reference_no + " Completed successfully RTC Copy");

		} catch (Exception localException) {
		} finally {

			if (myStmt != null) {
				myStmt.close();
			}
		}
	}
	
	public void setPoliceVerification(String reference_no) throws SQLException {
		doc_id = "POLICE";
		try {
			String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

			myStmt = myConn.prepareStatement(sql);

			myStmt.setString(1, id);
			myStmt.setString(2, reference_no);
			myStmt.setString(3, app_type);
			myStmt.setString(4, doc_id);

			File theFile_data = new File("data_image\\attachment.jpg");
			input = new FileInputStream(theFile_data);
			myStmt.setBinaryStream(5, input);

			myStmt.executeUpdate();
			System.out.println("\n" + reference_no + " Completed successfully Police Verification Copy");

		} catch (Exception localException) {
		} finally {

			if (myStmt != null) {
				myStmt.close();
			}
		}
	}
	
	public void setNid(String reference_no) throws SQLException {
		doc_id = "NID";
		try {
			String sql = "insert into attach_docs (id,pin,app_id, doc_id, data) values(?,?,?,?,?)";

			myStmt = myConn.prepareStatement(sql);

			myStmt.setString(1, id);
			myStmt.setString(2, reference_no);
			myStmt.setString(3, app_type);
			myStmt.setString(4, doc_id);

			File theFile_data = new File("data_image\\attachment.jpg");
			input = new FileInputStream(theFile_data);
			myStmt.setBinaryStream(5, input);

			myStmt.executeUpdate();
			System.out.println("\n" + reference_no + " Completed successfully NID Copy");

		} catch (Exception localException) {
		} finally {

			if (myStmt != null) {
				myStmt.close();
			}
		}
	}

	private static void close(Connection myConn, Statement myStmt) throws SQLException {
		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}
}
