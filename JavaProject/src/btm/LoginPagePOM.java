package btm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePOM {

	//Decleration
	
	//POM class here we are doing only declaration ,and utilization not initilization
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	
    
	//utilization----
	public void clikLogin() {
		loginBTN.click();
	}
	

}

