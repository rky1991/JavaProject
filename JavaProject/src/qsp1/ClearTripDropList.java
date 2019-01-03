package qsp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripDropList {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String []arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("FromTag")).sendKeys("Bang");
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ToTag")).sendKeys("del");
		driver.findElement(By.xpath("//a[contains(text(),'Indira Gandhi')]")).click();
		driver.findElement(By.xpath("(//a[text()='5'])[2]")).click();
		List<WebElement> adult = driver.findElements(By.xpath("(//select)[1]"));
		/*for(WebElement al:adult) {
			System.out.println("Adults :"+al.getText());
			
		}*/
		for(int i=0;i<adult.size();i++) {
			System.out.println("Adults :"+adult.get(i).getText());
			
		}
		System.out.println("*********************");
		List<WebElement> children = driver.findElements(By.xpath("(//select)[2]"));
		for(WebElement ch:children) {
			System.out.println("Children :"+ch.getText());
		}
		System.out.println("*********************");
		List<WebElement> infant = driver.findElements(By.xpath("(//select)[3]"));
		for(WebElement inf:infant) {
			System.out.println("Infant :"+inf.getText());
		}
		
		
		//driver.findElement(By.id("SearchBtn")).click();
		//Thread.sleep(2000);
		
		
		
		
		
		
	}

}
