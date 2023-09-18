package enroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import util.CloseConnection;

public class PickDemographicData {
	
	Connection myConn = null;
	PreparedStatement myStmt = null;
	String url;
	String user;
	String pass;
	final JPanel panel = new JPanel();
	
	String name;
	String name_en;
	String father;
	String mother;
	String gender;
	String marital;
	String occupation;
	String spouce;
	String disability;
	String birth;
	String birth_place;
	String religion;
	String district;
	String division;
	String rmo;
	String city;
	String upozila;
	String eunion;
	String ward;
	String village;
	String village_other;
	String area;
	String area_other;
	String house;
	String postoffice;
	String postcode;
	String voter_at ;

	
	public PickDemographicData(Connection conn) {
		this.myConn = conn;
	}
	
	public void pickValues(String oldform_no)
	{
		String sql = "select * from voter where form_no=?";
		try {
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, oldform_no);
			
			ResultSet rs = myStmt.executeQuery();
			while (rs.next()) {
				name = rs.getString("name");
				name_en = rs.getString("name_en");
				father = rs.getString("father");
				mother = rs.getString("mother");
				gender = rs.getString("gender");
				marital = rs.getString("marital");
				occupation = rs.getString("occupation");
				disability = rs.getString("disability");
				birth = rs.getString("birth");
				birth_place = rs.getString("birth_place");
				religion = rs.getString("religion");
				district = rs.getString("district");
				division = rs.getString("division");
				rmo = rs.getString("rmo");
				city = rs.getString("city");
				upozila = rs.getString("upozila");
				eunion = rs.getString("eunion");
				ward = rs.getString("ward");
				village = rs.getString("village");
				village_other = rs.getString("village_other");
				area = rs.getString("area");
				area_other = rs.getString("area_other");
				house = rs.getString("house");
				postoffice = rs.getString("postoffice");
				postcode = rs.getString("postcode");
				voter_at = rs.getString("voter_at");
			}
			if(!myStmt.isClosed()){
				myStmt.close();
			}
			CloseConnection closeConn = new CloseConnection(myConn);
			closeConn.closeConnection();
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(panel, e.getMessage(), "Error", 0);
		}
		
	}

}
