package qsp;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriFirefox {

	  static {
		  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		   
	     }
	public static void main(String []arg) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		all.remove(parent);
		for(String wh:all) {
			driver.switchTo().window(wh).close();
	         }
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[.='Later']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("input_resumeParser")).sendKeys("F:\\Rahul Kumar.pdf"); 


		
	}
}