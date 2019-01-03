package fbLoginFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(6000);
		LoginPage l=new LoginPage(driver);
		l.setUserName("007aksingh1990@gmail.com");
		
		l.setPassword("rahul1991");
		l.loginClick();

	}

}
