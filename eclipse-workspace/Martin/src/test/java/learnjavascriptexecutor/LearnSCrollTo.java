package learnjavascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnSCrollTo {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles");
	Thread.sleep(4000);
	//explicit type casting
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//JavaScriptException
	jse.executeScript("window.scrollTo(0,200)");
	Thread.sleep(4000);
	jse.executeScript("window.scrollTo(0,100)");
}
}
