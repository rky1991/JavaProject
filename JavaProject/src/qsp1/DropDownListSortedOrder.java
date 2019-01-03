package qsp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListSortedOrder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
//Q9-check if content of list box is in sorted order or not?	
	public static void main(String []arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/Droplist1.html");
		WebElement listbox = driver.findElement(By.id("mtr"));
		Select select =new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		ArrayList<String>alltext1=new ArrayList<>(); 
		ArrayList<String>alltext2=new ArrayList<>();
		for(WebElement option:alloptions) {
			String text = option.getText();
			alltext1.add(text);
			alltext1.add(text);
			
		}
		Collections.sort(alltext1);
		if(alltext1.equals(alltext2))
		{
			System.out.println("Listbox is Sorted oredr");
			
			
		}
		else
		{
			System.out.println("Listbox is not Sorted oredr");
		}
		
	driver.close();
	}

}
