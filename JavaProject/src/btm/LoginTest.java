package btm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	WebElement un = driver.findElement(By.id("username"));
	driver.navigate().refresh();//after refresh page loaded with diff address that is why staleelement exception
	un.sendKeys("admin");

	driver.close();
	}
}