package com.trello.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserCreatedBoardsPage {
	WebDriver driver;

	public TrelloUserCreatedBoardsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[aria-label='Show menu']")
	private WebElement showMenuOption;
	
	public WebElement getShowMenuOption() {
		return showMenuOption;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getCloseBoard() {
		return closeBoard;
	}

	public WebElement getCloseBoardButton() {
		return closeBoardButton;
	}

	public WebElement getPermanentltyDeleteBoardOption() {
		return permanentltyDeleteBoardOption;
	}

	public WebElement getBoardDeleteButton() {
		return boardDeleteButton;
	}

	@FindBy(xpath = "//a[contains(.,'More')]")
	private WebElement moreOption;
	
	@FindBy(partialLinkText = "Close board")
	private WebElement closeBoard;
	
	@FindBy(css = "input[value='Close']")
	private WebElement closeBoardButton;
	
	@FindBy(xpath = "//button[text()='Permanently delete board']")
	private WebElement permanentltyDeleteBoardOption;
	
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement boardDeleteButton;
	

}
