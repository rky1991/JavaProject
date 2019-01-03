package jsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsRegression {
	
	@BeforeMethod(alwaysRun=true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logOut() {
		Reporter.log("Log Out :",true);
	}
	
	//**************Test Methods ***************
	
	@Test(priority=1,groups= {"user","smoke"})
	public void createUser() {
		Reporter.log("Create User: ",true);
	}
	
	@Test(priority=2,groups= {"user"},enabled=false)
	public void editUser() {
		Reporter.log("EditUser",true);
	}
	
	@Test(priority=3,groups= {"user"})
	public void deleteUser() {
		Reporter.log("Delete User:",true);
	}
	
	@Test(priority=4,groups= {"product","smoke"})
	public void creteProduct() {
		Reporter.log("Create product:",true);	
		
	}
	
	@Test(priority=5,groups= {"product"})
	public void deleteProduct() {
	Reporter.log("Delete product:",true);	
	
}

	
	
	

}
