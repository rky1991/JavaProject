package jsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*@dataProvider is use to iterates the same task but with different inputs needed to perform the same task: 
 * 
 */
public class DataProviderDemo {
	@DataProvider
	//public String [][] gedData(){
	//String [][] a=new String[2][2]--> if un in string and pas in int it will not work
	public Object[][] getData(){
		Object[][] a =new Object[2][2];
		a[0][0]="User A:";
		a[0][1]= 123; // this is object type data we are passing into object type array
		a[1][0]="User B:";
		a[1][1]=456;
		return a;
		
	}
	@Test(dataProvider="getData")//call the getData Method that return username and password
	public void createUser(String un,int pw) {// convert object type data into string type and int type 
		Reporter.log("Create User :"+un+"pasword :"+pw,true);
		
	}

}
