package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 //************************
	
	WebDriver driver;
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement psTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
 //********************************************	
	// constructor :
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
	// user name :
	   public void setUserName(String un) {
		   unTB.sendKeys(un);
		   
	   }
	// password:-
	   public void setPassword(String ps) {
		   psTB.sendKeys(ps);
		   
	   }
	// login button
	   public void loginClick() {
		   loginBTN.click();
		   
		   
	   }
		
	}


////// previous program code: COMPARE with a pom class:  --
/*
 * package fbLoginFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver) {
		unTB=driver.findElement(By.id("email"));
		pwTB=driver.findElement(By.id("pass"));
		loginBTN=driver.findElement(By.id("u_0_2"));
		
	}
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void loginClick() {
		loginBTN.click();;
	}

}

 * */

