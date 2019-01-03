package appiumTraining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basics10_Paytm {
	public static AndroidDriver<AndroidElement> initialize()
			throws MalformedURLException {
		File file = new File("./APKs/Raaga.apk");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_-Harsha");
		/*
		 * dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		 * "com.raaga.android");
		 * dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		 * "com.raaga.android.SplashScreen");
		 */
		dc.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		// dc.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
				new URL("http://127.0.0.1:4723/wd/hub"), dc);
		return driver;

	}

	public static void main(String[] args)
			throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//android.widget.TextView[@text='harsha.kb@gmail.com']"))
				.click();
		Thread.sleep(10000l);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(
		 * By.id("com.raaga.android:id/nav_ham_burger")));
		 */

		driver.findElementByAndroidUIAutomator(
				"resourceId(\"com.raaga.android:id/top_categories_menu\")")
				.click();

		driver.findElement(By.xpath(
				"//android.widget.ImageView[@id='com.raaga.android:id/nav_ham_burger']"))
				.click();

	}
}
