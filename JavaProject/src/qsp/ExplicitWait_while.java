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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait_while {
	// if site is slow modify default time 500 ms; using explicit wait()
	// handle NoSuchElementException using explicit wait;
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
	// Logic of custom wait synchronization , ex. of explicit wait
	// infinite while loop until home page loaded ;
	//after geting the title of home page the while loop get break ; otherwise it is infinite loop
		while(true) {
			String title = driver.getTitle();
			if(title.contains("Enter")) {
				System.out.println("Home Page :"+title);
			   break;  
		       	}
			else {
				System.out.println("waiting for Home page :");
			    }
		}
		System.out.println("End");
		driver.close();
		
		
	}
}
		

		