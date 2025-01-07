package workonactionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//moveToElement()
//build()
//perform()
//pause()
public class DesignCompositeAction {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
		WebElement navMenuUponMen = driver.findElement(By.xpath("//a[text()='Men']/ancestor::nav[@class='desktop-navbar']"));
		List<WebElement> allOptions = navMenuUponMen.findElements(By.xpath("//a[text()='Topwear']/parent::li/following-sibling::li"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menSection).pause(2000).perform();
		for (WebElement options : allOptions) {
			actions.moveToElement(options).pause(1000).build().perform();
		}
	}
}
