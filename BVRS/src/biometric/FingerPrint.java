package biometric;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FingerPrint {

	String newform_no;
	String id = null;
	Connection conn=null;
	PreparedStatement myStmt = null;
	
	final JPanel panel = new JPanel();
	
	public FingerPrint(Connection conn, String newform_no, String id)
	{
		this.conn = conn;
		this.newform_no = newform_no;
		this.id = id;
	}
	
	//PickBioData bd = new PickBioData(conn);
	//GetIdNo id = new GetIdNo(conn,newform_no);
	
	public void setFingerPrint(byte[] wsq_rt,byte[] wsq_ri,byte[] wsq_lt,byte[] wsq_li,byte[] wsq_rm,byte[] wsq_rr,byte[] wsq_rl,byte[] wsq_lm,
			byte[] wsq_lr,byte[] wsq_ll,byte[] minex_rt,byte[] minex_lt,byte[] minex_ri,byte[] minex_li,byte[] minex_rm,byte[] minex_rr,byte[] minex_rl,
			byte[] minex_lm,byte[] minex_lr,byte[] minex_ll,String quality_rm,String quality_rr,String quality_rl,String quality_lm,String quality_lr,
			String quality_ll,String quality_rt,String quality_ri,String quality_lt,String quality_li){
		
		String sql = "update biometric set wsq_rt=?,wsq_ri=?,wsq_lt=?,wsq_li=?,wsq_rm=?,wsq_rr=?,wsq_rl=?,wsq_lm=?,wsq_lr=?,wsq_ll=?,"
				+ "minex_rt=?,minex_lt=?,minex_ri=?,minex_li=?,minex_rm=?,minex_rr=?,minex_rl=?,minex_lm=?,minex_lr=?,minex_ll=?,quality_rm=?,"
				+ "quality_rr=?,quality_rl=?,quality_lm=?,quality_lr=?,quality_ll=?,quality_rt=?,quality_ri=?,quality_lt=?,quality_li=? where id=?";
		
		try{
			myStmt = conn.prepareStatement(sql);
			
			myStmt.setBytes(1, wsq_rt);
			myStmt.setBytes(2, wsq_ri);
			myStmt.setBytes(3, wsq_lt);
			myStmt.setBytes(4, wsq_li);
			myStmt.setBytes(5, wsq_rm);
			myStmt.setBytes(6, wsq_rr);
			myStmt.setBytes(7, wsq_rl);
			myStmt.setBytes(8, wsq_lm);
			myStmt.setBytes(9, wsq_lr);
			myStmt.setBytes(10, wsq_ll);
			myStmt.setBytes(11, minex_rt);
			myStmt.setBytes(12, minex_lt);
			myStmt.setBytes(13, minex_ri);
			myStmt.setBytes(14, minex_li);
			myStmt.setBytes(15, minex_rm);
			myStmt.setBytes(16, minex_rr);
			myStmt.setBytes(17, minex_rl);
			myStmt.setBytes(18, minex_lm);
			myStmt.setBytes(19, minex_lr);
			myStmt.setBytes(20, minex_ll);	
			
			myStmt.setInt(21, Integer.parseInt(quality_rm));
			myStmt.setInt(22, Integer.parseInt(quality_rr));
			myStmt.setInt(23, Integer.parseInt(quality_rl));
			myStmt.setInt(24, Integer.parseInt(quality_lm));
			myStmt.setInt(25, Integer.parseInt(quality_lr));
			myStmt.setInt(26, Integer.parseInt(quality_ll));
			myStmt.setInt(27, Integer.parseInt(quality_rt));
			myStmt.setInt(28, Integer.parseInt(quality_ri));
			myStmt.setInt(29, Integer.parseInt(quality_lt));
			myStmt.setInt(30, Integer.parseInt(quality_li));
			myStmt.setString(31,id);
			myStmt.executeUpdate();
			if(!myStmt.isClosed()){
				myStmt.close();
			}
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(panel, exc.getMessage(), "Error", 0);
		}
	}
	

}









