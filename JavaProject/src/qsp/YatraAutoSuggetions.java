package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraAutoSuggetions {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	
	public static void main(String []arg) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.get("https://www.yatra.com/");
		//driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Ban");
		driver.findElement(By.id("booking_engine_hotels")).click();
		driver.findElement(By.id("BE_hotel_destination_city")).sendKeys("ban");;
		List<WebElement> allas = driver.findElements(By.xpath("//strong[text()='Ban']"));
		int count = allas.size();
		System.out.println(count);
		/*for(WebElement e:allas) {
			
			System.out.println(e.getText());
			
		}*/
		allas.get(0).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("04/09/2018")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("BE_hotel_checkout_date")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("09/09/2018")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("BE_hotel_htsearch_btn")).click();
		Thread.sleep(2000);
		//close the 
		driver.findElement(By.xpath("//img[contains(@ng-src,'flexi-stay')]")).click();
		String xp="//p[text()='For 5 nights'][1]/following-sibling::p[1]";
		WebElement price = driver.findElement(By.xpath(xp));
		System.out.println(price.getText());
	/*	for(WebElement e:price) {
		
		System.out.println(e.getText());
		
	}*/
	

		
	
	}

}
