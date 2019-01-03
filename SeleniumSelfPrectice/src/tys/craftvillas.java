package tys;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.testng.internal.junit.ArrayAsserts;

public class craftvillas {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@Test
	public static void sareePriceFilter()  {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.findElement(By.id("searchval")).sendKeys("saree");
		driver.findElement(By.className("input-group-btn")).click();
		//geting and clicking range of product  
		WebElement range = driver.findElement(By.xpath("//span[.='500-1000']"));
		
		//WebElement range = driver.findElement(By.xpath("//span[.='1000-2000']"));
		range.click(); 
		String aRange = range.getText();
		System.out.println("Range of the Product"+aRange);
		 
		
		 //geting minimun range
		String minRangeS = aRange.substring(0,3);
		int minRange = Integer.parseInt(minRangeS);
		System.out.println("Minimum range :"+minRange);
		
		//geting max range...
		String maxRangeS = aRange.substring(4, aRange.length());
		int maxRange = Integer.parseInt(maxRangeS);
		System.out.println("maximum range :"+maxRange);
		
		//finding prices of 3rd saree range 500-1000
		
		WebElement price = driver.findElement(By.xpath("//div[@class='product-row']/div[3]/div/div[2]/p/span[1]"));
		//System.out.println(price.getText());
		String strPrice = price.getText();// ? 789
		// remove ?and get price in string
		String strPrice1 = strPrice.substring(1,strPrice.length());
		//remove 2 space from string to convert that in to integer
		String strPrice2 = strPrice1.replaceAll(" ","").replaceAll(" ", "");
		//convert string in to string
		int actualPrice = Integer.parseInt(strPrice2);
		System.out.println("Actual Price:"+actualPrice);
		
		//SoftAssert assertion =new SoftAssert();
		Assert.assertTrue(actualPrice>=minRange && actualPrice<=maxRange, "fail");
		System.out.println("test is pass");
		
		
//		if(actualPrice>=minRange && actualPrice<=maxRange) {
//		
//			assertion.assertNotEquals(actualPrice, minRange," actual price is less than given range");
//			assertion.assertEquals(actualPrice, maxRange," actual price is greater than given range");
//			
//			
//			assertion.assertAll();
//
//			
//		}
//		
		
		
	
		driver.quit();
	
	}



}
