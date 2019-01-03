package tys;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PumaMenu {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@Test
	public static void menu() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.puma.com");
		 WebElement mainMenu = driver.findElement(By.xpath("//ul[@class='digimeg-group digimeg-main-nav']"));
		 System.out.println(mainMenu.getText());
		 String xpath="//li[@id='men-subnav']//div[@class='digimeg-group-inner']//div[1]//ul[1]//li";
		 WebElement subMenu = driver.findElement(By.xpath(xpath));
		 String sub = subMenu.getText();
		 System.out.println("SubMenu under men:"+sub);
		
	}

}
