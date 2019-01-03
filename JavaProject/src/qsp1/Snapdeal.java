package qsp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	
	public static void main(String []arg) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		Thread.sleep(9000);
		String xp="//a[@data-labelname='iphone x']";
	    
		driver.findElement(By.xpath(xp)).click();
		List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		ArrayList<Integer> allpriceNum=new ArrayList<>();
		for(WebElement price:allprice) {
			String text =price.getText().replaceAll("Rs.","").replaceAll(",", "");
			 allpriceNum.add(Integer.parseInt(text));	
		}
	   // two arguments in collection
		Collections.sort(allpriceNum,Collections.reverseOrder() );
		Thread.sleep(2000);
		System.out.println(allpriceNum.get(0));
	     
	   driver.close();
		
		
}
	}