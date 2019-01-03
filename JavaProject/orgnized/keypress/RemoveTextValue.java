package keypress;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class RemoveTextValue {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws Throwable
	{ 
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/js.html");
	/*	JavascriptExecutor j=(JavascriptExecutor)driver;
		String code="document.getElementById('t1').value=''\r\n";
		Thread.sleep(2000);
		j.executeAsyncScript(code);
		*/
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.id("t1"));
		s.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		s.sendKeys(Keys.DELETE);
		
	}
}