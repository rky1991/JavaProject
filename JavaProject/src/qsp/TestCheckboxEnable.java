package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckboxEnable {

	static{
		String key="webdriver.chrome.driver";
	String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/site_map.php");
		int a=10,b=20;
		if(a<b) {}
		
		
		
		
}
}
