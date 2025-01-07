package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicOperations {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	Actions actions = new Actions(driver);
	//actions.sendKeys(driver.switchTo().activeElement(), "admin").perform();
	actions.sendKeys(driver.switchTo().activeElement(), "admin").sendKeys(Keys.TAB).sendKeys("manager").build().perform();
	
}
}
