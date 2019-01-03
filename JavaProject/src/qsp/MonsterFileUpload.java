package qsp;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterFileUpload {

	  static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		   
	     }
	public static void main(String []arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
	
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		all.remove(parent);
		for(String wh:all) {
			driver.switchTo().window(wh).close();
		}
		Thread.sleep(500);
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("mob_no")).sendKeys("7983301671");
		driver.findElement(By.id("wordresume")).sendKeys("F:\\Rahul Kumar.pdf");
		//File f=new File("./cv/Rahul Kumar.doc");
	
		driver.findElement(By.id("wordresume")).sendKeys();
		driver.findElement(By.id("pop_sbm")).click();
		
		
		//driver.close();
		
	}
	
}
