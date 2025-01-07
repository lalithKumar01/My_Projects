package testAuto.io.DemoTest;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver ;
	 public DashboardPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 @FindBy(xpath = "//span[@class='icon fonticon fonticon-plus']")
	 private WebElement addNewTab;
	
	 @FindBy(xpath = "//span[text()='Scoping Cart']")
	 private WebElement scoppingCartTab;
	 
	 public WebElement getAddNewTabButton() {
		return addNewTab;
	}
	public WebElement getscoppingCartTab() {
			return scoppingCartTab;
		}

}
