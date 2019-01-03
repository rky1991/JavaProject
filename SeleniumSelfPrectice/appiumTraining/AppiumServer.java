package appiumTraining;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	private DesiredCapabilities cap;

	private int port = 4723;

	public void startServer() {
		// Set Capabilities
		cap = new DesiredCapabilities();
		cap.setCapability("noReset", "false");
		File file = new File("./APKs/ApiDemos-debug.apk");

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_-Harsha");
		cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		// Build the Appium service
		builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(port);
		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");

		// Start the server with the builder
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
	}

	public DesiredCapabilities getCapabilities() {
		return cap;
	}
	public void stopServer() {
		service.stop();
	}

	public boolean serverIsRunnning() {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			// If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

}
