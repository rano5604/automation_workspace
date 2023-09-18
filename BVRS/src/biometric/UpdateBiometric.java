package biometric;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import util.CloseConnection;

public class UpdateBiometric {
	String URL;
	String User;
	String Password;
	String OLDFORM;
	String NEWFORM;
	String des_url_db;
	String des_user;
	String des_pass;
	boolean photo;
	boolean attachment;
	boolean signature;
	boolean iris;
	boolean fingerprint;
	
	Connection myConn = null;


	String id = null;


	final JPanel panel = new JPanel();

	public UpdateBiometric(String URL, String User, String Password, String oldform_no, String newform_no,boolean photo,
			boolean attachment,boolean signature,boolean iris,boolean fingerprint,String des_url_db,String des_user, String des_pass ) {
		this.URL = URL;
		this.User = User;
		this.Password = Password;
		this.OLDFORM = oldform_no;
		this.NEWFORM = newform_no;
		this.attachment = attachment;
		this.iris = iris;
		this.photo = photo;
		this.signature = signature;
		this.fingerprint = fingerprint;
		this.des_pass = des_pass;
		this.des_url_db = des_url_db;
		this.des_user = des_user;

	}

	public void setBiometric(String new_no, String old_no) throws SQLException, IOException {
		try {
			myConn = DriverManager.getConnection(des_url_db, des_user, des_pass);

			PickBioData pd = new PickBioData(URL, User, Password);
			pd.pickValues(OLDFORM);

			GetIdNo gd = new GetIdNo(myConn, NEWFORM);
			id = gd.getId();


			if(id!=null){
				if(fingerprint){
					FingerPrint fp = new FingerPrint(myConn, NEWFORM, id);
					fp.setFingerPrint(pd.wsq_rt, pd.wsq_ri, pd.wsq_lt, pd.wsq_li, pd.wsq_rm, pd.wsq_rr, pd.wsq_rl, pd.wsq_lm,
							pd.wsq_lr, pd.wsq_ll, pd.minex_rt, pd.minex_lt, pd.minex_ri, pd.minex_li, pd.minex_rm, pd.minex_rr,
							pd.minex_rl, pd.minex_lm, pd.minex_lr, pd.minex_ll, pd.quality_rm, pd.quality_rr, pd.quality_rl,
							pd.quality_lm, pd.quality_lr, pd.quality_ll, pd.quality_rt, pd.quality_ri, pd.quality_lt,
							pd.quality_li);
				}


				if(photo){
					Photo img = new Photo(myConn, id, pd.photo);
					img.setPhoto();
				}

				if(signature){
					Signature sign = new Signature(myConn, id, pd.signature);
					sign.setSignature();
				}

				if(iris){
					Iris eye = new Iris(myConn, id, pd.re,pd.le);
					eye.setSignature();
				}

				if(attachment){
					Attachment attach = new Attachment(myConn, id);
					attach.setAttachment(pd.doc_form_p1,pd.doc_form_p2,pd.doc_birth_certificate,pd.doc_passport,pd.doc_special_p1,
							pd.doc_special_p2,pd.field1,pd.field2,pd.doc_migration_p1,pd.doc_migration_p2,pd.doc_proof_copy,pd.doc_ssc);
				}

				JOptionPane.showMessageDialog(panel, "Bio-metric Data Inserted Successfully", NEWFORM, 1, null);

				System.out.println("\n" + NEWFORM + " Bio-metric Completed successfully!");
				CloseConnection closeConn = new CloseConnection(myConn);
				closeConn.closeConnection();
			}
			else 
				JOptionPane.showMessageDialog(panel,"Give a Correct New Form No");

		} catch (Exception exc) {
			JOptionPane.showMessageDialog(panel, "Nothing Found New Form No:"+exc.getMessage(), "Error", 0);
		} finally {
		}

	}

}
