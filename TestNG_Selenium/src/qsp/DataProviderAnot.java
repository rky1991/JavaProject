package qsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnot {
	@DataProvider
	public String[][] data() {
		String [][]a=new String[3][2];
		a[0][0]="User A";
		a[0][1]="123";
		a[1][0]="UserB";
		a[1][1]="bcd";
		a[2][0]="UserC";
		a[2][1]="efg";
		return a;
		// this method return string type user and string type password 
		
	}
	
	@Test(dataProvider="data")// call the data Method that return username and password
	public void userLogin(String un,String pw) {// catch user name and password in string type variables
		Reporter.log("UserName :"+un+ ","+"Password :"+pw,true);
		
		
	}
	

}
