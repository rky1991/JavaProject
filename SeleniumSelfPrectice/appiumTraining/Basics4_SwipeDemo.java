package appiumTraining;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Basics4_SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))
				.click();

		TouchAction ta = new TouchAction(driver);
		TapOptions to = new TapOptions();
		to = to.withElement(ElementOption.element(driver.findElement(
				By.xpath("//android.widget.TextView[@text='Date Widgets']"))));
		ta.tap(to).perform();

		/*
		 * to = to.withElement(ElementOption.element(driver.findElement(
		 * By.xpath("//android.widget.TextView[@text='2. Inline']"))));
		 * ta.tap(to).perform();
		 */
		// driver.findElementByAndroidUIAutomator("text(\"2.
		// Inline\")").click();
		driver.findElementsByAndroidUIAutomator(
				"resourceId(\"android:id/text1\")").get(1).click();

		// driver.findElementByAndroidUIAutomator("description(\"9\")").click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		ta.press(ElementOption.element(
				driver.findElement(By.xpath("//*[@content-desc='15']"))))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2l)))
				.moveTo(ElementOption.element(driver
						.findElement(By.xpath("//*[@content-desc='45']"))))
				.release().perform();
	}
}
