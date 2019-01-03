package qsp;

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

public class DownloadJava {

	  static {
		  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		  //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		   
	     }
	public static void main(String []arg) throws AWTException, InterruptedException {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.seleniumhq.org/download");
		//driver.findElement(By.xpath("//a[.='Download']")).click();
		driver.findElement(By.xpath("//td[.='Java']/../td[4]/a")).click();
		// for fire fox browser specific code because a pop up come to handle that:
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		
		
		
		
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		
		
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}

