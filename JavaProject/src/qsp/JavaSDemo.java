package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class JavaSDemo {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws Throwable
	{ 
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://localhost/license.jsp;jsessionid=5fpd3wkq54968");
	  String xp="//h2[.='14. Miscellaneous']";
	  int x=	driver.findElement(By.xpath(xp)).getLocation().getX();
	  System.out.println(x);
	  int y=	driver.findElement(By.xpath(xp)).getLocation().getY();
	  System.out.println(y);
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	
	String code=("windows.scrollBy("+x+ "," +y+")");
	System.out.println(code);
	j.executeScript(code);

	    /*
	    String s1="window.scrollBy(0,400)";
		System.out.println();
		int y1=400;
		j.executeScript("window.scroll(0,"+y1+")");
		*/
		
		
}
}
