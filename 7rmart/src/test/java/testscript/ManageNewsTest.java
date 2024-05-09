package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {
  @Test (priority=1)
  public void verifyWhetherTheUserIsAbleToAddNews() 
  {
	  String username="admin";
	  String password="admin";
	  String news="Test News Rod";
	  String editnews="Editing the news";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	 
	 ManageNewsPage managenewspage=new ManageNewsPage(driver);
	 managenewspage.verifyTheUserIsAbleToClickOnManageNews();
	 managenewspage.verifyTheUserIsAbleToClickOnNewIcon();
	 managenewspage.verifyTheUserIsAbleToEnterNewsOnNewsField(news);
	 managenewspage.verifytheUserIsbleToSaveTheDatas();
	 boolean isAlertDisplay=managenewspage.isAlertDisplayed();
	 Assert.assertTrue(isAlertDisplay,"Alert not displayed");
	 
	// ManageNewsPage managenewspage=new ManageNewsPage(driver);
	 managenewspage.verifyTheUserIsAbleToClickOnManageNews();
	 managenewspage.verifyTheUserIsAbleToClickTheEditIcon();
	 managenewspage.verifyTheUserIsAbleToUpdateTheNews(editnews);
	 managenewspage.verifyTheUserIsAbleToClickOnUpdate();
	 boolean isAlertThere=managenewspage.isAlertDisplayed();
	 Assert.assertTrue(isAlertThere,"Alert is not displayed");
 }


 
  }
	

