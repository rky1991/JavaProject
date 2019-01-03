package seleniumAssign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UrbanLadder {
 
static {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	@Test
	public void loungeChairs() throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.urbanladder.com/");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// handle pop-up
		driver.findElement(By.xpath("//a[contains(text(), 'Close')]")).click();
		//assert on home page
		String ExpTitle="Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder";
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, ExpTitle, "Fail title not matching");
		WebElement living = driver.findElement(By.xpath("//span[contains(text(),'Living')]"));
		Actions action=new Actions(driver);
		Thread.sleep(1000);
		// mouse hover to living module
		action.moveToElement(living).perform();
		Thread.sleep(1000);
		//click on lounge chairs
		driver.findElement(By.xpath("//span[contains(text(),'Lounge Chairs')]")).click();
		//assertion on launge chairs page 
		String ExpTitle2="Lounge Chairs: Buy Designer Lounge Chairs Online In India - Urban Ladder";
		String aTitle2 = driver.getTitle();
		Assert.assertEquals(aTitle2, ExpTitle2,"Fail title not matching");
		//price of 3rd item 
		WebElement price3rd = driver.findElement(By.xpath("//span[contains(text(),'Genoa Wing Chair ')]/../div[contains(text(),'Floral')]/../../div[2]/span"));
		String price = price3rd.getText();
		System.out.println("3rd item price :-->"+price+"<--");
		StringBuffer sb=new StringBuffer(price);
		String price1 = sb.substring(1, price.length());
		String stringPrice = price1.replace(",","");
		System.out.println("-->"+stringPrice+"<--");
		int priceInt = Integer.parseInt(stringPrice);
		System.out.println(priceInt);
		int expPrice=20000;
		if(priceInt<expPrice) {
			System.out.println("price is less than "+expPrice);
		}
		else
			System.out.println("price is greater than "+expPrice);
		//click on product to dispaly product detail page to add to cart
		driver.findElement(By.xpath("//span[contains(text(),'Genoa Wing Chair ')]/../div[contains(text(),'Floral')]")).click();
		//assertion on product display page
		String ExpTitle3="Genoa Wing Chair - Urban Ladder";
		String aTitle3 = driver.getTitle();
		Assert.assertEquals(aTitle3, ExpTitle3,"Fail title not matching");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//scroll to y axis 200 pixel
		js.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(1000);
	    //click on add to cart button
		driver.findElement(By.id("add-to-cart-button")).submit();;
       

	    
		
		driver.quit();
		
	}
}