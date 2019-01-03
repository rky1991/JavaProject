package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Printoption {

	  static {
		  //System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		   
	     }
	public static void main(String []arg) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		//switch to print popup:--
		for(String wh:driver.getWindowHandles())
		{
			
			driver.switchTo().window(wh);
			
		}
		driver.findElement(By.xpath("(//button[.='Cancel'])[1]")).click();	
		
	
	
	}
}