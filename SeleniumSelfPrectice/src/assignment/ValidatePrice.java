package assignment;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatePrice {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void priceValidate() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		String xpItem="//div[text()='HP DeskJet Ink Advantage 3835 All-in-One Multi-function Wireless Printer']";
		driver.findElement(By.xpath(xpItem)).click();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]")).click();
		int price1QT=5499;
		int price3QT=price1QT*3;
		System.out.println("Expected Price"+price3QT);
		Thread.sleep(1000);
		WebElement qtBox = driver.findElement(By.xpath("//input[@class='_2csFM9']"));
		qtBox.clear();
		Thread.sleep(500);
		qtBox.sendKeys("3");
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']")).getText();
		String priceStr = price.substring(1,price.length()).replace(",","");
		int intPrice = Integer.parseInt(priceStr);
		System.out.println("price afterAdd 3 qt :"+intPrice);
		Assert.assertEquals(intPrice, price3QT);
		System.out.println("validation is done ");
		Thread.sleep(5000);
		driver.quit();
	}

}
