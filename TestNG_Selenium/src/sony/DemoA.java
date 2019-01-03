package sony;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA {
	@Parameters({"city","Area"})
	@Test
	public void testA(@Optional("BNG")String s,@Optional("Magistic")String a) {
		Reporter.log(s+a,true);
		
	}

}
