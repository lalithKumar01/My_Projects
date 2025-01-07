package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragElement {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://jqueryui.com/draggable/");
	 //switch the driver control to frame
	 driver.switchTo().frame(0);
	 WebElement draggable = driver.findElement(By.id("draggable"));
	 //drag the ele
	 Actions actions = new Actions(driver);
	//MoveTargetOutOfBoundsException
	// actions.dragAndDropBy(draggable, 0, 170).perform();
	// actions.dragAndDropBy(draggable, 0, 70).perform();
	 actions.dragAndDropBy(draggable, 200, 70).perform();
}
}
