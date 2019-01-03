package appiumTraining;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Basics6_DragAndDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = initialize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))
				.click();
		driver.findElement(
				By.xpath("//android.widget.TextView[@text='Drag and Drop']"))
				.click();

		TouchAction ta = new TouchAction(driver);
		ta.longPress(new LongPressOptions()
				.withElement(ElementOption.element(driver.findElement(
						By.id("io.appium.android.apis:id/drag_dot_1"))))
				.withDuration(Duration.ofSeconds(3l)))
				.moveTo(ElementOption.element(driver.findElement(
						By.id("io.appium.android.apis:id/drag_dot_3"))))
				.release().perform();

	}
}
