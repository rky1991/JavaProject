package jsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DpdDemo1 {
	
	@DataProvider
	public Object[][] getData(){
		Object [][]a=new Object[2][3];
	// contain 2 rows and three column
		a[0][0]=1;
		a[0][1]="Akbar";
		a[0][2]=true;
		a[1][0]=2;
		a[1][1]="Birbal";
		a[1][2]=false;
		return a;
	}

	@Test(dataProvider="getData")
	public void createUser(int id,String un,boolean b) {
		Reporter.log("id:"+id+"User Name:"+un+"King :"+b,true);
	
		
	}
	
}
