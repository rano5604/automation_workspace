package biometric;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewImage {
	
	String URL;
	String User;
	String Password;
	Connection myConn = null;
	byte[] photo = null;
	
	PreparedStatement myStmt;
	ResultSet rs = null;
	
	
	final JPanel panel = new JPanel();
	
	public ViewImage(String URL, String User, String Password) {
		this.URL = URL;
		this.User = User;
		this.Password = Password;
	}

	
	public void viewImage(String old_no) throws SQLException {
		
		String sql = "select * from biometric where pin=?";
		try {
			myConn = DriverManager.getConnection(URL, User, Password);
			myStmt = myConn.prepareStatement(sql);

			myStmt.setString(1, old_no);

			rs = myStmt.executeQuery();

			if (rs.next()) {
				photo = rs.getBytes("photo");
				try{
					if(photo!=null)
					{	
						ByteArrayInputStream bis = new ByteArrayInputStream(photo);
						BufferedImage image = null;

						image = ImageIO.read(bis);

						JFrame frame = new JFrame();
						ImageIcon icon = new ImageIcon(image);
						frame.add(new JLabel(icon));
						frame.pack();
						frame.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(panel,"No Photo Found");
				}catch (Exception e) {
					JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
				}
						
			}else{
				JOptionPane.showMessageDialog(panel,"Form No is Missing");
			}
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
		finally {

			if (myStmt != null) {
			
					close(myConn, myStmt);	
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
