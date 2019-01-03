package qsp;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class RightClickAction {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}
// program to perfor composit action control press and click on a link
	public static void main(String[] args) throws Exception
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions=new Actions(driver);
		  actions.contextClick(link).perform();//right click on link
		  Thread.sleep(2000);
	//robot class use to keyboard and mouse actions
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_W);// press the key 'w' to open a link in new window
		  Thread.sleep(1000);
		  Set<String> allwhs = driver.getWindowHandles();
		  //System.out.println(allwhs);
	
		  for(String wh:allwhs) {
			  driver.switchTo().window(wh);  
			  
		  }// end for loop
		  String title=driver.getTitle();
		  System.out.println(title);
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		  Thread.sleep(1000);
		  driver.close();
		  
		
}
}