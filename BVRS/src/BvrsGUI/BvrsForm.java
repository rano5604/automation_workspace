package BvrsGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import biometric.FixedSizeDocument;
import biometric.UpdateBiometric;
import biometric.ViewImage;
import config.ModifyXmlFile;
import enroll.EnrollDraft;
import util.CheckNull;

@SuppressWarnings("serial")
public class BvrsForm extends FixedSizeDocument {

	public BvrsForm(int max) {
		super(max);
		// TODO Auto-generated constructor stub
	}

	static String s_url;
	static String l_url;
	static String f_url;

	static String des_url;
	static String des_url_db;
	static String des_db;
	static String des_user;
	static String des_pass;

	static JTextField db_url_des;
	static JTextField db_name_des;
	static JTextField db_user_des;
	static JTextField db_pass_des;

	static int changeIsopen = 0;
	public static Component panel;

	static JFrame data_des = new JFrame("Destination Info");;
	final static JFrame frame = new JFrame("BVRS Automation Tool");

	final static JPanel config = new JPanel();
	final static JPanel biometric = new JPanel();
	final static JPanel enrollment = new JPanel();
	final static JPanel dataconfig = new JPanel();

	private static void createAndShowGUI() {

		CheckNull cn = new CheckNull();
		Icon icon = new ImageIcon("icon.gif");

		String[] service_url = new String[] { "192.168.1.176", "172.20.20.14" };
		JComboBox<String> service_url_combo = new JComboBox<String>(service_url);
		service_url_combo.setPreferredSize(new Dimension(100, 10));
		service_url_combo.setEditable(true);

		String[] login_url = new String[] { "192.168.1.176", "172.20.20.14" };
		JComboBox<String> login_url_combo = new JComboBox<String>(login_url);
		login_url_combo.setPreferredSize(new Dimension(100, 10));
		login_url_combo.setEditable(true);

		String[] ftp_url = new String[] { "192.168.4.93", "172.27.2.2" };
		JComboBox<String> ftp_url_combo = new JComboBox<String>(ftp_url);
		ftp_url_combo.setPreferredSize(new Dimension(100, 10));
		ftp_url_combo.setEditable(true);

		JLabel url_ftp = new JLabel("FTP");
		JLabel url_service = new JLabel("Service");
		JLabel url_login = new JLabel("Login");

		JButton save_url = new JButton("Save");
		save_url.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				s_url = service_url_combo.getSelectedItem().toString();

				l_url = login_url_combo.getSelectedItem().toString();
				f_url = ftp_url_combo.getSelectedItem().toString();

				ModifyXmlFile update = new ModifyXmlFile();
				try {
					update.updateConfigXml(s_url, l_url, f_url);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(BvrsForm.config, e1.getMessage(), "Error", 0);
				}
			}
		});

		config.setLayout(new GridLayout(0, 2));

		config.add(url_service);
		config.add(service_url_combo);

		config.add(url_login);
		config.add(login_url_combo);
		config.add(url_ftp);

		config.add(ftp_url_combo);
		config.add(save_url);

		biometric.setLayout(new GridLayout(0, 2));

		JTextField db_url = new JTextField("192.168.1.201");
		db_url.setPreferredSize(new Dimension(100, 10));

		final JTextField db_name = new JTextField("voter_new");
		db_name.setPreferredSize(new Dimension(100, 10));

		final JTextField db_user = new JTextField("root");
		db_user.setPreferredSize(new Dimension(100, 10));

		final JTextField db_pass = new JPasswordField("tigerit");
		db_pass.setPreferredSize(new Dimension(100, 10));

		final JTextField new_form = new JTextField(8);
		new_form.setPreferredSize(new Dimension(100, 10));
		new_form.setDocument(new FixedSizeDocument(8));

		final JTextField old_form = new JTextField();
		old_form.setPreferredSize(new Dimension(100, 10));
		old_form.setDocument(new FixedSizeDocument(8));
		old_form.setText("26000001");

		JCheckBox image = new JCheckBox("Image");
		image.setSelected(true);
		JCheckBox attachment = new JCheckBox("Attachment");
		attachment.setSelected(true);
		JCheckBox signature = new JCheckBox("signature");
		signature.setSelected(true);
		JCheckBox fingerpirnt = new JCheckBox("Finger Pirnt");
		fingerpirnt.setSelected(true);
		JCheckBox iris = new JCheckBox("Iris");
		iris.setSelected(true);

		JLabel newform_Label = new JLabel("New Form No");
		JLabel oldform_Label = new JLabel("Pick Data");

		JLabel DB_URL = new JLabel("DB URL");
		JLabel DB_NAME = new JLabel("DB NAME");
		JLabel DB_USER = new JLabel("DB USER");
		JLabel DB_PASS = new JLabel("DB PASSWORD");

		JButton view_image = new JButton("View Old form Image");
		view_image.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String url = db_url.getText();
				String db = db_name.getText();
				String url_db = "jdbc:mysql://" + url + ":3306/" + db;
				String user = db_user.getText();
				String pass = db_pass.getText();
				String oldform = old_form.getText();
				int operation2 = cn.checkDatabaseInfo(url, db, user, pass);
				int operation3 = cn.checkOldForm(oldform);

				if (operation2 == 1) {
					ViewImage vi = new ViewImage(url_db, user, pass);
					try {
						if (operation3 == 1) {
							vi.viewImage(oldform);
						}

					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				} else
					JOptionPane.showMessageDialog(BvrsForm.biometric, "Something is Missing", "Error", 0);
			}
		});

		JButton update_biometric = new JButton("Update");
		update_biometric.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String url = db_url.getText();
				String db = db_name.getText();
				String url_db = "jdbc:mysql://" + url + ":3306/" + db;
				String user = db_user.getText();
				String pass = db_pass.getText();
				String newform = new_form.getText();
				String oldform = old_form.getText();

				boolean photo = image.isSelected();
				boolean attach = attachment.isSelected();
				boolean sign = signature.isSelected();
				boolean eye = iris.isSelected();
				boolean fp = fingerpirnt.isSelected();

				if (changeIsopen==1) {
					des_url = db_url_des.getText();
					String db1 = db_name_des.getText();
					des_url_db = "jdbc:mysql://" + des_url + ":3306/" + db1;
					des_user = db_user_des.getText();
					des_pass = db_pass_des.getText();
					cn.checkDatabaseInfo(des_url, db1, des_user, des_pass);
				}
				else
				{
					des_url = db_url.getText();
					String db1 = db_name.getText();
					des_url_db = "jdbc:mysql://" + des_url + ":3306/" + db1;
					des_user = db_user.getText();
					des_pass = db_pass.getText();
				}

				int operation4 = cn.checkDatabaseInfo(url, db, user, pass);
				if (operation4 == 1) {
					int operation5 = cn.checkDataInfo(newform, oldform);
					if (operation5 == 1) {
						UpdateBiometric ua = new UpdateBiometric(url_db, user, pass, oldform, newform, photo, attach,
								sign, eye, fp, des_url_db, des_user, des_pass);
						try {
							ua.setBiometric(newform, oldform);
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(BvrsForm.biometric, e1.getMessage(), "Error", 0);
						} catch (IOException e1) {
							JOptionPane.showMessageDialog(BvrsForm.biometric, e1.getMessage(), "Error", 0);
						}
						data_des.dispatchEvent(new WindowEvent(data_des, WindowEvent.WINDOW_CLOSING));
						changeIsopen = 0;
					}
				}
			}
		});

		biometric.add(newform_Label);
		biometric.add(new_form);

		biometric.add(oldform_Label);
		biometric.add(old_form);

		biometric.add(update_biometric);

		biometric.add(view_image);
		biometric.add(image);
		biometric.add(signature);
		biometric.add(attachment);
		biometric.add(fingerpirnt);
		biometric.add(iris);

		final JTextField new_enroll = new JTextField();
		new_enroll.setPreferredSize(new Dimension(100, 10));
		new_enroll.setDocument(new FixedSizeDocument(8));

		final JTextField pick_from = new JTextField();
		pick_from.setPreferredSize(new Dimension(100, 10));
		pick_from.setDocument(new FixedSizeDocument(8));
		pick_from.setText("26000001");

		JLabel new_enroll_label = new JLabel("New Form No");
		JLabel pick_from__label = new JLabel("Pick Data");

		JButton enroll = new JButton("Enroll Draft");

		enroll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String url = db_url.getText();
				String db = db_name.getText();
				url = "jdbc:mysql://" + url + ":3306/" + db;
				String user = db_user.getText();
				String pass = db_pass.getText();
				String newform = new_enroll.getText();
				String oldform = pick_from.getText();

				int operation = cn.checkAll(url, db, user, pass, oldform, newform);

				if (changeIsopen==1) {
					des_url = db_url_des.getText();
					String db1 = db_name_des.getText();
					des_url_db = "jdbc:mysql://" + des_url + ":3306/" + db1;
					des_user = db_user_des.getText();
					des_pass = db_pass_des.getText();
					cn.checkDatabaseInfo(des_url, db1, des_user, des_pass);
				}
				else
				{
					des_url = db_url.getText();
					String db1 = db_name.getText();
					des_url_db = "jdbc:mysql://" + des_url + ":3306/" + db1;
					des_user = db_user.getText();
					des_pass = db_pass.getText();
				}

				if (operation == 1) {
					EnrollDraft ud = new EnrollDraft(url, user, pass, oldform, newform, des_url_db, des_user,
							des_pass);
					try {
						ud.setDemographicData();
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(BvrsForm.enrollment, e1.getMessage(), "Error", 0);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(BvrsForm.enrollment, e1.getMessage(), "Error", 0);
					}
					data_des.dispatchEvent(new WindowEvent(data_des, WindowEvent.WINDOW_CLOSING));
					changeIsopen = 0;
				}

			}
		});

		JButton change_destination = new JButton("Change Destination");
		change_destination.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				changeIsopen = 1;
				db_url_des = new JTextField(db_url.getText());
				db_url.setPreferredSize(new Dimension(100, 10));

				db_name_des = new JTextField(db_name.getText());
				db_name.setPreferredSize(new Dimension(100, 10));

				db_user_des = new JTextField(db_user.getText());
				db_user.setPreferredSize(new Dimension(100, 10));

				db_pass_des = new JPasswordField(db_pass.getText());
				db_pass.setPreferredSize(new Dimension(100, 10));
				JLabel DB_URL1 = new JLabel("DB URL");
				JLabel DB_NAME1 = new JLabel("DB NAME");
				JLabel DB_USER1 = new JLabel("DB USER");
				JLabel DB_PASS1 = new JLabel("DB PASSWORD");
				data_des = new JFrame("Data des");

				JButton save = new JButton("Save");
				save.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						des_url = db_url_des.getText();
						String db1 = db_name_des.getText();
						des_url_db = "jdbc:mysql://" + des_url + ":3306/" + db1;
						des_user = db_user_des.getText();
						des_pass = db_pass_des.getText();
						int operation1 = cn.checkDatabaseInfo(des_url, db1, des_user, des_pass);
						if (operation1 == 1) {
							data_des.dispatchEvent(new WindowEvent(data_des, WindowEvent.WINDOW_CLOSING));
						}
					}
				});

				data_des.setLocation(590, 350);
				Container container = data_des.getContentPane();
				container.setLayout(new GridLayout(0, 2));

				container.add(DB_URL1);
				container.add(db_url_des);
				container.add(DB_NAME1);
				container.add(db_name_des);
				container.add(DB_USER1);
				container.add(db_user_des);
				container.add(DB_PASS1);
				container.add(db_pass_des);
				container.add(save);

				data_des.setSize(500, 300);
				data_des.setVisible(true);

				data_des.setResizable(true);
			}
		});

		dataconfig.setLayout(new GridLayout(0, 2));
		dataconfig.add(DB_URL);
		dataconfig.add(db_url);
		dataconfig.add(DB_NAME);
		dataconfig.add(db_name);
		dataconfig.add(DB_USER);
		dataconfig.add(db_user);
		dataconfig.add(DB_PASS);
		dataconfig.add(db_pass);
		dataconfig.add(change_destination);

		enrollment.setLayout(new GridLayout(0, 2));
		enrollment.add(new_enroll_label);
		enrollment.add(new_enroll);
		enrollment.add(pick_from__label);
		enrollment.add(pick_from);

		enrollment.add(enroll);

		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLocation(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(new GridLayout(1, 1));
		frame.setResizable(true);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.addTab("XML Config", icon, config);
		tabbedPane.addTab("Databse Config", icon, dataconfig);
		tabbedPane.addTab("Enroll", icon, enrollment);
		tabbedPane.addTab("Biometric", icon, biometric);

		tabbedPane.setBackground(Color.ORANGE);
		tabbedPane.setForeground(Color.BLUE);

		frame.getContentPane().add(tabbedPane);

	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

}