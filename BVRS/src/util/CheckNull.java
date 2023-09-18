package util;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckNull {
	
	final JPanel panel = new JPanel();
	
	public int checkDatabaseInfo(String url, String db, String user, String pass )
	{
		if(url.isEmpty() || db.isEmpty() || user.isEmpty() || pass.isEmpty() ){
			JOptionPane.showMessageDialog(panel,"Check Database Info, Something is missing","Error",0);	
			return 0;
		}
		return 1;
			
	}
	
	public int checkDataInfo(String newform, String oldform)
	{
		if(newform.isEmpty() || oldform.isEmpty()){
			JOptionPane.showMessageDialog(panel,"Check Form Info, Something is missing","Eorror",0);	
			return 0;
		}
		return 1;
	}
	
	public int checkOldForm(String oldform)
	{
		if(oldform.isEmpty()){
			JOptionPane.showMessageDialog(panel,"Old Form No is Missing","Error",0);	
			return 0;
		}
		return 1;
			
	}
	
	public int checNewForm(String newform)
	{
		if(newform.isEmpty()){
			JOptionPane.showMessageDialog(panel,"New Form No is Missing","Error",0);	
			return 0;
		}
		return 1;
			
	}
	public int checkAll(String url, String db, String user, String pass,String oldform, String newform)
	{
		if(url.isEmpty() || db.isEmpty() || user.isEmpty() || pass.isEmpty() ||newform.isEmpty() || oldform.isEmpty()){
			JOptionPane.showMessageDialog(panel,"Check Info, Something is missing","Eorror",0);	
			return 0;
		}
		return 1;
			
	
	}

}
