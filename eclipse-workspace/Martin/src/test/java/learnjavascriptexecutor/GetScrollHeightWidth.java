package learnjavascriptexecutor;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GetScrollHeightWidth {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	 long scrollHeight = (long)jse.executeScript("return document.body.scrollHeight");
	 System.out.println("scrollHeight = " + scrollHeight);
	 long scrollWidth = (long)jse.executeScript("return document.body.scrollWidth");
	 System.out.println("scrollWidth = " + scrollWidth);
	 driver.quit();
}
}
