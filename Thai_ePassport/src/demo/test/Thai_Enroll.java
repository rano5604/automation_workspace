package demo.test;

import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Thai_Enroll {
	
	
	public static void main(String arg[]) throws FindFailed, InterruptedException
	{
		
		{
			Screen newScreen = new Screen();
			Pattern username = new Pattern("E:\\automation_workspace\\Thai_ePassport\\image\\username.JPG");
			Pattern password = new Pattern("E:\\automation_workspace\\Thai_ePassport\\image\\password.JPG");
			Pattern login = new Pattern("E:\\automation_workspace\\Thai_ePassport\\image\\login.JPG");
			Pattern login_page = new Pattern("E:\\automation_workspace\\Thai_ePassport\\image\\login_page.JPG");
			Pattern client = new Pattern("E:\\automation_workspace\\Thai_ePassport\\image\\client.JPG");
			
			
			
			newScreen.doubleClick(client);
			Thread.sleep(50000);
			//newScreen.findAll(login_page);
			//newScreen.click(login_page);
			newScreen.click(username);
			newScreen.type("op_1");
			newScreen.click(password);
			newScreen.type("Abc123");
			newScreen.click(login);
			
		}
	}

}
