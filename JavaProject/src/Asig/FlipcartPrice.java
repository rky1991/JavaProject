package Asig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartPrice {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Four Star Irons']")).click();
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//a[.='Four Star Popular Plus FS-010 Dry Iron']/../a[3]/div/div[1]"));
	     System.out.println(price.getText());

	}

}
