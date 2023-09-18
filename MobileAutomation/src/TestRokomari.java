import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TestRokomari {
	
	@SuppressWarnings("rawtypes")
	static AppiumDriver driver;
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] arg) throws MalformedURLException{
		DesiredCapabilities capability = new DesiredCapabilities();
		
		 capability.setCapability(CapabilityType.BROWSER_NAME, "");
		 capability.setCapability("deviceName", "HuaweiP9Lite");
		 capability.setCapability("platformVersion", "7.0");
		 capability.setCapability("platformName", "Android");
		 capability.setCapability("appPackage", "com.rokomari");
		 capability.setCapability("appActivity", "com.rokomari.SplashActivity");
		 
		 driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capability);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 try{
			 @SuppressWarnings("unchecked")
			 List<WebElement> item = driver.findElements(By.xpath("//android.support.v4.widget.DrawerLayout[@bounds='[0,72][1080,1812]']"));
			 for(WebElement i:item){
				 System.out.println(i.getClass());
			 }
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.findElementByXPath("//android.widget.ImageView[@bounds='[960,96][1080,216]']").click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.findElementByXPath("//android.widget.LinearLayout[@bounds='[192,610][1080,754]']").click();
		 }catch(Exception e){
			 System.out.println(e.getMessage());
		 }

	}
		 

}
