package demo;

import java.time.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AppiumBasic extends BaseTest {
	FluentWait<AndroidDriver> wait;

	@Test
	public void AppiumTest() throws Exception {
		wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Suceess");
		driver.findElement(AppiumBy.xpath("//android.wi  dget.TextView[@content-desc=\"Preference\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"))
				.click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout) [2]")).click();
		String Popup = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		System.out.println(Popup);
		Assert.assertEquals(Popup, "WiFi settings");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("91Springboard");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
	}
}
