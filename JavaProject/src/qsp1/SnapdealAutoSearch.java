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

public class SnapdealAutoSearch {
	
	
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
		int count = allprice.size();
		System.out.println(count);
		System.out.println("**********************************");
		
        for(WebElement price:allprice) {
        	String text = price.getAttribute("data-price");
        	int intprice = Integer.parseInt(text);
        	allpriceNum.add(intprice);//add new integer converted list into arrayList(allpricenum)
        }
		Collections.sort(allpriceNum);// sort arraylist in ass order
		for(int num:allpriceNum) {
			
			System.out.println(num);//print all price present in arraylist
		}
		System.out.println("***************************************");
		System.out.println("The min price is: " + allpriceNum.get(0));//'0' index minimum price
		System.out.println("***************************************");
		System.out.println("The max price is: " + allpriceNum.get(count - 1));

	    
	    
	    
	    
	    
	    
	   
	     
	   driver.close();
		
		
}
	}