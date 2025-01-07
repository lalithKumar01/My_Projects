package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfContectClick {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	Actions actions = new Actions(driver);
	// with out argument if we call the contextClick() it will do 
	// the right click on (0,0) location Of the web content.
	//actions.contextClick().perform();
	WebElement luckyButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value=\"I'm Feeling Lucky\"]"));
	actions.contextClick(luckyButton).perform();
}
}
