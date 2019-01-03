package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.get("http://localhost/login.do");
		
		// access LoginPage POM class :--
		
		LoginPage login =new LoginPage(driver);
		
		login.setUserName("admin");
		login.setPassword("manager");
		login.loginClick();
		
		// access HomePage POM class :--
		
		Hompage user=new Hompage(driver);
		Thread.sleep(1000);
		user.clickUser();
		
		// access UserList page class:--- 
		
		UserListPage u=new UserListPage(driver);
		
		u.clickAddUser();
		Thread.sleep(1000);
		u.setFirstName("rahul");
		u.clickClose();
		u.clickOnAlert(driver);
	
		
		
		
		
		
		


	}

}
