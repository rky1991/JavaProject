package fbLoginFrame;

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
