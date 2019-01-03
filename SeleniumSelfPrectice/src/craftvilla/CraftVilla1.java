package craftvilla;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.Test;

public class CraftVilla1{
	
	ArrayList ar= new ArrayList();
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static String path="Efile.xlsx";
	public static String sheetname="CraftsvillaH";


	//private static XSSFCell Cell;


//	@Test
//	public static void setXL()  {
//
//			try {
//				FileInputStream ExcelFile = new FileInputStream(path);
//				Workbook book = WorkbookFactory.create(ExcelFile);
//				String data = book.getSheet(sheetname).getRow(1).getCell(0).toString();
//
//				
//				System.out.println(data);
//				
//				FileOutputStream fos= new FileOutputStream("‪Efile.xlsx");
//				Workbook bookk = WorkbookFactory.create(ExcelFile);
//				bookk.createSheet(sheetname).createRow(1).createCell(1).setCellValue("SARRES");
////				for(int i=0;i<2;++i) {
////					for(int j=0;j<2;++j) {
////				Cell cell = book.getSheet(sheetname).getRow(i).getCell(j);
////				cell.setCellValue("");
////				bookk.write(fos);
////			} 
////			}
//			}
//			catch (Exception e){
//
//				e.printStackTrace();
//				}
//			
//			
//			}
//
//	
	

		 
	
	@Test
	public void testA() throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		
		driver.findElement(By.xpath("//a[text()='SAREES']"));
		List<WebElement> alllink = driver.findElements(By.xpath("//span[@class='first_arrow icon']/.."));// 6 main menus
		
		// (//ul[@class='ds-flex']//li/a)--> will give 117 element but print only mouse hovered menu
		List<WebElement> sub = driver.findElements(By.xpath("//ul[@class='ds-flex']//li/a"));
		
		Actions a = new Actions(driver);
		for(WebElement mMenu:alllink) {
			ar.add(mMenu.getText());
		String menuText = mMenu.getText();
		System.out.println(menuText);
		Thread.sleep(1000);
		
		a.moveToElement(mMenu).build().perform();
		
		Thread.sleep(4000);
		
		int totalCount;
		
		for(WebElement submenu:sub) {
			String s = submenu.getText();
			
			
			if(s.length()!=0) {
				System.out.println(s);
				ar.add(s);
				totalCount=s.length();
			}
			
			}
			}
		System.out.println(ar);
	//	setXL();
		
	}

	
}
