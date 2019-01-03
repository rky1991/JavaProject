package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class JavaScriptCode {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/javaScriptDemo.html");

		JavascriptExecutor j=(JavascriptExecutor)driver;
		 j.executeScript("alert('hii')");
		
		
	}
}	