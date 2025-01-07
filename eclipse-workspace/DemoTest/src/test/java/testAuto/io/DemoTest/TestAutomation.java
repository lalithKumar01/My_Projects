package testAuto.io.DemoTest;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import driver.WebDrivers;


public class TestAutomation extends WebDrivers {
	
  @Test(priority = 1)
  public void loginInto3DXplatform() throws Exception {
	  LoginPage loginpage = new LoginPage(driver);
	  //HomePage homepage = new HomePage(driver);
	   //waits.until(ExpectedConditions.elementToBeClickable(loginpage.getUsernameFeild()));
	   loginpage.getUsernameFeild().sendKeys(fileutil.getCredentialsFromPropertyFile("UserName"));
	   loginpage.getPasswordFeild().sendKeys(fileutil.getCredentialsFromPropertyFile("Password"));
	   loginpage.getlogincard().click();
	   Thread.sleep(5000);
	   String expectedTitle ="3DEXPERIENCE Platform" ;
	   String actualTitle = driver.getTitle();
	   System.out.println(actualTitle);
	   //webdriverUtils.verifyCompleteTitle(driver, expectedTitle);
	   if (webdriverUtils.verifyCompleteTitle(driver, expectedTitle)) {
		   System.out.println("Successfully logedin");
	}
	   else {
		   System.out.println("Failed");
	}  
  }
//upon successful login 
  @Test(priority = 2)
  public void homePageNavigation() throws InterruptedException {
	 HomePage homepage = new HomePage(driver);
	//Thread.sleep(5000);
	 //webdriverUtils.elementClickableState(driver,  homepage.getNavigationButton()).click();
	WebElement nav = homepage.getNavigationButton();
	nav.click();
	Thread.sleep(5000);
	nav.click();
	 /* homepage.getPlanningWidget().click();
	  homepage.getTASystemManagementApp().click();
	  Set<String> handles = (Set<String>) driver.getWindowHandles();
	  int index=0;
	  for (String handle : handles) {
          if (index==1) {
              driver.switchTo().window(handle);
              break;
          }
          index++;
      }
	  if(ExpectedConditions.visibilityOf(homepage.getsystemManagementTitlie()) != null) {
		  System.out.println("Successfully Handle The Window");
	  }
	  else {
		   System.out.println("Failed to handle");
	}  
	  homepage.getEquipmentMasterApp().click();
	  Thread.sleep(5000);*/
	 homepage.getSearchButton().click();
	 homepage.getSearchTextFeild().sendKeys("3DDashboard");
	 homepage.get3DDashboardApp().click();
	 Set<String> handles = (Set<String>) driver.getWindowHandles();
	  int index=0;
	  for (String handle : handles) {
         if (index==1) {
             driver.switchTo().window(handle);
             break;
         }
         index++;
     }
	 
	 }
  @Test(priority = 3)
  public void workon3dDashboard() throws Exception {
	DashboardPage dashboard = new DashboardPage(driver);
	//dashboard.getAddNewTabButton().click();
	//Thread.sleep(5000);
}
  
  
  
}
