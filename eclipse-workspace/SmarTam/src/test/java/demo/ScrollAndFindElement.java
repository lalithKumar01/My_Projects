package demo;

import java.time.Duration;

import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollAndFindElement extends BaseTest {
	FluentWait<AndroidDriver> wait;
	@Test
   public void scrollToView() {
	   wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Gestures scrollPage = new Gestures(driver);
		scrollPage.scrollbyandroidUIAutomator("WebView");
   }
}
