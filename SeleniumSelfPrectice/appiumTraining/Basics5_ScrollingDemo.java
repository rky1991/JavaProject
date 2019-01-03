package appiumTraining;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics5_ScrollingDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))
				.click();

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Animation\"))");

		List<MobileElement> lst1 = driver
				.findElement(By.xpath("//android.widget.ListView"))
				.findElementsByAndroidUIAutomator(
						"new UiSelector().enabled(true)");

		for (MobileElement me : lst1)
			System.out.println(me.getAttribute("text"));
	}
}
