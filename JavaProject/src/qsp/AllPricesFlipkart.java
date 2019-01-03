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



public class AllPricesFlipkart {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
// use FINDELEMENTS() to find all the pesent link on flipcart:
	public static void main(String[] args) throws Exception
	{ 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		String xp="//div[starts-with(text(),'From') or starts-with(text(),'Now')]";
		 List<WebElement> allprice = driver.findElements(By.xpath(xp));
		 int count= allprice.size();
		 System.out.println("***************");
		 for(int i=0;i<count;i++)
		 {
			 WebElement price = allprice.get(i);
			 String text = price.getText();
			 if(text.length()>0) {
				 System.out.println(text);
			 }
			 
		 }
		 System.out.println("**********************");
		
		
		
		
	}
}