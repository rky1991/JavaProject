package appiumTraining;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics2 {

	public static void main(String[] args)
			throws MalformedURLException, InterruptedException {
		AppiumServer as = new AppiumServer();
		if (!as.serverIsRunnning())
			as.startServer();
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
				new URL("http://127.0.0.1:4723/wd/hub"), as.getCapabilities());
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"//android.widget.TextView[@text='Preference']").click();

		driver.findElementByXPath(
				"//android.widget.TextView[@text='3. Preference dependencies']")
				.click();
		driver.findElementById("checkbox").click();

		/*
		 * driver.findElementByXPath(
		 * "//android.widget.TextView[@text='WiFi settings']").click();
		 */

		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]"))
				.click();

		driver.findElementByXPath("//android.widget.EditText")
				.sendKeys("AMULTACT");
		driver.findElement(By.id("button1")).click();

		Thread.sleep(3000l);
		driver.closeApp();
		as.stopServer();
	}
}
