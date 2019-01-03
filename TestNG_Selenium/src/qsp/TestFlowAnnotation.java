package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFlowAnnotation {
	@BeforeClass
	public void openApp() {
		Reporter.log("Open App",true);
	}
	@AfterClass
	public void closeApp() {
		Reporter.log("Close App",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login ",true);
		
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("Log Out ",true);
	}
	
	//******************
	
	@Test(priority=-1,invocationCount=2)
	public void createUser() {
		Reporter.log("User Created",true);
	}
	@Test
	public void edituser() {
		Reporter.log("User Edited ",true);
	}
	@Test(priority=1)
	public void deleteUser() {
		Reporter.log("User Deleted",true);
	}
	
	

}
