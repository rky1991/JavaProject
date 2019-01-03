package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FacebookLoginJavaScript {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//JavascriptExecutor j=(JavascriptExecutor)driver;
	// javascript code to enter the value in user name and the password field, instead of selenium sendKey();
		
		//j.executeScript("document.getElementById('email').value='007aksingh1990@gmail.com'");
		//j.executeScript("document.getElementById('pass').value='9412821100'");
		//<button type="submit" class="button buttonBlue">Sign in</button>
		 //type ="submit" is not present we cant use .submit()
		
		driver.findElement(By.id("email")).sendKeys("007aksingh1990@gmail.com");
		driver.findElement(By.id("u_0_2")).submit();


	

	
	}


}