package appiumTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Basics7_Miscelleneous extends Base {

	public static void main(String[] args)
			throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getCurrentPackage());
		// System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getAutomationName());
		System.out.println(driver.getDeviceTime());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.getOrientation());
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))
				.click();
		Thread.sleep(2000l);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
