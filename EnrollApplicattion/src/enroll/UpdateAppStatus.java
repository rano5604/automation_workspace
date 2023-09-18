package enroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UpdateAppStatus {
	

	String URL;
	String Pass;
	String User;
	String Pin;
	String Status;
	
	final JPanel panel = new JPanel();

	Connection myConn;
	PreparedStatement myStmt;

	public UpdateAppStatus(String url, String user, String pass) {
		this.URL = url;
		this.User = user;
		this.Pass = pass;
	}

	public void ChangeApplicationStatus(String status, String pin) throws SQLException {
		this.Pin = pin;
		this.Status = status;

		try {
			myConn = DriverManager.getConnection(URL, User, Pass);
			String dctb = "update application_form set status=? where pin=? ";
			myStmt = myConn.prepareStatement(dctb);
			myStmt.setString(1,Status);
			myStmt.setString(2,Pin);
			myStmt.executeUpdate();
			JOptionPane.showMessageDialog(panel, "Completed", Pin, 1, null);
			myStmt.close();
			myConn.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
	}

}
