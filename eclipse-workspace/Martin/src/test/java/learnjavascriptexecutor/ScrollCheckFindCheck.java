package learnjavascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollCheckFindCheck {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (;;) {
			try {
				WebElement israelDoodle = driver.findElement(By.xpath("//a[text()='Israel Independence Day 2022']"));
				israelDoodle.click();
				break;
			} catch (NoSuchElementException e) {
				jse.executeScript("window.scrollBy(0,500)");
			}
		
		}
	}
}
