package listenerTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Result.class)
public class DemoA {
	@Test
	public void testA() {
		Reporter.log("TestA :",true);
	}
	@Test
	public void test2() {
		Reporter.log("Test2 :",true);
		Assert.fail();
	}
	@Test
	public void test3() {
		System.out.println("test 3");
		
	}
	
	
	

}
