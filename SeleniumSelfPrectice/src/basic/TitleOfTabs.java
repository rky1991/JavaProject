package basic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfTabs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println("parent window is :"+parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		// convert set to ArrayList
		ArrayList<String> tabs=new ArrayList<>(allWindows);
		
		//get the title based on index value of windohandle
		WebDriver WHandle3 = driver.switchTo().window(tabs.get(3));
		System.out.println("Window Handle :"+WHandle3);
		System.out.println("Window Title :"+WHandle3.getTitle());
		driver.close();
		
		WebDriver WHandle2 = driver.switchTo().window( tabs.get(2));
		System.out.println("Window Handle :"+WHandle2);
		System.out.println("Window Title :"+WHandle3.getTitle());
		driver.close();
		
		WebDriver WHandle1 = driver.switchTo().window( tabs.get(1));
		System.out.println("Window Handle :"+WHandle1);
		System.out.println("Window Title :"+WHandle3.getTitle());
		driver.close();
		
		WebDriver WHandle0 = driver.switchTo().window( tabs.get(0));
		System.out.println("Window Handle :"+WHandle0); 
		System.out.println("Window Title :"+WHandle3.getTitle());
		
		//driver.quit();

	}

}
