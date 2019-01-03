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



public class NaukriPopUp {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws Exception
	
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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