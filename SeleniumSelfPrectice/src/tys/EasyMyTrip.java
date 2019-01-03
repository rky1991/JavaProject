package tys;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EasyMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void airLine() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com");
		Thread.sleep(1000);
		ChromeOptions opt=new ChromeOptions();
		
		
		//findelement synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@class='border-lft flig-show click-one bg-color']")).click();
		
		driver.findElement(By.id("FromSector_show")).sendKeys("Banga");
		
		
		
		
		
		
		driver.findElement(By.id("Editbox13_show")).sendKeys("Delhi(DEL)");
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		driver.findElement(By.xpath("//li[@id='fst_5_02/11/2018']")).click();
		driver.findElement(By.xpath("//input[@class='src_btn']")).click();
		
		
		
		
	}


}
