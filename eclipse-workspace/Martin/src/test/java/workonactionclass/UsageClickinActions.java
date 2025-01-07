package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageClickinActions {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement menSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	WebElement menTShirts = driver.findElement(By.xpath("//a[text()='Casual Shirts']/../..//a[text()='T-Shirts']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(menSection).pause(2000).click(menTShirts).build().perform();
	WebElement roadsterTshirt = driver.findElement(By.xpath("//img[@title='Roadster Men Black Cotton Pure Cotton T-shirt']"));
	WebElement wishlistHeart = driver.findElement(By.xpath("//img[@title='Roadster Men Black Cotton Pure Cotton T-shirt']/ancestor::a/following-sibling::div//span[text()='wishlist']/span"));
	actions.moveToElement(roadsterTshirt).pause(Duration.ofSeconds(2)).click(wishlistHeart).build().perform();
}
}
