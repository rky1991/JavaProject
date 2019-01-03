package pom;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAllPage {
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	public FindAllPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
		public int getLinkCount() {
			int count =allLinks.size();
			return count;
			
		}
		
	}


