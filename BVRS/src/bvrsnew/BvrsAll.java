package bvrsnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class BvrsAll {
	
	static Connection myConn = null;
	static String url="jdbc:mysql://192.168.4.94:3306/bvrs_client_test";
	static String sql = "select * from bvrs_application where form_no=?";
	static PreparedStatement myStmt = null;

	static String id=null;
	static String registration_place=null;
	static String applicant_type=null;
	static String station_id=null;
	static String machine_uid=null;
	static String machine_mac_addres=null;
	static String machine_ip=null;
	static String software_version=null;
	static String application_type=null;
	static String status=null;
	static String created_by=null;
	static String validated_by=null;
	static String lin=null;
	static String digest=null;
	static String person_id=null;
	
	static String name_en;
	static String name_bn;
	static String dob;
	static String gender;
	static String marital_status;
	static String occupation;
	static String disability;
	static String birth_place;
	static String education;
	static String blood_group;
	static String nationality;
	static String religion;
	static String voter_area;
	static String same_address;
	static String permanent_address_voter;
	static String death;
	static String bvrs_photo_id;
	static String bvrs_signature_id;
	static String bvrs_present_address;
	static String bvrs_permanent_address;
	static String bvrs_foreign_address;
	
	
	static String family_person_id;
	static String relation ;
	static String f_name_en;
	static String f_name_bn ;
	static String nid ;
	static String display_order ;

	
	
	
	public static void main (String arg []){
		try {
			myConn = DriverManager.getConnection(url, "admin", "b@32!ti#");
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, "10000021");
			
			ResultSet rs = myStmt.executeQuery();
			while (rs.next()) {
				
				id = rs.getString("id");
				registration_place = rs.getString("registration_place");
				applicant_type = rs.getString("applicant_type");
				station_id = rs.getString("station_id");
				machine_uid = rs.getString("machine_uid");
				machine_mac_addres = rs.getString("machine_mac_addres");
				machine_ip = rs.getString("machine_ip");
				software_version = rs.getString("software_version");
				application_type = rs.getString("application_type");
				status = rs.getString("status");
				created_by = rs.getString("created_by");
				validated_by = rs.getString("validated_by");
				lin = rs.getString("lin");
				digest = rs.getString("digest");
				person_id = rs.getString("person_id");
				
				System.out.println(id);
				System.out.println(registration_place);
				System.out.println(applicant_type);
				System.out.println(station_id);
				System.out.println(machine_uid);
				System.out.println(machine_mac_addres);
				System.out.println(machine_ip);
				System.out.println(software_version);
				System.out.println(application_type);
				System.out.println(status);
				System.out.println(created_by);
				System.out.println(validated_by);
				System.out.println(lin);
				System.out.println(digest);
				System.out.println(person_id);

			}
			
			String sql1 = "select * from bvrs_person where id=?";
			myStmt = myConn.prepareStatement(sql1);
			myStmt.setString(1, person_id);
			
			ResultSet rs1 = myStmt.executeQuery();
			while (rs1.next()) {
				
				name_en = rs1.getString("name_en");
				name_bn = rs1.getString("name_bn");
				dob = rs1.getString("date_of_birth");
				gender = rs1.getString("gender");
				marital_status = rs1.getString("marital_status");
				occupation = rs1.getString("occupation");
				disability = rs1.getString("disability");
				birth_place = rs1.getString("birth_place");
				education = rs1.getString("education");
				blood_group = rs1.getString("blood_group");
				nationality = rs1.getString("nationality");
				religion = rs1.getString("religion");
				voter_area = rs1.getString("voter_area");
				death = rs1.getString("death");
				same_address = rs1.getString("same_address");
				permanent_address_voter = rs1.getString("permanent_address_voter");
				bvrs_photo_id = rs1.getString("bvrs_photo_id");
				bvrs_signature_id = rs1.getString("bvrs_signature_id");
				bvrs_present_address = rs1.getString("bvrs_present_address");
				bvrs_permanent_address = rs1.getString("bvrs_permanent_address");
				bvrs_foreign_address = rs1.getString("bvrs_foreign_address");
				
				System.out.println(name_en);
				System.out.println(name_bn);
				System.out.println(dob);
				System.out.println(gender);
				System.out.println(marital_status);
				System.out.println(occupation);
				System.out.println(disability);
				System.out.println(birth_place);
				System.out.println(education);
				System.out.println(blood_group);
				System.out.println(nationality);
				System.out.println(religion);
				System.out.println(voter_area);
				System.out.println(death);
				System.out.println(same_address);
				
				System.out.println(permanent_address_voter);
				System.out.println(bvrs_photo_id);
				System.out.println(bvrs_signature_id);
				System.out.println(bvrs_present_address);
				System.out.println(bvrs_permanent_address);
				System.out.println(bvrs_foreign_address);
	

			}
			
			String sql2 = "select * from bvrs_family where bvrs_person_id=?";
			myStmt = myConn.prepareStatement(sql2);
			myStmt.setString(1, person_id);
			
			ResultSet rs2 = myStmt.executeQuery();
			while (rs2.next()) {
				
				//family_person_id = rs2.getString("id");
				relation = rs2.getString("relation");
				f_name_en = rs2.getString("name_en");
				f_name_bn = rs2.getString("name_bn");
				nid = rs2.getString("nid");
				display_order = rs2.getString("display_order");

			
				
				System.out.println("\n");
				System.out.println(family_person_id);
				System.out.println(relation);
				System.out.println(f_name_en);
				System.out.println(f_name_bn);
				System.out.println(nid);
				System.out.println(display_order);

				setFamily(f_name_en, f_name_bn, relation, nid, display_order);
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}
	
	
	public static void setFamily(String f_name_en, String f_name_bn, String relation, String nid, String display_order) throws SQLException{
		
		String sql3 = "insert into bvrs_family (id,relation,name_en,name_bn,nid,voter_no,death,display_order,bvrs_person_id) values(?,?,?,?,?,?,?,?,?)";
		myStmt = myConn.prepareStatement(sql3);
		
		String guid= UUID.randomUUID().toString();
		myStmt.setString(1, guid);
		myStmt.setString(2, relation);
		myStmt.setString(3, f_name_en);
		myStmt.setString(4, f_name_bn);
		myStmt.setString(5, nid);
		myStmt.setString(6, null);
		myStmt.setString(7, null);
		myStmt.setString(8, display_order);
		myStmt.setString(9, person_id);
		
		myStmt.executeUpdate();
		
	}

	
}
