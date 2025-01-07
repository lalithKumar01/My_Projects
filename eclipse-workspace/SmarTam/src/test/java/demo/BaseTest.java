package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService services;
	//public Gestures longpress = new Gestures();

	@BeforeClass
	public void configureAppium() throws MalformedURLException, Exception {
		services = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"C://Users//www.abcom.in//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		services.start();
		// Thread.sleep(5000);
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 8 API 31");
		options.setApp(
				"C://Users//www.abcom.in//eclipse-workspace//SmarTam//src//test//java//resource//ApiDemos-debug.apk");
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		services.stop();
	}
}
