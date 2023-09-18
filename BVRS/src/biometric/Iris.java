package biometric;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Iris {

	String id = null;
	byte[] iris_re =null;
	byte[] iris_le =null;
	Connection conn=null;
	PreparedStatement myStmt = null;
	
	final JPanel panel = new JPanel();
	
	public Iris(Connection conn, String id, byte[] iris_re,byte[] iris_le)
	{
		this.conn = conn;
		this.id = id;
		this.iris_re = iris_re;
		this.iris_le = iris_le;
	}
	
	public void setSignature(){
		String sql = "update biometric set re=?,le=? where id=?";
		
		try{
			myStmt = conn.prepareStatement(sql);
			
			myStmt.setBytes(1, iris_re);
			myStmt.setBytes(2, iris_le);
			myStmt.setString(3, id);
			myStmt.executeUpdate();
			
			if(!myStmt.isClosed()){
				myStmt.close();
			}
			
		}catch (Exception exc) {
			JOptionPane.showMessageDialog(panel, exc.getMessage(), "Error", 0);
		}
	}
		

}
