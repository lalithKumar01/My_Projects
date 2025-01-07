package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToFrameAndBackToDefaultContent  {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 //pass the main URL of the app
	 driver.get("https://jqueryui.com/draggable/");
	 //Switch the driver control inside the frame
	 driver.switchTo().frame(0);
	 //try to interact with ele present In default content
	//switch back to the default content
	 driver.switchTo().defaultContent();
	 driver.findElement(By.linkText("Draggable")).click();
	 driver.quit();
}
}
