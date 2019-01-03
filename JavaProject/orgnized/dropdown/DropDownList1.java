package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String []arg) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rahul/Desktop/htmlcode/Droplist1.html");
		WebElement listbox = driver.findElement(By.id("mtr"));
		Select select =new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		LinkedHashMap<String,Integer>map=new LinkedHashMap<String ,Integer>();
		
		//Q8-print options present in listbox with their occurrence?
		
		for(WebElement option: alloptions){
			String text = option.getText();
			if(map.containsKey(text)) {
				Integer v = map.get(text);
				v++;
				map.put(text, v);
				
			}
			else {
			map.put(text, 1);
			}
		}
		System.out.println(map);
		
	//Q4-check if the given option is present in list box or not?
				String given="Idly";
				if(map.containsKey(given)) {
					System.out.println();
				}
				
				
	//Q5-check the given option is duplicate in list box?
				
				String given1="Poori";
				if(map.get(given1)>1) {
					System.out.println("Yes given option"+given1+"is duplicate");
				}
				else {
					System.out.println("Yes given option"+given1+"is not duplicate");
					
				}
				
  //Q6-print only unique options present in list box?
				Set<String> allkeys = map.keySet();
				for(String key:allkeys) {
					Integer count = map.get(key);
					if(count==1) {
						System.out.println(key);
						
					}
					
				}
//Q7-print only duplicte options present in list box?
				
				for(String key:allkeys) {
					Integer count = map.get(key);
					if(count>1) {
						System.out.println(key);
						
					}
					
					
				}

				
				
				
				
		driver.close();
		
		
		
}
}