package craftvilla;


import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.Utility;

public class CraftVilla {
	static{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
	static String path="./Data/B.xlsx";
	static String sheet="Sheet1";
	static int r=1;
	static int c=0;
	
	@Test
	public void testData() throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		//WebElement sareeMM = driver.findElement(By.xpath("//nav[@id='mega-menu']/div/ul/li[2]/a"));
		
		//**************************************** main menu
		System.err.println("********* Main Menue Section***********");
		List<WebElement> MM = driver.findElements(By.xpath("//nav[@id='mega-menu']/div/ul/li/a"));
		for(WebElement menu:MM){
			if(menu.getText().length()!=0)
			System.out.println(menu.getText());
		}
		
		int rowCount = Utility.getXLRowCount(path,sheet);
		System.out.println("--->"+rowCount+"<<----");
		
		String data = Utility.getXLData(path, sheet, r, c);
//		for(int i=0;i<=rowCount;i++){
//			for(int j=0;j<){
//				System.out.println("------->>>"+data+"<<<-------");
//			}
//		}
//		
		
		
		//*********************************** creating actions class
		WebElement saree = driver.findElement(By.xpath("//a[.='SAREES']"));
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.moveToElement(saree).perform();
	
		//************************************ sub meneus of sarees 
		System.err.println("*********Sub Menues Under Saree Section***********");
		Thread.sleep(3000);
	    List<WebElement> subMenuSaree = driver.findElements(By.xpath("//ul[@class='ds-flex']"));
	    for(WebElement allSub:subMenuSaree){
	    if(allSub.getText().length()!=0)
	    	System.out.println(allSub.getText());
	  
	       }
	    //******************************************************** sub menus of kurti 
	    System.err.println("*********Sub Menues Under KURTIS & DRESSES  Section***********");
	    WebElement kurtiNDress = driver.findElement(By.xpath("//a[.='KURTIS & DRESSES ']"));
	    action.moveToElement(kurtiNDress).perform();
	    Thread.sleep(3000);
	    List<WebElement> subMenuKurti = driver.findElements(By.xpath("//ul[@class='ds-flex']"));
	    for(WebElement allsub:subMenuKurti){
	    	if(allsub.getText().length()!=0)
	    	System.out.println(allsub.getText().trim());
	    	
	    }
	    //******************************************************************** sub menus of salwar
	    Thread.sleep(500);
	    System.err.println("*********Sub Menues Under SALWAR SUITS   Section***********");
	    WebElement salwar  = driver.findElement(By.xpath("//a[.='SALWAR SUITS ']"));
	    action.moveToElement(salwar).perform();
	    Thread.sleep(3000);
	    List<WebElement> subMenuSalwar = driver.findElements(By.xpath("//ul[@class='ds-flex']"));
	    for(WebElement allsub:subMenuSalwar){
	    	if(allsub.getText().length()!=0)
	    	System.out.println(allsub.getText().trim());
	    	
	    }
		
	    //******************************************************************** sub menu uder JEWELRY
	    Thread.sleep(500);
	    System.err.println("*********Sub Menues Under JEWELRY  Section***********");
	    WebElement jewlery  = driver.findElement(By.xpath("//a[.='JEWELRY ']"));
	    action.moveToElement(jewlery).perform();
	    Thread.sleep(3000);
	    List<WebElement> subMenujewlery= driver.findElements(By.xpath("//ul[@class='ds-flex']"));
	    for(WebElement allsub:subMenujewlery){
	    	if(allsub.getText().length()!=0)
	    	System.out.println(allsub.getText().trim());
	    	
	    }
	    //*************************************************** sub menus under LEHENGAS & GOWNS 
	    Thread.sleep(500);
	    System.err.println("*********Sub Menues Under LEHENGAS & GOWNS Section***********");
	    WebElement gowns  = driver.findElement(By.xpath("//a[.='LEHENGAS & GOWNS ']"));
	    action.moveToElement(gowns).perform();
	    Thread.sleep(3000);
	    List<WebElement> subMenuGowns= driver.findElements(By.xpath("//ul[@class='ds-flex']"));
	    for(WebElement allsub:subMenuGowns){
	    	if(allsub.getText().length()!=0)
	    	System.out.println(allsub.getText().trim());
	    	
	    }
		
	    
	  //********************************************************************MEN'S WEAR
	    Thread.sleep(500);
	    System.err.println("*********Sub Menues Under MEN'S WEAR   Section***********");
	    WebElement menWear  = driver.findElement(By.xpath("//a[contains(text(),'MEN')]"));
	    action.moveToElement(menWear).perform();
	    Thread.sleep(3000);
	    List<WebElement> subMenuMenWear= driver.findElements(By.xpath("//ul[@class='ds-flex']"));
	    for(WebElement allsub:subMenuMenWear){
	    	if(allsub.getText().length()!=0)
	    	System.out.println(allsub.getText().trim());
	    	
	    }
		
		
		
			
	
		
		
		
//		String subMXpath="(//nav[@id='mega-menu']/div/ul/li[2]//div[@class='container-fluid sub-menu-wrapper']/ul/li/ul/li/a)[2]";
//	    System.out.println("------->"+driver.findElement(By.xpath(subMXpath)).getText()+"<-----------");
//		List<WebElement> subM = driver.findElements(By.xpath(subMXpath));
//		
//		for(WebElement sMenu:subM){
//			System.out.println("Sub menu of saree main Menu : "+sMenu.getText());
//			}
		
		driver.quit();
		
		
	}//@Test

}