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

public class ActitimeLoginLogout {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}
// program to perform actitime login and logout actime application
	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
	
		WebElement pas = driver.findElement(By.name("pwd"));
		pas.sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);// for load the home page and get the correct title.
		String title = driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.id("logoutLink")).click();
		
		
		driver.close();
		
	
		
}
	}