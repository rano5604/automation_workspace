package enroll;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import util.CloseConnection;

public class EnrollDraft {
	
	String URL;
	String User;
	String Password;
	String DES_URL;
	String DES_User;
	String DES_Password;
	
	String OLDFORM;
	String NEWFORM;
	
	Connection myConn = null;
	final JPanel panel = new JPanel();
	String id = null;

	public EnrollDraft(String URL, String User, String Password, String oldform_no, String newform_no,
			String DES_url,String DES_user, String DES_pass ) {
		this.URL = URL;
		this.User = User;
		this.Password = Password;
		
		this.DES_URL = DES_url;
		this.DES_User = DES_user;
		this.DES_Password = DES_pass;
		
		this.OLDFORM = oldform_no;
		this.NEWFORM = newform_no;
	}
	
	public void setDemographicData() throws SQLException, IOException {
		try {
			myConn = DriverManager.getConnection(URL, User, Password);
			

			PickDemographicData pd = new PickDemographicData(myConn);
			pd.pickValues(OLDFORM);
			
			DemographicData dd = new DemographicData(DES_URL,DES_User,DES_Password,NEWFORM);
			
			dd.setDemographicData(pd.name, pd.name_en, pd.father, pd.mother, pd.gender, pd.marital, pd.occupation,pd.spouce, pd.disability,
					pd.birth, pd.birth_place, pd.religion, pd.district, pd.division, pd.rmo, pd.city, pd.upozila, pd.eunion, pd.ward, pd.village, 
					pd.village_other, pd.area, pd.area_other, pd.house, pd.postoffice, pd.postcode, pd.voter_at);
			
			JOptionPane.showMessageDialog(panel, "Demographic Data Inserted Successfully", NEWFORM, 1, null);

		}catch(Exception e){
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
	}
}
