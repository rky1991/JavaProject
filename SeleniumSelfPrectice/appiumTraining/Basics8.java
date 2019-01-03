package appiumTraining;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Basics8 {

	@Test
	public void test() throws MalformedURLException {
		// File appDir = new File("src");

		// File app = new File(appDir, "bookMyShow-ucb.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		// cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		/*
		 * cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		 * "net.one97.paytm");
		 * cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		 * "net.one97.paytm.AJRMainActivity");
		 */

		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
				"com.facebook.katana");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.facebook.katana.activity.FbMainTabActivity");
		AndroidDriver driver = new AndroidDriver(
				new URL("http://127.0.0.1:4723/wd/hub"), cap);
		// driver.findElementById("com.bt.bms:id/btnLogin").click();
		/*
		 * driver.findElementById("com.bt.bms:id/btnSignUp").click(); int s =
		 * driver.findElements(By.className("android.widget.EditText")) .size();
		 * System.out.println(s); List<WebElement> a = driver
		 * .findElements(By.className("android.widget.EditText"));
		 * a.get(0).sendKeys("Appium"); a.get(1).sendKeys("Mobile");
		 * a.get(2).sendKeys("appium@training"); a.get(3).sendKeys("password");
		 * driver.findElementById("com.bt.bms:id/action_icon").click();
		 */

	}
}
