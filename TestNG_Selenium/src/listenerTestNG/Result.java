package listenerTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Result implements ITestListener {
	
	static int passCount=0,failCount=0;
	//this method execute before start tc execution
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	// this method execute for pass tc
	@Override
	public void onTestSuccess(ITestResult result) {
		passCount++;
		
	}
	

	//this method execute for fail tc
	@Override
	public void onTestFailure(ITestResult result) {
		failCount++;
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		TestCaseCount.writeResultToXl("./data/Book1.xlsx", passCount, failCount);
		
	}

}
