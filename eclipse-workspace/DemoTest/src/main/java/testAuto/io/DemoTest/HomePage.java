package testAuto.io.DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver ;
	 public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 @FindBy(xpath = "//div[@class = 'compass-small-over']")
	 private WebElement compass ;
	 
	 @FindBy(xpath = "//div[text()='TA Planning(Web)']")
	 private WebElement planningWidget ;
	 
	 @FindBy(xpath = "(//div[text()='TA System Management'])[1]")
	 private WebElement systemManagementapp ;
	 
	 @FindBy(xpath = "//label[text()='Equipment Master']")
	 private WebElement equipmentMasterApp ;
	 
	 @FindBy(xpath = "//span[text()='System Management']")
	 private WebElement systemManagementTitlie ;
	 
	 @FindBy(xpath = "//*[@id=\"my-apps-ct\"]/div/compass-layout/compass-nav-main/i[2]")
	 private WebElement searchButton ;
	 
	 @FindBy(xpath = "//input[@class='form-control compass-search-text']")
	 private WebElement searchTextFeild ;
	 
	 @FindBy(xpath = "//div[text()='3DDashboard']")
	 private WebElement get3dDashboard ;
	 
	 public WebElement getNavigationButton () {
			return compass;
		}
	 public WebElement getPlanningWidget () {
			return planningWidget;
		}
	 public WebElement getTASystemManagementApp () {
			return systemManagementapp;
		}
	 public WebElement getEquipmentMasterApp () {
			return equipmentMasterApp;
		}
	 public WebElement getsystemManagementTitlie () {
			return systemManagementTitlie;
		}
	 public WebElement getSearchButton () {
			return searchButton;
		}
	 public WebElement getSearchTextFeild () {
			return searchTextFeild;
		}
	 public WebElement get3DDashboardApp () {
			return get3dDashboard;
		}
}
