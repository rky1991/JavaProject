package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.Color;

public class ActiTimeLogin {

	static{
		String key="webdriver.chrome.driver";
		String value=".\\driver\\chromedriver.exe";
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) throws Exception {
		
		// to test title, user name,pass,login button is present of not 
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/rahulpvtltd/login.do");
	
	WebElement loginB = driver.findElement(By.id("loginButton"));
	               loginB.click();
         	
         	WebElement errmsg = driver.findElement(By.xpath("//span[contains(text(),'Username')]"));
       
         	 String color1 = errmsg.getCssValue("color");
         	 
         	System.out.println(color1);
          /* String hexcolor = Color.fromString(color1).asHex();
           if(hexcolor.equals("#ce0100"))
           {
        	   System.out.println("Pass: erro measge read color");
        	   
           }
           else
           {
        	   System.out.println("Fail : not red color");
        	   
           }*/

        	   
   }	
}


