package readExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActitimeDataRead {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String []arg) throws Exception {
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook w = WorkbookFactory.create(fis);//create space in RAM for file  
		//go to sheet1--> 1st row,1st column
		Cell c = w.getSheet("sheet1").getRow(1).getCell(0);
		Cell c2 = w.getSheet("sheet1").getRow(1).getCell(1);
		
		//get value present in cell and print it
		String v = c.getStringCellValue();
		String v2 = c2.getStringCellValue();
		
		System.out.println(v);
		System.out.println(v2);
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.actitime.com");
		
		System.out.println(driver.getTitle());
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys(v);
		WebElement pw = driver.findElement(By.name("pwd"));
		pw.sendKeys(v2);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		
		
	}
	

}
