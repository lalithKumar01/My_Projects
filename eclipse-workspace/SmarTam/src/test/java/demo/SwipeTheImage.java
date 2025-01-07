package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwipeTheImage extends BaseTest {
	FluentWait<AndroidDriver> wait;
	@Test
   public void swipeintofocus() throws Exception {
	   wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement fristImage=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		Assert.assertEquals(fristImage.getAttribute("focusable"), "true");
		Gestures swipe = new Gestures(driver);
		swipe.swipeGesture(fristImage, "left");
		Thread.sleep(2000);
		//Assert.assertEquals(fristImage.getAttribute("focusable"), "false");
	}
}
