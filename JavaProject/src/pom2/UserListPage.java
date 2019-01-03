package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage
{
	private WebDriver driver;
	
	@FindBy(xpath="//div[.='Add User']")
	private WebElement addUserBTN;
	
	@FindBy(name="firstName")
	private WebElement fnTB;
	
	@FindBy(id="closeUserDataLightBoxBtn")
	private WebElement closeBTN;
	
	
	
	// constructor
	public UserListPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// click on add user button:
	public void clickAddUser() {
		
		addUserBTN.click();
		
	}
    
	//click on close button 
	
	public void clickClose() {
		
		closeBTN.click();
		
	     }
	
	// enter first name:
	
	public void setFirstName(String fn) {
		fnTB.sendKeys(fn);
		
	}
	
	// javascript method to handle the pop up ....
	//@findBy  will not work in case of javascript poup
	
	public void clickOnAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}




		
		

	

}
