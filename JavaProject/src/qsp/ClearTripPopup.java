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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTripPopup {

	  static {
		 // System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		   
	     }
	public static void main(String []arg) throws AWTException, InterruptedException {
		
		//WebDriver driver=new FirefoxDriver();
		ChromeOptions options=new ChromeOptions();// browser settings constructor overloading
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.cleartrip.com");
		//can not inspect popup in this website
		// its is notification pop up just below to bar:..can handle using browser settings: 
		//naukri.com popup hiddne division popup
		
		
	}
}