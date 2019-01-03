package qsp;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FindElementsLinksFlipcart {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}
// use FINDELEMENTS() to find all the pesent link on flipcart:
	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/collectio.html");
		List<WebElement> links; 
		links = driver.findElements(By.tagName("a"));
		int count = links.size();
		
	for(int i=0;i<count;i++)
	{
		WebElement link1 = links.get(i);
		String text = link1.getText();
		System.out.println(text);
		
	}
		/*for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i));
			
		}*/
		System.out.println(links.size());
		
	}
}