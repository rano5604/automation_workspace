package enroll;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class EnrollForm {

	static final JPanel panel = new JPanel();
	  
	  public EnrollForm() {}
	  
	  public static void main(String[] args) { JFrame frame = new JFrame("Save Applicant Draft Data");
	    frame.setSize(400, 250);
	    frame.setDefaultCloseOperation(3);
	    
	    Container container = frame.getContentPane();
	    container.setLayout(new GridLayout(0, 2));
	    
	    JTextField db_url = new JTextField("192.168.1.201");
	    db_url.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField db_name = new JTextField("brta_old");
	    db_name.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField db_user = new JTextField("root");
	    db_user.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField db_pass = new JPasswordField();
	    db_pass.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField reference_no = new JTextField();
	    reference_no.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField authority = new JTextField("DKN");
	    authority.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField dctb_no = new JTextField();
	    dctb_no.setPreferredSize(new Dimension(100, 10));
	    
	    final JTextField dctb_date = new JTextField("2019/01/01");
	    dctb_date.setPreferredSize(new Dimension(100, 10));
	    
	    String[] app_type = new String[] {"","NEW", "DUPLICATE", "RENEWAL", "VEHICLE_CHANGE", "VEHICLE_ADD","TYPE_CHANGE","PSV","CORRECTION","ENDORSEMENT"};
	    JComboBox<String> app_type_combo = new JComboBox<String>(app_type);
	    
	    String[] app_status = new String[] {"","Incomplete", "Operator Final", "Complete"};
	    JComboBox<String> app_status_combo = new JComboBox<String>(app_status);

	    JLabel DB_URL = new JLabel("DB URL");
	    JLabel DB_NAME = new JLabel("DB NAME");
	    JLabel DB_USER = new JLabel("DB USER");
	    JLabel DB_PASS = new JLabel("DB PASSWORD");
	    JLabel AUTHORITY = new JLabel("Authority");
	    JLabel Reference = new JLabel("Reference No");
	    JLabel Dctb = new JLabel("DCTB No");
	    JLabel Dctb_Date = new JLabel("DCTB Date");
	    JLabel Update_Dctb = new JLabel("ADD DCTB OLD APP");
	    
	    JLabel App_Type = new JLabel("Application Type");
	    JButton enroll_app = new JButton("ENROLL APPLICATION");
	    JButton attachment = new JButton("ADD ATTACHMENT");
	    JButton biometric = new JButton("ADD BIO-METRIC");
	    JButton dctb = new JButton("ADD DCTB NEW APP");
	    JButton status_change = new JButton("CHANGE STATUS");
	    JButton update_dctb = new JButton("UPDATE DCTB");
	    enroll_app.addActionListener(new ActionListener()
	    {

	      public void actionPerformed(ActionEvent e)
	      {
	        String url = db_url.getText();
	        String db = db_name.getText();
	        url = "jdbc:mysql://" + url + ":3306/" + db;
	        String user = db_user.getText();
	        String pass = db_pass.getText();
	        String ref = reference_no.getText().toUpperCase();
	        String auth = authority.getText();
	        String dc_no = dctb_no.getText();
	        String type = app_type_combo.getSelectedItem().toString();
	        

	        EnrollApplicantData ead = new EnrollApplicantData(url,user,pass);
	        try
	        {
	          ead.SaveApplicantData(ref,dc_no,type,auth);
	        } catch (SQLException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	      }
	    });
	    
	    dctb.addActionListener(new ActionListener()
	    {

	      public void actionPerformed(ActionEvent e)
	      {
	        String url = db_url.getText();
	        String db = db_name.getText();
	        url = "jdbc:mysql://" + url + ":3306/" + db;
	        String user = db_user.getText();
	        String pass = db_pass.getText();
	        String auth = authority.getText();
	        String type = app_type_combo.getSelectedItem().toString();
	        String dc_no = dctb_no.getText();
	        String dc_date = dctb_date.getText();

	        SaveDctb upd = new SaveDctb(url,user,pass);
	        try
	        {
	        	upd.UpdateDctb(dc_no,dc_date,type,auth);
	        } catch (SQLException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	      }
	    });
	    
	    attachment.addActionListener(new ActionListener()
	    {

	      public void actionPerformed(ActionEvent e)
	      {
	        String url = db_url.getText();
	        String db = db_name.getText();
	        url = "jdbc:mysql://" + url + ":3306/" + db;
	        String user = db_user.getText();
	        String pass = db_pass.getText();
	        String ref = reference_no.getText().toUpperCase();
	        
	    
	        UpdateAttachmentFinalUpdate ua = new UpdateAttachmentFinalUpdate(url, user, pass);
	        try
	        {
	          ua.setAttachment(ref);
	        } catch (SQLException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	        catch (IOException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	        
	      }
	    });
	    
	    biometric.addActionListener(new ActionListener()
	    {

	      public void actionPerformed(ActionEvent e)
	      {
	        String url = db_url.getText();
	        String db = db_name.getText();
	        url = "jdbc:mysql://" + url + ":3306/" + db;
	        String user = db_user.getText();
	        String pass = db_pass.getText();
	        String ref = reference_no.getText().toUpperCase();
	        

	        UpdateBiometric ua = new UpdateBiometric(url, user, pass);
	        try
	        {
	          ua.setBiometric(ref);
	        } catch (SQLException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	        catch (IOException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	        
	      }
	    });
	    
	    status_change.addActionListener(new ActionListener()
	    {

	      public void actionPerformed(ActionEvent e)
	      {
	        String url = db_url.getText();
	        String db = db_name.getText();
	        url = "jdbc:mysql://" + url + ":3306/" + db;
	        String user = db_user.getText();
	        String pass = db_pass.getText();
	        String ref = reference_no.getText().toUpperCase();
	        String status = app_status_combo.getSelectedItem().toString();
	        

	        UpdateAppStatus uas = new UpdateAppStatus(url, user, pass);
	        try
	        {
	          uas.ChangeApplicationStatus(status,ref);
	        } catch (SQLException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }	        
	      }
	    });
	    
	    update_dctb.addActionListener(new ActionListener()
	    {

	      public void actionPerformed(ActionEvent e)
	      {
	        String url = db_url.getText();
	        String db = db_name.getText();
	        url = "jdbc:mysql://" + url + ":3306/" + db;
	        String user = db_user.getText();
	        String pass = db_pass.getText();
	        String auth = authority.getText();
	        String ref = reference_no.getText().toUpperCase();
	        
	    
	        UpdateDctb ud = new UpdateDctb(url, user, pass);
	        try
	        {
	          ud.addDctb(ref,auth);
	        } catch (SQLException e1) {
	          JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 
	            0);
	        }
	        
	      }
	    });
	    container.add(DB_URL);
	    container.add(db_url);
	    container.add(DB_NAME);
	    container.add(db_name);
	    container.add(DB_USER);
	    container.add(db_user);
	    container.add(DB_PASS);
	    container.add(db_pass);
	    container.add(Reference);
	    container.add(reference_no);
	    container.add(AUTHORITY);
	    container.add(authority);
	    container.add(App_Type);
	    container.add(app_type_combo);
	    container.add(Dctb);
	    container.add(dctb_no);
	    container.add(Dctb_Date);
	    container.add(dctb_date);
	    container.add(enroll_app);
	    container.add(attachment);
	    container.add(biometric);
	    container.add(dctb);
	    container.add(app_status_combo);
	    container.add(status_change);
	    container.add(Update_Dctb);
	    container.add(update_dctb);
	    frame.setVisible(true);
	  }
	}
