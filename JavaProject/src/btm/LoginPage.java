package btm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	//Decleration
	
	private WebElement loginBTN;
    //initilization--
	
	public LoginPage(WebDriver driver) {
	
		loginBTN=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	//utilization----
	public void clikLogin() {
		loginBTN.click();
	}
	

}

