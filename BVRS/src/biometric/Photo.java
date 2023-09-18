package biometric;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Photo {
	
	String id = null;
	byte[] photo =null;
	Connection conn=null;
	PreparedStatement myStmt = null;
	
	final JPanel panel = new JPanel();
	
	public Photo(Connection conn, String id, byte[] photo)
	{
		this.conn = conn;
		this.id = id;
		this.photo = photo;
	}
	
	public void setPhoto(){
		String sql = "update biometric set photo=? where id=?";
		
		try{
			myStmt = conn.prepareStatement(sql);
			
			myStmt.setBytes(1, photo);
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
