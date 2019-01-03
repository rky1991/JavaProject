package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class MultipleActions {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}
// program to perform composite action control press and click on a link
	public static void main(String[] args) throws Throwable
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click().perform();
		
}
}