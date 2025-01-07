package com.trello.qspiders.trelloendtoend;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.trello.qspiders.genericutility.BaseClass;
import com.trello.qspiders.pomrepository.TrelloBoardsPage;
import com.trello.qspiders.pomrepository.TrelloHomePage;
import com.trello.qspiders.pomrepository.TrelloLoginPage;
import com.trello.qspiders.pomrepository.TrelloLoginToContinue;
import com.trello.qspiders.pomrepository.TrelloLogoutPage;
import com.trello.qspiders.pomrepository.TrelloUserCreatedBoardsPage;

public class TrelloTrail extends BaseClass {
	@Test
	public void createAndDeleteBoard() throws Throwable {
		webdriverUtils.implicitWait(driver);
		TrelloHomePage homePage = new TrelloHomePage(driver);
		homePage.getLoginOption().click();
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
		loginPage.getEmailTextField().sendKeys(fileUtils.readDataFromPropertyFile("username"));
		loginPage.getLoginButton().submit();
		TrelloLoginToContinue loginContinue = new TrelloLoginToContinue(driver);
		webdriverUtils.elementClickableState(driver, loginContinue.getPasswordTextField()).sendKeys(fileUtils.readDataFromPropertyFile("password"));
		loginContinue.getLoginButton().submit();
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(driver);
		boardsPage.getCreateNewBoardOption().click();
		Actions actions = new Actions(driver);
		actions.moveToElement(boardsPage.getBoardTitleTextField()).sendKeys(boardsPage.getBoardTitleTextField(), fileUtils.readDataFromPropertyFile("boardtitle")).pause(1000).scrollToElement(boardsPage.getCreateBoardButton()).moveToElement(boardsPage.getCreateBoardButton()).click().build().perform();
		TrelloUserCreatedBoardsPage createdBoard = new TrelloUserCreatedBoardsPage(driver);
		webdriverUtils.verifyPartialTitle(driver, fileUtils.readDataFromPropertyFile("boardtitle"));
		createdBoard.getShowMenuOption().click();
		createdBoard.getMoreOption().click();
		createdBoard.getCloseBoard().click();
		createdBoard.getCloseBoardButton().click();
		createdBoard.getPermanentltyDeleteBoardOption().click();
		createdBoard.getBoardDeleteButton().click();
		boardsPage.getProfileIconMenu().click();
		boardsPage.getLogoutButton().click();
		TrelloLogoutPage logoutPage = new TrelloLogoutPage(driver);
		logoutPage.getLogoutButton().submit();
	}
}
