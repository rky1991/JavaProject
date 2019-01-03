package qsp;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class LoginActiTime {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://desktop-f318asa/login.jsp");
		driver.get("http://localhost/login.do");
		
		
		
		WebElement log = driver.findElement(By.id("loginButton"));
		log.click();
		WebElement eMsg = driver.findElement(By.xpath("//span[contains(text(),'Username')]"));////span[contains(text(),'Username')]
		 String j = eMsg.getCssValue("color");
		System.out.println(j);
		String fmly = eMsg.getCssValue("font-family");
		System.out.println(fmly);
		if(fmly.contains("Verdana")) {
			System.out.println("pass:Verdana-fontfamily");
		}
		else {
			System.out.println("fail:fontfamily");
		}
		String t = eMsg.getCssValue("font-size");
		System.out.println(t+ "fontsize");
		if(t.equals("12px")) {
			System.out.println("pass:fontsize");
		}
		else {
			System.out.println("fail");
		}
		String hexColor = Color.fromString(j).asHex();
		System.out.println(hexColor+"errormsg color");
		if(hexColor.equals("#ce0100"))
		{System.out.println("pass:error msg in red");
		}
		else {
			System.out.println("fail:error msg is not in red");
		}
		
	    driver.close();	
	    
	}
}
