package biometric;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Attachment {

	String newform_no;
	String id = null;
	Connection conn=null;
	PreparedStatement myStmt = null;
	
	final JPanel panel = new JPanel();
	
	public Attachment(Connection conn,String id)
	{
		this.conn = conn;
		this.id = id;
	}
	
	//PickBioData bd = new PickBioData(conn);
	//GetIdNo id = new GetIdNo(conn,newform_no);
	
	public void setAttachment(byte[] doc_form_p1,byte[] doc_form_p2,byte[] doc_birth_certificate,byte[] doc_passport,byte[] doc_special_p1,
			byte[] doc_special_p2,byte[] field1,byte[] field2,byte[] doc_migration_p1,byte[] doc_migration_p2,byte[] doc_proof_copy,byte[] doc_ssc){
		
		String sql = "update biometric set doc_form_p1=?,doc_form_p2=?,doc_birth_certificate=?,doc_passport=?,doc_special_p1=?,"
				+ "doc_special_p2=?,field1=?,field2=?,doc_migration_p1=?,doc_migration_p2=?,doc_proof_copy=?,doc_ssc=? where id=?";
		
		try{
			myStmt = conn.prepareStatement(sql);


			myStmt.setBytes(1, doc_form_p1);
			myStmt.setBytes(2, doc_form_p2);
			myStmt.setBytes(3, doc_birth_certificate);
			myStmt.setBytes(4, doc_passport);
			myStmt.setBytes(5, doc_special_p1);
			myStmt.setBytes(6, doc_special_p2);
			myStmt.setBytes(7, field1);
			myStmt.setBytes(8, field2);
			myStmt.setBytes(9, doc_migration_p1);
			myStmt.setBytes(10, doc_migration_p2);
			myStmt.setBytes(11, doc_proof_copy);
			myStmt.setBytes(12, doc_ssc);

			myStmt.setString(13,id);
			
			myStmt.executeUpdate();
			
			if(!myStmt.isClosed()){
				myStmt.close();
			}
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(panel, exc.getMessage(), "Error", 0);
		}
	}
	

}









