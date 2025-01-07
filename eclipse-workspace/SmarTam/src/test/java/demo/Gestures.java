package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Gestures {
	WebDriver driver;
	  public Gestures(WebDriver driver) {
	        this.driver = driver;
	    }
public void longPress(WebElement ele) {
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
					"duration",2000));
}
public void scrollbyandroidUIAutomator(String text) {
	driver.findElement(AppiumBy.
			androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+text+"\"));"));
}
public void swipeGesture(WebElement ele , String direction) {
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
					"direction",direction,
					"precent",0.75));
}
}
