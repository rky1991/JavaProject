package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpHandle {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        
	}


	
	public static void main(String []arg) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.xpath("(//input)[2]")).click();
		driver.findElement(By.id("dtDOB")).click();
		
		
		
		
	}
}
