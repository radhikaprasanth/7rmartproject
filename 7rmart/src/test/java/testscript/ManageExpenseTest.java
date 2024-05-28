package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageExpensePage;
import utilities.ExcelUtility;

public class ManageExpenseTest extends Base{
  @Test
  public void verifyWhetherTheUSerIsAbleToEnterDatasOnManageExpense() throws IOException
  {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  
	 
	 int user=3;
	 String category="newitem";
	 int orderid=8;
	 int purchaseid=11;
	 String expensetype="Debit Bank";
	 int amount=225;
	 String remarks="Test Remark";
	 
	 //int user=ExcelUtility.getIntegerData(1, 0, "ManageExpense");
	  //String category=ExcelUtility.getStringData(1, 1, "ManageExpense");
	  //int orderid=ExcelUtility.getIntegerData(1, 2, "ManageExpense");
	  //int purchaseid=ExcelUtility.getIntegerData(1, 3, "ManageExpense");
	  //String expensetype=ExcelUtility.getStringData(1, 4, "ManageExpense");
	  //int amount=ExcelUtility.getIntegerData(1, 5, "ManageExpense");
	  //String remarks=ExcelUtility.getStringData(1, 6, "ManageExpense");
	 
	 
	 ManageExpensePage manageexpensepage=new ManageExpensePage(driver);
	 manageexpensepage.verifyTheUserIsAbleToClickOnManageExpense();
	 manageexpensepage.verifyTheUserIsAbleToClickOnNewIcon();
	 manageexpensepage.verifyTheUserIsAbleToSelectTheUser(user);
	 manageexpensepage.verifyTheUserIsAbleToChooseTheDate();
	 manageexpensepage.verifyTheUserIsAbleToSelectTheCategory(category);
	 manageexpensepage.verifyTheUserIsAbleToSelectTheOrderID(orderid);
	 manageexpensepage.verifyTheUserIsAbleToSelectThePurchaseID(purchaseid);
	 manageexpensepage.verifyTheUserIsAbleToSelectTheExpenseType(expensetype);
	 manageexpensepage.verifyTheUserIsAbleToEnterTheAmount(amount);
	 manageexpensepage.verifyTheUserIsAbleToEnterTheRemarks(remarks);
	 manageexpensepage.verifyTheUserIsAbleToSaveTheItem();
	 boolean isAlertDisplayed=manageexpensepage.isAlertDisplayed();
	 Assert.assertTrue(isAlertDisplayed,"Alert not displayed");
	 manageexpensepage.verifyTheUserIsAbleToClickOnManageButton();
	 manageexpensepage.verifyTheUserIsAbleToDeleteTheItem();
	
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
