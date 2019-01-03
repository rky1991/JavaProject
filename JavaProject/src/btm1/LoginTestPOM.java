package btm1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPOM {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
//by this program we are handle StaleElementReferenceException using POM(page object model class)
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPagePOM l=new LoginPagePOM(driver);// constructor of LoginPagePOM
		l.setUserName("admin");
		Thread.sleep(2000);
		l.setPasword("manager");
		l.clikLogin();
		System.out.println("clicked Login");
		
		driver.close();
		
	}
}