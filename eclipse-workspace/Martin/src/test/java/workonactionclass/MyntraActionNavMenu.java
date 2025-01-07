package workonactionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraActionNavMenu {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	Actions actions = new Actions(driver);
	WebElement parentEle = driver.findElement
			(By.xpath("//div[@class='desktop-navLinks']"));
	List<WebElement> allMenuOptions = parentEle.
			findElements(By.xpath("//div[@class='desktop-navLink']/a"));
	System.out.println(allMenuOptions.size());
	for (WebElement option : allMenuOptions) {
		actions.moveToElement(option).pause(2000).perform();
	}
	driver.quit();
	}
}