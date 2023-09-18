package biometric;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GetIdNo {
	Connection conn=null;
	PreparedStatement myStmt = null;
	String url;
	String user;
	String pass;
	
	String id = null;
	String newform_no;
	final JPanel panel = new JPanel();
	
	public GetIdNo(Connection conn, String newform_no){

		this.conn = conn;
		this.newform_no = newform_no;
	}
	
	public String getId(){
		try {
			String sql = "select id from voter where form_no =?";
			myStmt = conn.prepareStatement(sql);
			myStmt.setString(1, newform_no);

			ResultSet rs = myStmt.executeQuery();
			while (rs.next()) {
				id = rs.getString("id");
			}

			String sql2 = "select id from biometric where id=?";
			myStmt = conn.prepareStatement(sql2);
			myStmt.setString(1, id);

			ResultSet rs2 = myStmt.executeQuery();
			while (rs2.next()) {
				id = rs2.getString("id");
			}

			if (id != null) {
				String sql3 = "delete from biometric where id=?";
				myStmt = conn.prepareStatement(sql3);
				myStmt.setString(1, id);
				myStmt.executeUpdate();
				
				String sql4 = "insert into biometric (id,pin) values(?,?)";
				myStmt = conn.prepareStatement(sql4);
				myStmt.setString(1, id);
				myStmt.setString(2, newform_no);
				myStmt.executeUpdate();

			}
			else
			{

				JOptionPane.showMessageDialog(panel,"Form No is Missing");
			}
			
			
			if(!myStmt.isClosed()){
				myStmt.close();
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
		return id;
	}
}
