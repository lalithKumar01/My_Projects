package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfClickAndHold {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/resizable/");
	driver.switchTo().frame(0);
	Actions actions = new Actions(driver);
	WebElement resizableEle = driver.findElement(By.id("resizable"));
	WebElement resizableDia = driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
	actions.moveToElement(resizableDia).clickAndHold(resizableDia).moveByOffset(30, 40).release().build().perform();
	
}
}
