package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsageOfMoveToELementByOfSet {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.ajio.com/");
	WebElement menSection = driver.findElement(By.linkText("MEN"));
	Actions actions = new Actions(driver);
	actions.moveToElement(menSection).pause(1000).moveToElement(menSection, 78, 0).pause(1000).moveToElement(menSection, 157, 0).pause(1000).moveToElement(menSection, 226, 0).pause(1000).moveToElement(menSection, 352, 0).pause(1000).build().perform();
}
}
