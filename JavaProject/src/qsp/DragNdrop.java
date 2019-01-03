package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class DragNdrop {
	

	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args)throws Exception 
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
		
		
		
}
}