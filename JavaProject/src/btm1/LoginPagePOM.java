package btm1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
// this is pom class
	//Decleration
	
	//POM class here we are doing only declaration , utilization and initilization
	final String s="username";
	@FindBy(id=s)
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	//initilization
    
	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//utilization----
	
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	public void setPasword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clikLogin() {
		loginBTN.click();
	}
	

}

