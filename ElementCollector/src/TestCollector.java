import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCollector {
	
	static WebDriver driver;
	
	public static void main (String [] args){
		
		System.setProperty("webdriver.chrome.driver", "E:\\AndroidAutomation\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://mirpur-dhaka.infoisinfo.com.bd/search/hardware");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		findElement("//a");
		
	
	}
	
	public static void findElement(String selector){
		List<WebElement> elements = driver.findElements(By.xpath(selector));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for(WebElement ele:elements){
			if(!ele.getText().isEmpty()){
				ele.click();
				driver.findElement(By.xpath("//i[@class='icon-phone']")).click();
				WebElement phone=driver.findElement(By.xpath("//a[@class='phone trigger-call']"));
				System.out.println(ele.getText());
				System.out.println(phone.getText());
				
			}		
		}
	}
}
