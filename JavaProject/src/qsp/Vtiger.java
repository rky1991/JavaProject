package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Vtiger {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/index.php");
		JavascriptExecutor j=(JavascriptExecutor)driver;
	// javascript code to enter the value in user name and the password field, instead of selenium sendKey();
		j.executeScript("document.getElementById('username').value='admin'");
		j.executeScript("document.getElementById('password').value='admin'");
		//<button type="submit" class="button buttonBlue">Sign in</button>
		// type ="submit" is not present we cant use .submit()
		//driver.findElement(By.xpath("//button[.='Sign in']")).submit();
		driver.findElement(By.xpath("//button[.='Sign in']")).sendKeys(Keys.ENTER);


	

	
	}


}