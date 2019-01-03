package appiumTraining;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		List<AndroidElement> lst = driver.findElementsByAndroidUIAutomator(
				"new UiSelector().clickable(true)");
		System.out.println(lst.size());

		System.out.println(
				driver.findElement(By.xpath("//android.widget.ListView"))
						.findElementsByAndroidUIAutomator(
								"new UiSelector().enabled(true)")
						.size());

		List<MobileElement> lst1 = driver
				.findElement(By.xpath("//android.widget.ListView"))
				.findElementsByAndroidUIAutomator(
						"new UiSelector().enabled(true)");

		for (MobileElement me : lst1)
			System.out.println(me.getAttribute("text"));
	}
}
