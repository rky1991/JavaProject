package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links);
		links.get(links.size()-1).click();
		driver.quit();
	}

}
