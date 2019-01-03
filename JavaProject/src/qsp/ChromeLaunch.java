package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	static{
		String key="webdriver.chrome.driver";
	String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//if(actualTitle.equals("expectedTitle"))
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		WebElement ob=driver.findElement(By.id("email"));
	
	
		driver.close();

	}

}
