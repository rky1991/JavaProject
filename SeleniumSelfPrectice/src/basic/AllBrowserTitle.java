package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBrowserTitle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.naukri.com");
		Thread.sleep(1000);
		
		//get the window handle and title of parent browser
		String parent = driver.getWindowHandle();
		System.out.println("windoHandle of Parent : "+parent);
		System.out.println("Title Of Parent Window: "+driver.getTitle());
		
		//get the window handles and title of parent and child browsers:
		Set<String> allwindows = driver.getWindowHandles();
		int size = allwindows.size();
		System.out.println(size);
		for(String child : allwindows) {
			System.out.println("window handles: "+child);
			
			//compare parent window and child window, if not equals print child window and title
			if(!parent.equalsIgnoreCase(child)) {
			
			driver.switchTo().window(child);
			
			System.out.println("title of browsers :"+driver.getTitle());
			Thread.sleep(1000);
			
			driver.close();
			
			
			}
		}//for end
		
		
		
		driver.quit();
	

	}

}
