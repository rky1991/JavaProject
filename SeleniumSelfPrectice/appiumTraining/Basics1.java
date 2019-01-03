package appiumTraining;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics1 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.findElementByXPath(
				"//android.widget.TextView[@text='Preference']").click();
	}
}
