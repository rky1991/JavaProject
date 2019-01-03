package appiumTraining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basics9 {

	public static AndroidDriver<AndroidElement> initialize()
			throws MalformedURLException {
		File file = new File("./APKs/Raaga.apk");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_-Harsha");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
				"com.raaga.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.raaga.android.SplashScreen");
		// dc.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		// dc.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
				new URL("http://127.0.0.1:4723/wd/hub"), dc);
		return driver;

	}

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
	}

}
