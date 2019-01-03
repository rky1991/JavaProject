package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoAutoSugg {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	
	public static void main(String []arg) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.get("https://www.trivago.com/");
		driver.findElement(By.id("horus-querytext")).sendKeys("Bang");
		String xp="//span[contains(text(),'International Airport')]";
	    driver.findElement(By.xpath(xp)).click();
	    Thread.sleep(5000);
	    //String xp2="(//h3[@title])[1]";// first hotel out of 25 match
	    String xp2="(//h3[@title])";
	    List<WebElement> names = driver.findElements(By.xpath(xp2));
	    int count = names.size();
	    System.out.println(count);
	    List<WebElement> prices = driver.findElements(By.cssSelector(".item__best-price"));
	    for(int i=0;i<count;i++) {
	    	String n = names.get(i).getText();
	    	String p = prices.get(i).getText();
	    	System.out.println("Name:"+n+"prices:"+p);
	    	
	    }
	   
	     
	   driver.close();
		
		
}
	}