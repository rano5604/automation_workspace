package com.client;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.axis.message.MessageWithAttachments;

public class EndorseForm {

	static final JPanel panel = new JPanel();
	
	public EndorseForm() {
	}
	
	static String result;

	static String nameEn=null ;
	static String mobileEn = null;
	static String dobEn = null;
	static String oldr = null;
	static String newr = null;
	static String oldau = null;
	static String newau = null;
	static String applitype = null;
	static String licensetype = null;
	static String cardtype = null;
	static String license_no = null;
	static String userName = null;


	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Enroll Endorse Application");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(3);

		Container container = frame.getContentPane();
		container.setLayout(new GridLayout(0,2));


		final JTextField dob = new JTextField("1959/01/01");
		dob.setPreferredSize(new Dimension(100, 10));

		final JTextField name = new JTextField("Jayed Ibrahim");
		name.setPreferredSize(new Dimension(100, 10));

		final JTextField oldref = new JTextField();
		oldref.setPreferredSize(new Dimension(100, 10));

		final JTextField newref = new JTextField();
		newref.setPreferredSize(new Dimension(100, 10));
		

		final JTextField license = new JTextField();
		license.setPreferredSize(new Dimension(100, 10));

		
	    String[] newauth = new String[] {"","DKN","DK2","DK3","DKS","SVR","GP"};
	    JComboBox<String> new_auth_combo = new JComboBox<String>(newauth);
	    new_auth_combo.setEditable(true);
		
	    String[] oldauth = new String[] {"","DKN","DK2","DK3","DKS","SVR","GP"};
	    JComboBox<String> old_auth_combo = new JComboBox<String>(oldauth);
	    old_auth_combo.setEditable(true);

	    JTextField mobile = new JTextField("01917858019");
		mobile.setPreferredSize(new Dimension(100, 10));

	    String[] user = new String[] {"","JAYED_CTG","JAYED_CTGV","SANAUL_OPERATOR","SANAUL_VALIDATE"};
	    JComboBox<String> user_type_combo = new JComboBox<String>(user);
	    user_type_combo.setEditable(true);
		
	    String[] applicant_type = new String[] {"","GENERAL","ARMED_FORCE","DIPLOMAT"};
	    JComboBox<String> applicant_type_combo = new JComboBox<String>(applicant_type);

	    String[] license_type = new String[] {"","NON_PROFESSIONAL","PROFESSIONAL"};
	    JComboBox<String> license_type_combo = new JComboBox<String>(license_type);

	    String[] card_type = new String[] {"","True","False"};
	    JComboBox<String> card_type_combo = new JComboBox<String>(card_type);
	    
		JLabel APPLICANT_NAME = new JLabel("Applicant Name");
		JLabel DOB = new JLabel("Date of Birth");
		JLabel OLD_REF = new JLabel("Old Reference Number");
		JLabel NEW_REF = new JLabel("NEW Reference Number");
		JLabel OLD_LICENSE = new JLabel("Old License Number");
		JLabel OLD_AUTH = new JLabel("Old Authority");
		JLabel NEW_AUTH = new JLabel("New Authority");
		JLabel MOBILE = new JLabel("Mobile");
		JLabel APPLICANT_TYPE = new JLabel("Applicant Type");
		JLabel LICENSE_TYPE = new JLabel("License Type");
		JLabel CARD_TYPE = new JLabel("Plastic Card");
		JLabel USER_NAME = new JLabel("User Name");


		JButton submit = new JButton("SUBMIT APPLICATION");
		JButton approve = new JButton("APPROVE APPLICATION");

		submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				nameEn = name.getText();
				mobileEn = mobile.getText();
				dobEn = dob.getText();
				oldr = oldref.getText();
				newr = newref.getText();
				oldau = old_auth_combo.getSelectedItem().toString();
				newau = new_auth_combo.getSelectedItem().toString();
				applitype = applicant_type_combo.getSelectedItem().toString();
				licensetype = license_type_combo.getSelectedItem().toString();
				cardtype = card_type_combo.getSelectedItem().toString();
				license_no = license.getText();
				userName = user_type_combo.getSelectedItem().toString();

				EndorseApplication ed = new EndorseApplication(oldr, oldau, license_no, licensetype,cardtype, newr,newau, applitype, nameEn, dobEn, mobileEn,userName);
				try {
					ed.addEndorse();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(EndorseForm.panel, e1.getMessage(), "Error", 0);
				}
			}
		});


		approve.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				userName = user_type_combo.getSelectedItem().toString();

				ApproveEndorse ea = new ApproveEndorse(newau,newr,oldau, oldr,userName);
				try {
					ea.approveApplication();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(EndorseForm.panel, e1.getMessage(), "Error", 0);
				}
			}
		});


		container.add(APPLICANT_NAME);
		container.add(name);
		container.add(DOB);
		container.add(dob);
		container.add(MOBILE);
		container.add(mobile);
		container.add(APPLICANT_TYPE);
		container.add(applicant_type_combo);
		
		container.add(NEW_AUTH);
		container.add(new_auth_combo);
		container.add(NEW_REF);
		container.add(newref);
		container.add(OLD_AUTH);
		container.add(old_auth_combo);
		
		container.add(OLD_REF);
		container.add(oldref);

		container.add(OLD_LICENSE);
		container.add(license);
		container.add(LICENSE_TYPE);
		container.add(license_type_combo);
		container.add(CARD_TYPE);
		container.add(card_type_combo);
		container.add(USER_NAME);
		container.add(user_type_combo);

		container.add(submit);
		container.add(approve);

		frame.setVisible(true);
	}
}