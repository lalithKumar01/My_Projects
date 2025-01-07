package com.trello.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardsPage {
WebDriver driver;
	public TrelloBoardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='board-tile mod-add' and contains(.,'Create new board')]")
	private WebElement createNewBoardOption;
	
	public WebElement getCreateNewBoardOption() {
		return createNewBoardOption;
	}

	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}

	public WebElement getCreateBoardButton() {
		return createBoardButton;
	}

	public WebElement getProfileIconMenu() {
		return profileIconMenu;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	@FindBy(css = "input[data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createBoardButton;
	
	@FindBy(css = "button[aria-label='Open member menu']")
	private WebElement profileIconMenu;
	
	@FindBy(xpath = "//button[.='Log out']")
	private WebElement logoutButton;
	
	
	
	
	
	
}
