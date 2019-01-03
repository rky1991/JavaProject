package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsers {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parent = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String child : allWindow) {
			
			if(!parent.equalsIgnoreCase(child)) {
			
			// switch to child browser:
			driver.switchTo().window(child);
			
			//close all the child browser:
			driver.close();
		
			}
			
			
		}
		Thread.sleep(5000);
		driver.quit();
		


	}

}
