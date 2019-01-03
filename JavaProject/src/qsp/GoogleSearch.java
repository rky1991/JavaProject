package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	
	public static void main(String []arg) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		List<WebElement> allas = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		int count = allas.size();
		System.out.println(count);
		for(WebElement e:allas) {
			
			System.out.println(e.getText());
			
		}
		allas.get(0).click();
	}

}
