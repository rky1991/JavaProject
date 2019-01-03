package craftvilla;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CraftVillaArrayObj {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testObject() throws Exception{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		Thread.sleep(2000);
		WebElement saree = driver.findElement(By.xpath("//a[text()='SAREES']"));
		
		ArrayList<String> expected=new ArrayList<>();
		Collections.addAll(expected, "Embroidered Sarees","Printed Sarees","Woven Sarees","Half N Half Sarees","Regional Sarees","View All");
		ArrayList<String> actual =new ArrayList<>();
		
		Actions action= new Actions(driver);
		action.moveToElement(saree).perform();
		Thread.sleep(2000);
		//List<WebElement> subMenu = driver.findElements(By.xpath("//a[text()='SAREES']/..//li/a[text()='STYLE']/../ul"));
		List<WebElement> subMenu = driver.findElements(By.xpath("//li/a[text()='STYLE']/..//li"));
		for(WebElement subMenu1: subMenu){
			String s = subMenu1.getText();
			System.out.println(s);
			if(s==null){
			
			}else if(s.equals(" ")){
			
			}else {
				//add in list obj
			actual.add(subMenu1.getText());
		    //if view all comes it will terminate loop
			if(s.equals("View All")){
		    	
		    	break;
		    }
			}
		   
		}
		System.out.println(expected);
		System.out.println(actual);
		 if(expected.equals(actual)){
				System.out.println("pass");
			}
			else
				System.out.println("---->fail");
		Assert.assertEquals(actual, expected,"---->fail<---");
		
		
		
		
	//Thread.sleep(2000);
	driver.quit();
	}//@test

}//class
