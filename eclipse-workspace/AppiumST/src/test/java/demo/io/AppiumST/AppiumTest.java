package demo.io.AppiumST;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AppiumTest {
  
  protected AndroidDriver<AndroidElement> driver ;
  DesiredCapabilities dc = new DesiredCapabilities();
  WebDriverWait wait = new WebDriverWait(driver, 10);
  
  @BeforeMethod
  public void setUp() throws MalformedURLException {
	  dc.setCapability(MobileCapabilityType.PLATFORM, "Android");
      dc.setCapability(MobileCapabilityType.UDID, "CIHQFUZ989IFFUPZ");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.applever.smartam");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
      driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
     
  }

  @Test
  public void testUntitled() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]]]/*[@class='android.widget.EditText'])[1]")));

      driver.findElement(By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]]]/*[@class='android.widget.EditText'])[1]"))
            .sendKeys("admin_platform");
      swipe(driver, 292, 815, 292, 594, 750);
      driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./*[@class='android.widget.Button']]"))
            .sendKeys("Passw0rd");
      swipe(driver, 313, 710, 313, 378, 1035);
      driver.findElement(By.xpath("//*[@contentDescription='Login']"))
            .click();
  }

  @AfterMethod
  public void tearDown() {
      driver.quit();
  }

  public void swipe(AndroidDriver<AndroidElement> driver, int startX, int startY, int endX, int endY, int duration) {
      TouchAction<?> touchAction = new TouchAction<>(driver);
      touchAction.press(PointOption.point(startX, startY))
                 .waitAction()
                 .moveTo(PointOption.point(endX, endY))
                 .release()
                 .perform();
      try {
          Thread.sleep(duration);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
}
