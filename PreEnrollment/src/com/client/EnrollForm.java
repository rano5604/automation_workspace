package com.client;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EnrollForm {

	static String url_service ;
	static String port_service;
	
	static final JPanel panel = new JPanel();

	public EnrollForm() {
	}

	static List<String> result = new ArrayList<>();

	public static void main(String[] args) {
		JFrame frame = new JFrame("Enroll Online Application");
		frame.setSize(400, 800);
		frame.setDefaultCloseOperation(3);

		Container container = frame.getContentPane();
		container.setLayout(new GridLayout(0, 2));

		Container container1 = frame.getContentPane();
		container1.setLayout(new GridLayout(0, 2));

		JTextField service_url = new JTextField("192.168.1.31");
		service_url.setPreferredSize(new Dimension(100, 10));

		final JTextField port = new JTextField("7025");
		port.setPreferredSize(new Dimension(100, 10));

		final JTextField method = new JTextField("addDLEnrollment");
		method.setPreferredSize(new Dimension(100, 10));

		final JTextField dob = new JTextField("1959/01/01");
		dob.setPreferredSize(new Dimension(100, 10));

		final JTextField name = new JTextField("Jayed Ibrahim");
		name.setPreferredSize(new Dimension(100, 10));

		final JTextField mobile = new JTextField("01917858019");
		mobile.setPreferredSize(new Dimension(100, 10));

		final JTextField applicant_type = new JTextField("49");
		applicant_type.setPreferredSize(new Dimension(100, 10));

		final JTextField recentLicenseNo = new JTextField("DL0005");
		recentLicenseNo.setPreferredSize(new Dimension(100, 10));

		final JTextField LicenseNo = new JTextField();
		LicenseNo.setPreferredSize(new Dimension(100, 10));

		final JTextField authorityId = new JTextField("100");
		authorityId.setPreferredSize(new Dimension(100, 10));

		final JTextField bankTransactionId = new JTextField("6969");
		bankTransactionId.setPreferredSize(new Dimension(100, 10));

		final JTextField biometricScheduleDate = new JTextField("2019/01/25");
		biometricScheduleDate.setPreferredSize(new Dimension(100, 10));

		final JTextField dctbDate = new JTextField("2019/01/01");
		dctbDate.setPreferredSize(new Dimension(100, 10));

		final JTextField dctbSerialNo = new JTextField("505050");
		dctbSerialNo.setPreferredSize(new Dimension(100, 10));

		final JTextField vehicleClass = new JTextField("LIGHT");
		vehicleClass.setPreferredSize(new Dimension(100, 10));

		final JTextField attachment1 = new JTextField("attachment1");
		attachment1.setPreferredSize(new Dimension(100, 10));

		final JTextField attachment2 = new JTextField("attachment2");
		attachment2.setPreferredSize(new Dimension(100, 10));

		final JTextField attachment3 = new JTextField("attachment3");
		attachment3.setPreferredSize(new Dimension(100, 10));

		final JTextField photo = new JTextField("Base64StringOfPhoto");
		photo.setPreferredSize(new Dimension(100, 10));

		final JTextField doc_type = new JTextField("146");
		doc_type.setPreferredSize(new Dimension(100, 10));

		final JTextField id = new JTextField();
		id.setPreferredSize(new Dimension(100, 10));

		final JTextField reference_no = new JTextField();
		reference_no.setPreferredSize(new Dimension(100, 10));

		final JTextField instructorLicenseNo = new JTextField("InstructorLicense001");
		instructorLicenseNo.setPreferredSize(new Dimension(100, 10));

		final JTextField instructorName = new JTextField("Teacher");
		instructorName.setPreferredSize(new Dimension(100, 10));

		final JTextField language = new JTextField("38");
		language.setPreferredSize(new Dimension(100, 10));

		final JTextField learnerReferenceNumber = new JTextField("Lerner002");
		learnerReferenceNumber.setPreferredSize(new Dimension(100, 10));

		final JTextField licenseType = new JTextField("36");
		licenseType.setPreferredSize(new Dimension(100, 10));
/*
		final JTextField onlineDlApplicationType = new JTextField("2");
		onlineDlApplicationType.setPreferredSize(new Dimension(100, 10));*/

		final JTextField bloodGroup = new JTextField("16");
		bloodGroup.setPreferredSize(new Dimension(100, 10));

		final JTextField email = new JTextField("jayed19@gmail.com");
		email.setPreferredSize(new Dimension(100, 10));

		final JTextField fatherEn = new JTextField("Md. Wahiduzzaman Khan");
		fatherEn.setPreferredSize(new Dimension(100, 10));

		final JTextField gender = new JTextField("8");
		gender.setPreferredSize(new Dimension(100, 10));

		final JTextField maritalStatus = new JTextField("11");
		maritalStatus.setPreferredSize(new Dimension(100, 10));

		final JTextField spouseName = new JTextField("Abida");
		spouseName.setPreferredSize(new Dimension(100, 10));

		final JTextField motherEn = new JTextField("Mst. Shahida");
		motherEn.setPreferredSize(new Dimension(100, 10));

		final JTextField nid = new JTextField("1234567890");
		nid.setPreferredSize(new Dimension(100, 10));

		final JTextField occupation = new JTextField("155");
		occupation.setPreferredSize(new Dimension(100, 10));

		final JTextField nationality = new JTextField("BD");
		nationality.setPreferredSize(new Dimension(100, 10));

		final JTextField addressLineEn = new JTextField("House 94");
		addressLineEn.setPreferredSize(new Dimension(100, 10));

		final JTextField districtId = new JTextField("26");
		districtId.setPreferredSize(new Dimension(100, 10));

		final JTextField divisionId = new JTextField("30");
		divisionId.setPreferredSize(new Dimension(100, 10));

		final JTextField postcode = new JTextField("1206");
		postcode.setPreferredSize(new Dimension(100, 10));

		final JTextField unionId = new JTextField("260898");
		unionId.setPreferredSize(new Dimension(100, 10));

		final JTextField upozilaId = new JTextField("2608");
		upozilaId.setPreferredSize(new Dimension(100, 10));

		final JTextField p_addressLineEn = new JTextField("House 94");
		p_addressLineEn.setPreferredSize(new Dimension(100, 10));

		final JTextField p_districtId = new JTextField("26");
		p_districtId.setPreferredSize(new Dimension(100, 10));

		final JTextField p_divisionId = new JTextField("30");
		p_divisionId.setPreferredSize(new Dimension(100, 10));

		final JTextField p_postcode = new JTextField("1206");
		p_postcode.setPreferredSize(new Dimension(100, 10));

		final JTextField p_unionId = new JTextField("260898");
		p_unionId.setPreferredSize(new Dimension(100, 10));

		final JTextField p_upozilaId = new JTextField("2608");
		p_upozilaId.setPreferredSize(new Dimension(100, 10));

	    String[] dup_reason = new String[] {"","LOST","DAMAGED","OTHER"};
	    JComboBox<String> duplicate = new JComboBox<String>(dup_reason);

	    String[] app_type = new String[] {"","NEW","RENEWAL","DUPLICATE"};
	    JComboBox<String> app_type_combo = new JComboBox<String>(app_type);
	    
	    String[] app_sub_type = new String[] {"","RENEWAL"};
	    JComboBox<String> app_sub_type_combo = new JComboBox<String>(app_sub_type);


		JLabel SERVICE_URL = new JLabel("Service URL");
		JLabel METHOD_NAME = new JLabel("Method Name");
		JLabel PORT = new JLabel("Port");
		JLabel NAME = new JLabel("Name");
		JLabel MOBILE = new JLabel("Mobile");
		JLabel DOB = new JLabel("Date of Birth");

		JLabel applicant_typeL = new JLabel("Applicant Type");
		JLabel online_typeL = new JLabel("Online Application Type");
		JLabel online_sub_typeL = new JLabel("Online Application SubType");
		JLabel duplicateL = new JLabel("Duplicate Reason");
		JLabel authorityIdL = new JLabel("Authority Id");
		JLabel bankTransactionIdL = new JLabel("Bank Transaction ID");
		JLabel biometricScheduleDateL = new JLabel("Biometric Schedule Date");
		JLabel dctbDateL = new JLabel("Dctb Date");
		JLabel dctbSerialNoL = new JLabel("Dctb Serial No");

		JLabel vehicleClassL = new JLabel("Vehicle Class");
		JLabel RecentLicenseNoL = new JLabel("Recent License No");
		JLabel LicenseNoL = new JLabel("License No");

		JLabel learnerReferenceNumberL = new JLabel("LearnerReference Number");
		JLabel licenseTypeL = new JLabel("License Type");

		JLabel idL = new JLabel("Online Application ID");
		JLabel reference_noL = new JLabel("Pre-Enroll Reference No");
		JLabel bloodGroupL = new JLabel("Blood Group");
		JLabel emailL = new JLabel("Email");
		JLabel fatherEnL = new JLabel("Father Name");
		JLabel genderL = new JLabel("Gender");
		JLabel motherEnL = new JLabel("Mother Name");
		JLabel nationalityL = new JLabel("Nationality");
		JLabel nidL = new JLabel("NID");
		JLabel maritalStatusL = new JLabel("Marital Status");
		JLabel spouseNameL = new JLabel("Spouse Name");
		JLabel occupationL = new JLabel("Occupation");

		JLabel personal_info = new JLabel("Personal Information");
		JLabel personal_info_ = new JLabel("------------------");

		JLabel permanentAddress = new JLabel("Permanent Address");
		JLabel permanentAddress_ = new JLabel("------------------");
		JLabel addressLineEnL = new JLabel("Address Line");
		JLabel districtIdL = new JLabel("District ID");
		JLabel divisionIdL = new JLabel("Division ID");
		JLabel postcodeL = new JLabel("Postcode");
		JLabel unionIdL = new JLabel("Union ID");
		JLabel upozilaIdL = new JLabel("Upozila ID");

		JLabel presentAddress = new JLabel("Present Address");
		JLabel presentAddress_ = new JLabel("------------------");
		JLabel p_addressLineEnL = new JLabel("Address Line");
		JLabel p_districtIdL = new JLabel("District ID");
		JLabel p_divisionIdL = new JLabel("Division ID");
		JLabel p_postcodeL = new JLabel("Postcode");
		JLabel p_unionIdL = new JLabel("Union ID");
		JLabel p_upozilaIdL = new JLabel("Upozila ID");

		JButton pre_enroll = new JButton("Get Pre-Enroll ID");
		JButton set_id = new JButton("Set Reference");
		JButton submit = new JButton("SUBMIT APPLICATION");

		pre_enroll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String nameEn = name.getText();
				String mobileEn = mobile.getText();
				String dobEn = dob.getText();

				url_service = service_url.getText();
				port_service = port.getText();
				PreEnroll ef = new PreEnroll(nameEn, mobileEn, dobEn);
				
				try {
					result = ef.GetPreEnrollID();
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 0);
				}
			}
		});

		set_id.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// List<String> result1 = new ArrayList<>();
				String ref_1 = result.get(0);
				String id_1 = result.get(1);
				// System.out.println(id_1+":"+ref_1);
				reference_no.setText(ref_1);
				id.setText(id_1);

			}
		});

		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String appli_type = applicant_type.getText();
				String auth_id = authorityId.getText();
				String lice_type = licenseType.getText();
				String dctb = dctbSerialNo.getText();
				String dctb_date = dctbDate.getText();
				String learner_no = learnerReferenceNumber.getText();
				String recentdl = recentLicenseNo.getText();
				String dl = LicenseNo.getText();
				String bankTid = bankTransactionId.getText();
				String biodate = biometricScheduleDate.getText();
				String instruc_name = instructorName.getText();
				String instruc_license = instructorLicenseNo.getText();
				String vclass = vehicleClass.getText();
				String id1 = id.getText();
				String ref1 = reference_no.getText();
				String onType = app_type_combo.getSelectedItem().toString();
				String onSubType = app_sub_type_combo.getSelectedItem().toString();
				String reason_dup = duplicate.getSelectedItem().toString();

				String f_name = fatherEn.getText();
				String m_name = motherEn.getText();
				String s_name = spouseName.getText();
				String occ = occupation.getText();
				String name1 = name.getText();
				String dob1 = dob.getText();
				String nid1 = nid.getText();
				String nation = nationality.getText();
				String langu = language.getText();
				String sex = gender.getText();
				String m_status = maritalStatus.getText();
				String e_mail = email.getText();
				String phone = mobile.getText();
				String bloodg = bloodGroup.getText();

				String doc = doc_type.getText();
				String atta1 = attachment1.getText();
				String atta2 = attachment2.getText();
				String atta3 = attachment3.getText();
				String pic = photo.getText();

				String addLine = addressLineEn.getText();
				String addLine_p = p_addressLineEn.getText();
				String divid = divisionId.getText();
				String divid_p = p_divisionId.getText();
				String distid = districtId.getText();
				String distid_p = p_districtId.getText();
				String postc = postcode.getText();
				String postc_p = p_postcode.getText();
				String unid = unionId.getText();
				String unid_p = p_unionId.getText();
				String upoid = upozilaId.getText();
				String upoid_p = p_upozilaId.getText();
				

				SubmitOnlineApplication soa = new SubmitOnlineApplication(name1, phone, dob1, f_name, m_name, s_name,
						nid1, nation, e_mail, m_status, bloodg, sex, occ, langu, dctb,dctb_date, id1, ref1, appli_type,
						auth_id, lice_type, vclass,onType,onSubType, reason_dup, learner_no,dl,recentdl, instruc_name, instruc_license, bankTid,
						biodate, doc, atta1, atta2, atta3, pic, addLine, addLine_p, divid, divid_p, distid, distid_p,
						postc, postc_p, unid, unid_p, upoid, upoid_p);

				try {
					soa.SubmitOnlineApp();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(EnrollForm.panel, e1.getMessage(), "Error", 0);
				}
			}
		
		}
		);

		container.add(SERVICE_URL);
		container.add(service_url);
		container.add(PORT);
		container.add(port);
		container.add(METHOD_NAME);
		container.add(method);
		container.add(NAME);
		container.add(name);
		container.add(DOB);
		container.add(dob);
		container.add(MOBILE);
		container.add(mobile);
		container.add(pre_enroll);
		container.add(set_id);

		container1.add(applicant_typeL);
		container1.add(applicant_type);

		container1.add(licenseTypeL);
		container1.add(licenseType);

		container1.add(authorityIdL);
		container1.add(authorityId);

		container1.add(bankTransactionIdL);
		container1.add(bankTransactionId);

		container1.add(biometricScheduleDateL);
		container1.add(biometricScheduleDate);

		container1.add(dctbDateL);
		container1.add(dctbDate);

		container1.add(dctbSerialNoL);
		container1.add(dctbSerialNo);

		container1.add(vehicleClassL);
		container1.add(vehicleClass);

		container1.add(learnerReferenceNumberL);
		container1.add(learnerReferenceNumber);
		
		container1.add(LicenseNoL);
		container1.add(LicenseNo);
		
		container1.add(RecentLicenseNoL);
		container1.add(recentLicenseNo);
		
		container1.add(online_typeL);
		container1.add(app_type_combo);
		
		container1.add(duplicateL);
		container1.add(duplicate);
		
		container1.add(online_sub_typeL);
		container1.add(app_sub_type_combo);
		
		container1.add(idL);
		container1.add(id);

		container1.add(reference_noL);
		container1.add(reference_no);

		container1.add(personal_info);
		container1.add(personal_info_);

		container1.add(nidL);
		container1.add(nid);

		container1.add(nationalityL);
		container1.add(nationality);
		container1.add(genderL);
		container1.add(gender);

		container1.add(bloodGroupL);
		container1.add(bloodGroup);
		container1.add(occupationL);
		container1.add(occupation);
		container1.add(fatherEnL);
		container1.add(fatherEn);
		container1.add(motherEnL);
		container1.add(motherEn);
		container1.add(spouseNameL);
		container1.add(spouseName);

		container1.add(emailL);
		container1.add(email);

		container1.add(maritalStatusL);
		container1.add(maritalStatus);

		container1.add(presentAddress);
		container1.add(presentAddress_);

		container1.add(addressLineEnL);
		container1.add(addressLineEn);

		container1.add(districtIdL);
		container1.add(districtId);

		container1.add(divisionIdL);
		container1.add(divisionId);

		container1.add(postcodeL);
		container1.add(postcode);

		container1.add(unionIdL);
		container1.add(unionId);

		container1.add(upozilaIdL);
		container1.add(upozilaId);

		container1.add(permanentAddress);
		container1.add(permanentAddress_);

		container1.add(p_addressLineEnL);
		container1.add(p_addressLineEn);

		container1.add(p_districtIdL);
		container1.add(p_districtId);

		container1.add(p_divisionIdL);
		container1.add(p_divisionId);

		container1.add(p_postcodeL);
		container1.add(p_postcode);

		container1.add(p_unionIdL);
		container1.add(p_unionId);

		container1.add(p_upozilaIdL);
		container1.add(p_upozilaId);

		container.add(submit);

		frame.setVisible(true);
	}
}