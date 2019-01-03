package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseLastBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allWindow = driver.getWindowHandles();
		for(String child : allWindow) {
			
			// switch to last child browser:
			driver.switchTo().window(child);
		}
		//close the last browser:
		driver.close();

	}

}
