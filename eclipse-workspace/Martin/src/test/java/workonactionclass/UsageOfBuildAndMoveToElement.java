package workonactionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfBuildAndMoveToElement {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.makemytrip.com/");
	List<WebElement> allFareReductions = driver.findElements(By.xpath("//ul[@class='specialFareNew']//li"));
	Actions actions = new Actions(driver);
	for (WebElement options : allFareReductions) {
		actions.moveToElement(options).pause(2000).build().perform();
	}
	

}
}
