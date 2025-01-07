package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkOnDoubleClick {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/HP/Desktop/check.html");
	WebElement button = driver.findElement(By.id("doubleclick"));
	Actions actions = new Actions(driver);
	actions.doubleClick(button).perform();
}
}
