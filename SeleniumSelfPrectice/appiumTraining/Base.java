package appiumTraining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> initialize()
			throws MalformedURLException {
		File file = new File("./APKs/ApiDemos-debug.apk");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_-Harsha");
		dc.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
				new URL("http://127.0.0.1:4723/wd/hub"), dc);
		return driver;

	}
}
