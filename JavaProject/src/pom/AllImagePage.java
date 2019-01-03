package pom;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// find all image on flipkart 
public class AllImagePage {
	@FindBy(xpath="//img")
	private List<WebElement> all_Img;
	//driver.findElement(By.xpath("(//button)[2]")).click();
	//@FindBy(xpath="(//button)[2]")
	@FindBy(className ="_2AkmmA _29YdH8")
    private WebElement popUp;
	
	
	//constructor 
	public AllImagePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
	
	   public void getPopUP() {
		   popUp.click();
		   
	   }
	
	
		public int getImgCount() {
			int count =all_Img.size();
			return count;
			
		}
		
	}


