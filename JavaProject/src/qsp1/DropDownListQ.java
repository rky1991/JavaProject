package qsp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListQ {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/DropdownList.html");
		WebElement listbox = driver.findElement(By.id("mtr"));
		Select select=new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
	//Q11-count the number of options present in list box?
		int count = alloptions.size();
		System.out.println("count of listbox is :"+count);
		
//Q1-print content of list?
		for(WebElement lc:alloptions) {
			System.out.println(lc.getText());
			
		}
//Q2-select and deselect all the options in reverse order?
	  //select:-
		for(int i=count-1;i>=0;i--) {
			select.selectByIndex(i);
			
		}
	  //deselect
		for(int i=0;i<=count-1;i++) {
			select.deselectByIndex(i);
			
		}
//Q3-print the content of listbox in "sorted" order?
		ArrayList<String> alltext=new ArrayList<>();
		for(WebElement option:alloptions) {
			alltext.add(option.getText());
		}
		Collections.sort(alltext);
		Thread.sleep(1000);
		for(String text:alltext) {
			System.out.println(text);
			
		}

		

	}

}
