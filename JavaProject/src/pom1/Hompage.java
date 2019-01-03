package pom1;

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
	
	
  //
	public UserListPage clickUser() {
		user.click();
	
		//return new UserListPage(driver);
		
		UserListPage up=new UserListPage(driver);
		return up;
	}
		
	}
