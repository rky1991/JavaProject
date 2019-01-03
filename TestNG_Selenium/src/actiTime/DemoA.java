package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoA {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testDemo() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String aTitle = driver.getTitle();
		String eTitle="actiTIME - login";
		//Assert.assertEquals(aTitle, eTitle);// if test is failed it will not close browser its static class
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle,"comparing");
		driver.close();
		s.assertAll();
	}

}
