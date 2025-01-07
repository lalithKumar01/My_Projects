package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntaMenTshirt {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		// men t-shirt
		WebElement menTshirt = driver.findElement
				(By.xpath("//a[text()='Topwear']/../..//a[text()='T-Shirts']"));
		//ElementNotInterableException
		// Selenium - run - unchecked
		menTshirt.click();
	}
}
