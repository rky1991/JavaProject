package Asig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/javaScriptDemo.html");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("alert('hello')");// javascript Pop-Up
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		java.lang.Object element = j.executeScript("document.getElementById('t1').value='bang'");
		System.out.println(element);
		
			
			

	}

}
