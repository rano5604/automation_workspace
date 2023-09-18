package biometric;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Signature {

	String id = null;
	byte[] signature =null;
	Connection conn=null;
	PreparedStatement myStmt = null;
	
	final JPanel panel = new JPanel();
	
	public Signature(Connection conn, String id, byte[] signature)
	{
		this.conn = conn;
		this.id = id;
		this.signature = signature;
	}
	
	public void setSignature(){
		String sql = "update biometric set signature=? where id=?";
		
		try{
			myStmt = conn.prepareStatement(sql);
			
			myStmt.setBytes(1, signature);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
			
			if(!myStmt.isClosed()){
				myStmt.close();
			}
		}catch (Exception exc) {
			JOptionPane.showMessageDialog(panel, exc.getMessage(), "Error", 0);
		}
	}
		

}
