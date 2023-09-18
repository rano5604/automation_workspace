package biometric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import util.CloseConnection;

public class PickBioData {

	Connection myConn = null;
	String url;
	String user;
	String pass;
	PreparedStatement myStmt = null;
	final JPanel panel = new JPanel();
	
	byte[] photo = null;
	byte[] signature = null;
	byte[] wsq_ri = null;
	byte[] minex_ri = null;
	
	byte[] doc_proof_copy = null;
	byte[] doc_form_p1 = null;
	byte[] doc_form_p2 = null;
	byte[] doc_birth_certificate = null;
	byte[] doc_passport = null;
	byte[] doc_special_p1 = null;
	byte[] doc_special_p2 = null;
	byte[] field1 = null;
	byte[] field2 = null;
	byte[] doc_migration_p1 = null;
	byte[] doc_migration_p2 = null;
	byte[] doc_ssc = null;
	
	
	byte[] wsq_rt = null;
	byte[] wsq_lt = null;
	byte[] wsq_li = null;
	byte[] minex_rt = null;
	byte[] minex_lt = null;
	byte[] minex_li = null;
	byte[] wsq_rm = null;
	byte[] wsq_rr = null;
	byte[] wsq_rl = null;
	byte[] wsq_lm = null;
	byte[] wsq_lr = null;
	byte[] wsq_ll = null;
	byte[] minex_rm = null;
	byte[] minex_rl = null;
	byte[] minex_lm = null;
	byte[] minex_rr = null;
	byte[] minex_lr = null;
	byte[] minex_ll = null;
	byte[] re = null;
	byte[] le = null;
	String quality_ri = null;
	String quality_rt = null;
	String quality_lt = null;
	String quality_li = null;
	String quality_rm = null;
	String quality_rr = null;
	String quality_rl = null;
	String quality_lm = null;
	String quality_lr = null;
	String quality_ll = null;
	
	public PickBioData(String url, String user, String pass) {
		this.user = user;
		this.url = url;
		this.pass = pass;
	}
	
	public void pickValues(String oldform_no)
	{
		String sql = "select * from biometric where pin=?";
		try {
			myConn = DriverManager.getConnection(url, user, pass);
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, oldform_no);
			
			ResultSet rs = myStmt.executeQuery();
			while (rs.next()) {
				photo = rs.getBytes("photo");
				signature = rs.getBytes("signature");
				wsq_ri = rs.getBytes("wsq_ri");
				minex_ri = rs.getBytes("minex_ri");
				quality_ri = rs.getString("quality_ri");
				doc_proof_copy = rs.getBytes("doc_proof_copy");
				doc_form_p1 = rs.getBytes("doc_form_p1");
				doc_form_p2 = rs.getBytes("doc_form_p2");
				wsq_rt = rs.getBytes("wsq_rt");
				wsq_lt = rs.getBytes("wsq_lt");
				wsq_li = rs.getBytes("wsq_li");
				minex_rt = rs.getBytes("minex_rt");
				minex_lt = rs.getBytes("minex_lt");
				minex_li = rs.getBytes("minex_li");
				quality_rt = rs.getString("quality_rt");
				quality_lt = rs.getString("quality_lt");
				quality_li = rs.getString("quality_li");
				wsq_rm = rs.getBytes("wsq_rm");
				wsq_rr = rs.getBytes("wsq_rr");
				wsq_rl = rs.getBytes("wsq_rl");
				wsq_lm = rs.getBytes("wsq_lm");
				wsq_lr = rs.getBytes("wsq_lr");
				wsq_ll = rs.getBytes("wsq_ll");
				minex_rm = rs.getBytes("minex_rm");
				minex_rr = rs.getBytes("minex_rr");
				minex_rl = rs.getBytes("minex_rl");
				minex_lm = rs.getBytes("minex_lm");
				minex_lr = rs.getBytes("minex_lr");
				minex_ll = rs.getBytes("minex_ll");
				quality_rm = rs.getString("quality_rm");
				quality_rr = rs.getString("quality_rr");
				quality_rl = rs.getString("quality_rl");
				quality_lm = rs.getString("quality_lm");
				quality_lr = rs.getString("quality_lr");
				quality_ll = rs.getString("quality_ll");
				re = rs.getBytes("re");
				le = rs.getBytes("le");
				
				doc_proof_copy = rs.getBytes("doc_proof_copy");
				doc_form_p1 = rs.getBytes("doc_form_p1");
				doc_form_p2 = rs.getBytes("doc_form_p2");
				doc_birth_certificate = rs.getBytes("doc_birth_certificate");
				doc_passport = rs.getBytes("doc_passport");
				doc_special_p1 = rs.getBytes("doc_special_p1");
				doc_special_p2 = rs.getBytes("doc_special_p2");
				field1 = rs.getBytes("field1");
				field2 = rs.getBytes("field2");
				doc_migration_p1 = rs.getBytes("doc_migration_p1");
				doc_migration_p2 = rs.getBytes("doc_migration_p2");
				doc_ssc = rs.getBytes("doc_ssc");	

			}
			if(!myStmt.isClosed()){
				myStmt.close();
			}
			CloseConnection closeConn = new CloseConnection(myConn);
			closeConn.closeConnection();
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
		
	}

}
