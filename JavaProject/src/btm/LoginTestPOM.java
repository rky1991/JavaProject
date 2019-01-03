package btm;

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
		LoginPagePOM l=new LoginPagePOM();// constructor of LoginPagePOM
		PageFactory.initElements(driver, l);// pas page as ref variable of loginPagePOM class
		System.out.println("click Login1");
		l.clikLogin();
		Thread.sleep(1000);
		System.out.println("Click login2");
		l.clikLogin();
		
		
		driver.close();
		
	}
}