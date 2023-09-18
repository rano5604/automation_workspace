package enroll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class UpdateBiometric
{
  String URL;
  String User;
  String Password;
  Connection myConn = null;
  PreparedStatement myStmt = null;
  PreparedStatement myStmt1 = null;
  PreparedStatement myStmt2 = null;
  PreparedStatement myStmt3 = null;
  FileInputStream input = null;
  
  ResultSet rs = null;
  
  String id = null;
  
  final JPanel panel = new JPanel();
  
  public UpdateBiometric(String URL, String User, String Password) {
    this.URL = URL;
    this.User = User;
    this.Password = Password;
  }
  
  public void setBiometric(String reference_no) throws SQLException, IOException
  {
    try
    {
      myConn = DriverManager.getConnection(URL, User, Password);
      
      String sql1 = "select id from application_form where pin=? and status!=?";
      myStmt1 = myConn.prepareStatement(sql1);
      myStmt1.setString(1, reference_no);
      myStmt1.setString(2, "Submitted");
      
      ResultSet rs = myStmt1.executeQuery();
      while (rs.next()) {
        id = rs.getString("id");
      }
      


      String sql2 = "select id from biometric where id=?";
      myStmt2 = myConn.prepareStatement(sql2);
      myStmt2.setString(1, id);
      
      ResultSet rs2 = myStmt2.executeQuery();
      while (rs2.next()) {
        id = rs2.getString("id");
      }
      
      if (id != null)
      {
        String sql3 = "delete from biometric where id=?";
        myStmt3 = myConn.prepareStatement(sql3);
        myStmt3.setString(1, id);
        myStmt3.executeUpdate();
        //JOptionPane.showMessageDialog(panel, "Previous Bio-metric is Deleted", reference_no, 1, null);

      }
/*      else
      {
        JOptionPane.showMessageDialog(panel, "Have no previos Bio-metric Record", reference_no, 1, null);
      }*/
      
      String sql = "insert into biometric (id,pin,photo,signature,wsq_rt,minex_rt) values (?,?,?,?,?,?)";
      myStmt = myConn.prepareStatement(sql);
      
      myStmt.setString(1, id);
      myStmt.setString(2, reference_no);
      
      File theFile_photo = new File("data_image\\photo.jpg");
      input = new FileInputStream(theFile_photo);
      myStmt.setBinaryStream(3, input);
      
      File theFile_signature = new File("data_image\\signature.jpg");
      input = new FileInputStream(theFile_signature);
      myStmt.setBinaryStream(4, input);
      
      File theFile_rt = new File("data_image\\rt.wsq");
      input = new FileInputStream(theFile_rt);
      myStmt.setBinaryStream(5, input);
      
      //File theFile_minexrt = new File("data_image\\minex_rt.txt");
      //BufferedReader br = new BufferedReader(new FileReader(theFile_minexrt)); 

      String data = new String(Files.readAllBytes(Paths.get("data_image\\minex_rt.txt"))); 
      myStmt.setString(6, data);
      
      myStmt.executeUpdate();
      JOptionPane.showMessageDialog(panel, "Bio-metric Data Inserted Successfully", reference_no, 1, null);
      
      System.out.println("\n" + reference_no + " Bio-metric Completed successfully!");
    }
    catch (Exception exc) {
      JOptionPane.showMessageDialog(panel, exc.getMessage(), "Error", 0);
    } finally {
      if (input != null) {
        input.close();
      }
      if (myStmt1 != null)
      {
        myStmt1.close();
      }
      if (myStmt2 != null)
      {
        myStmt2.close();
      }
      if (myStmt3 != null)
      {
        myStmt3.close();
      }
      if (myStmt != null)
      {
        close(myConn, myStmt);
      }
    }
  }
  
  private static void close(Connection myConn, Statement myStmt)
    throws SQLException
  {
    if (myStmt != null) {
      myStmt.close();
    }
    
    if (myConn != null) {
      myConn.close();
    }
  }
}
