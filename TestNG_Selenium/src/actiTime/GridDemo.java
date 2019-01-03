package actiTime;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Parameters({"ip","browser"})
	@Test
	public void testDemo(@Optional("localhost")String ip,@Optional("chrome")String browser)throws Exception {
		
		//String ip="192.168.43.246";// use to run at node system
		//String local_ip="localhost";// use to run on same system;
		//String browser="chrome";
		
		
		URL url =new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(url, dc);
		driver.get("http://demo.actitime.com");
		
		//driver.get(link);
		for(int i=1;i<=100;i++) {
			WebElement unTB=driver.findElement(By.id("username"));	
			unTB.clear();
			unTB.sendKeys("admin");
			
		}
		driver.close();
		
	}

}
