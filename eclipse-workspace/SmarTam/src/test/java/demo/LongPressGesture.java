package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LongPressGesture extends BaseTest {
	FluentWait<AndroidDriver> wait;
	@Test
	public void longPressTest() {
		wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement longPressPeopleName =driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		Gestures longpress = new Gestures(driver);
		longpress.longPress(longPressPeopleName);
		WebElement sampleMenu = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']"));
		Assert.assertTrue(sampleMenu.isDisplayed());
		String menuTest=sampleMenu.getText();
		Assert.assertEquals(menuTest,"Sample menu" );
		
	} 
}
