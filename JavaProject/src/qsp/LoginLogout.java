package qsp;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class LoginLogout {
	// if site is slow modify default time 500 ms; using explicit wait()
	// handle NoSuchElementException using explicit wait;
	static {
		/*String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
		*/
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
//Fluent wait program
	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		WebElement pas = driver.findElement(By.name("pwd"));
		pas.sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		wait.withTimeout(10,TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		// it should be at last wait.until
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		//driver.findElement(By.id("logoutLink")).click();
		


//		driver.close();
		
		
	}
}
		

		