package btm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
	 // below code is also for staleElementException page reloaded again with different address
		
		LoginPage loginPage=new LoginPage(driver);
		System.out.println("click Login1");
		loginPage.clikLogin();
		Thread.sleep(1000);
		System.out.println("click login2");
		loginPage.clikLogin();
		
		
		driver.close();

	}

}
