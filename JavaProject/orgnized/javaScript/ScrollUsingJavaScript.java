package javaScript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ScrollUsingJavaScript {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//scroll verticaly
		for(int i=0;i<=10;i++) 
		   {
			j.executeScript("window.scrollBy(0,200)");
			Thread.sleep(5000);
	      	}
		for(int i=0;i<=10;i++) 
		   {
			j.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(5000);
	      	
		   }

	
	}
}
