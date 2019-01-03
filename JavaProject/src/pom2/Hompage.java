package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hompage {
	WebDriver driver;
	@FindBy(xpath="//div[.='USERS']")
	private WebElement user;
	
// constructor of homepage class	
	public Hompage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
  // click on users tab:
	public void clickUser() {
		user.click();
	}
		
	}
