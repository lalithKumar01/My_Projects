package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickIsraelIndependenceDoodle {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		Actions actions = new Actions(driver);
		for (;;) {
			try {
				WebElement israelDoodle = driver.findElement(By.linkText("Israel Independence Day 2022"));
				israelDoodle.click();
				break;
			} catch (NoSuchElementException e) {
				actions.scrollByAmount(0, 200).perform();
			}
		}
	}
}
