package qsp;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class GoogleDrive {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}
// program to perfor composit action control press and click on a link
	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://drive.google.com");
		driver.findElement(By.xpath("(//a[.='Go to Google Drive'])[2]")).click();
		//Thread.sleep(1000);
		
		WebElement id = driver.findElement(By.id("identifierId"));
		id.sendKeys("rky1991");
		//click on next
		driver.findElement(By.xpath("//span[.='Next']")).click();
		//Thread.sleep(1000);
	
	   WebElement pas = driver.findElement(By.name("password"));
	   pas.sendKeys("rahul@#9412821100");
	   //click on next button:
		driver.findElement(By.xpath("//span[.='Next']")).click();
		//Thread.sleep(9000);//slower the selenium to make loading the web page
	
		driver.findElement(By.xpath("//span[text()='My Drive']")).click();
		Thread.sleep(1000);
		String s="//span[text()='bugs of jira']";
		// xpath of folder in google drive;
		
		WebElement folder = driver.findElement(By.xpath(s));
		Actions action=new Actions(driver);
		action.doubleClick(folder).perform();
	
		
		
		///
		
		
		
		
		
		/*WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions=new Actions(driver);
		  actions.contextClick(link).perform();//right click on link
		  Thread.sleep(2000);
	//robot class use to keyboard and mouse actions
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_W);// press the key 'w' to open a link in new window
		  Thread.sleep(1000);
		  
		  */
}
	
}