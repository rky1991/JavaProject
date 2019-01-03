package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class DropdownMenu {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws Throwable
	{ 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		Actions action =new Actions(driver);//action class has argument constructor
		action.moveToElement(menu).perform();
		/*WebElement sm =*/
		driver.findElement(By.xpath("//div[contains(text(),'Sales CRM')]")).click();;
		
}
}