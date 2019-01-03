package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartPopUp {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        
	}


	
	public static void main(String []arg) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("(//button)[2]")).click();;
		
		
		
		
	}
}
