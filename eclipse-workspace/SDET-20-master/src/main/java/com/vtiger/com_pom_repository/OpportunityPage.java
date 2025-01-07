package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage {

	public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
		@FindBy (xpath = "//img[@title='Create Opportunity...']")
		private WebElement createOppImg;

		public WebElement getCreateOppImg() {
			return createOppImg;
		}		
		
}
