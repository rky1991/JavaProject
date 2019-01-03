package jsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoBB extends BaseTest {
	@Test
	public void testB1() {
		Reporter.log("Test B1  ",true);
	}
	@Test
	public void testB2() {
		Reporter.log("TestB2 :",true);
		
	}

}
