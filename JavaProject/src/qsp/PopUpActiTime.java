package qsp;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class PopUpActiTime {
	// if site is slow modify default time 500 ms; using explicit wait()
	// handle NoSuchElementException using explicit wait;
	static {
		/*String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
		*/
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		WebElement pas = driver.findElement(By.name("pwd"));
		pas.sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='USERS']")).click();
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Rahul");
		Thread.sleep(3000);
		driver.findElement(By.id("closeUserDataLightBoxBtn")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		


//		driver.close();
		
		
	}
}
		

		