package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.naukri.com");

		// get the windowHandles of browsers
		
		String parent_wh = driver.getWindowHandle();
		System.out.println(parent_wh);
		Set<String> whs = driver.getWindowHandles();
		int size = whs.size();
		System.out.println(size);
	
		for(String awhs : whs) {
			
			System.out.println(awhs);
		}
		
		driver.quit();

	}

}
