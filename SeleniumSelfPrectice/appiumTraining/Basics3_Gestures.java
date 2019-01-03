package appiumTraining;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Basics3_Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))
				.click();

		TouchAction ta = new TouchAction(driver);
		TapOptions to = new TapOptions();
		to = to.withElement(ElementOption.element(driver.findElement(By.xpath(
				"//android.widget.TextView[@text='Expandable Lists']"))));
		ta.tap(to).perform();

		to = to.withElement(ElementOption.element(driver.findElement(By.xpath(
				"//android.widget.TextView[@text='1. Custom Adapter']"))));
		ta.tap(to).perform();

		ta.longPress(new LongPressOptions()
				.withElement(ElementOption.element(driver.findElement(By.xpath(
						"//android.widget.TextView[@text='People Names']"))))
				.withDuration(Duration.ofSeconds(3l))).release().perform();

		System.out.println(
				driver.findElement(By.id("android:id/title")).getText());
		to = to.withElement(ElementOption.element(driver.findElement(
				By.xpath("//android.widget.TextView[@text='Sample action']"))));
		ta.tap(to).perform();

	}
}
