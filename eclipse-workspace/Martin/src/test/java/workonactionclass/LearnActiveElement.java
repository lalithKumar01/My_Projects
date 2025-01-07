package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnActiveElement {
	//based on the state of the element we are identifying It.
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	//username text field is active
	driver.switchTo().activeElement().sendKeys("admin");
	driver.get("https://www.facebook.com/");
	//email text field
	driver.switchTo().activeElement().sendKeys("admin@gmail.com");
	driver.get("https://www.google.com/");
	//search text field
	driver.switchTo().activeElement().sendKeys("admin");
}
}
