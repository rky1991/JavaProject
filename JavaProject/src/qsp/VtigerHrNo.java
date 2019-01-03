package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class VtigerHrNo {
	

	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		 WebElement resource = driver.findElement(By.xpath("//a[.='Resources']"));
		 resource.click();
		 Actions action=new Actions(driver);
		 action.moveToElement(resource);
		 WebElement contact = driver.findElement(By.xpath("//a[.='Contact']"));
		 contact.click();
		 JavascriptExecutor scroll=(JavascriptExecutor)driver;
		 scroll.executeScript("window.scrollBy(0,1000)");
		 WebElement hr = driver.findElement(By.xpath("//div[.='Human Resources	']/../div[2]"));
		 String no = hr.getText();
		 System.out.println(no);
		
		driver.close();
}
}