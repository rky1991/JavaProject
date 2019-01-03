package sony;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Xl {
	@Test
	public void createUser() {
		Reporter.log("create user",true);
		//Assert.fail();// it fail create user test then delet tc will not execute
	}
	@Test(dependsOnMethods="createUser")
	public void deleteUser() {
		Reporter.log("delete uSer",true);
	}
	
	

}
