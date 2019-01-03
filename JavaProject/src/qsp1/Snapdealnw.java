
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

public class Snapdealnw {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	public static void main(String []arg) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		
		Thread.sleep(5000);

String xp = "(//a[@data-labelname='iphone x'])[1]";
		driver.findElement(By.xpath(xp)).click();
		
		Thread.sleep(9000);

String price_xp = "//span[@class='lfloat product-price']";
		List<WebElement> allPrice = driver.findElements(By.xpath(price_xp));
		
		int count = allPrice.size();
		System.out.println(count);
		System.out.println("--------------------------");

ArrayList<Integer> allPriceNum = new ArrayList<>();
		
		for(WebElement price:allPrice)
		{
			String text = price.getAttribute("data-price");
			int v = Integer.parseInt(text);
			allPriceNum.add(v);
			//System.out.println(text);
		}
		
		Collections.sort(allPriceNum);
		
		for(Integer num:allPriceNum)
		{
			System.out.println(num);
		}
		System.out.println("---------------------------");
		System.out.println("The min price is: " + allPriceNum.get(0));
		System.out.println("---------------------------");
		System.out.println("The min price is: " + allPriceNum.get(count - 1));
		
		driver.close();
	}
}
    /*
       // ****Without getText()***
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		
		Thread.sleep(5000);

String xp = "(//a[@data-labelname='iphone x'])[1]";
		driver.findElement(By.xpath(xp)).click();
		
		Thread.sleep(9000);

String price_xp = "//span[@class='lfloat product-price']";
		List<WebElement> allPrice = driver.findElements(By.xpath(price_xp));
		
		int count = allPrice.size();
		System.out.println(count);
		System.out.println("--------------------------");
		
		ArrayList<Integer> allPriceNum = new ArrayList<>();
		
		for(WebElement price:allPrice)
		{

String text = price.getText().replaceAll("Rs. ", "").replaceAll(",", "");
			allPriceNum.add(Integer.parseInt(text));
			
			
		}
		
		System.out.println("---------------------------");
		Collections.sort(allPriceNum);
		System.out.println("The min price is: " + allPriceNum.get(0));
		System.out.println("---------------------------");
		Collections.sort(allPriceNum, Collections.reverseOrder());
		System.out.println("The max price is: " + allPriceNum.get(0));
		
		driver.close();
	}
}*/