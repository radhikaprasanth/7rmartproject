package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageExpensePage {

		WebDriver driver;
		public ManageExpensePage(WebDriver driver)
		{
			this.driver=driver;
			
				PageFactory.initElements(driver , this);
				
			}
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/expense']")private WebElement manageexpensetile;	
		@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement  newbutton ;
		@FindBy(xpath="//select[@name='user_id']")private WebElement userdropdown;
		@FindBy(xpath="//input[@id='ex_date']")private WebElement date;
		@FindBy(xpath="//td[@class='today active day']")private WebElement todaysdate;
		@FindBy(xpath="//select[@name='ex_cat']")private WebElement categorydropdown;
		@FindBy(xpath="//select[@name='order_id']")private WebElement orderiddropdown;
		@FindBy(xpath="//select[@name='purchase_id']")private WebElement purchaseiddropdown;
		@FindBy(xpath="//select[@name='ex_type']")private WebElement expensetypedropdown;
		@FindBy(xpath="//input[@name='amount']")private WebElement amountfield;
		@FindBy(xpath="//textarea[@name='remarks']")private WebElement remarksfield;
		@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;
		@FindBy(xpath="//p[text()='Manage Expense']")private WebElement manageexpensebutton;
		@FindBy(xpath="//a[contains(@onclick,'return confirm')]")private WebElement deletebutton;
		public void verifyTheUserIsAbleToClickOnManageExpense()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",manageexpensetile);
			//manageexpensetile.click();
		}
		public void verifyTheUserIsAbleToClickOnNewIcon()
		
		{
			
			newbutton.click();
		}
		public void verifyTheUserIsAbleToSelectTheUser(int user)
		{
			Select selects=new Select(userdropdown);
			selects.selectByIndex(user);
		}
		public void verifyTheUserIsAbleToChooseTheDate()
		{
			date.click();
			todaysdate.click();
		}
		
		public void verifyTheUserIsAbleToSelectTheCategory(String category)
		{
			Select selects=new Select(categorydropdown);
			selects.selectByVisibleText(category);
		}
		public void verifyTheUserIsAbleToSelectTheOrderID(int orderid)
		{
			Select selects=new Select(orderiddropdown);
			selects.selectByIndex(orderid);
		}
		public void verifyTheUserIsAbleToSelectThePurchaseID(int purchaseid)
		{
			Select selects=new Select(purchaseiddropdown);
			selects.selectByIndex(purchaseid);
		}
		public void verifyTheUserIsAbleToSelectTheExpenseType(String expensetype)
		{
			Select selects=new Select(expensetypedropdown);
			selects.selectByVisibleText(expensetype);
		}
		public void verifyTheUserIsAbleToEnterTheAmount(int amount)
		{
			 String amountString = String.valueOf(amount);
			    amountfield.sendKeys(amountString);
		}
		public void verifyTheUserIsAbleToEnterTheRemarks( String remarks)
		{
			remarksfield.sendKeys(remarks);
		}
		public void verifyTheUserIsAbleToSaveTheItem()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",savebutton);
			
		}
		public boolean isAlertDisplayed()
		{
			return alerttext.isDisplayed();
		}
		public void verifyTheUserIsAbleToClickOnManageButton()
		{
			manageexpensebutton.click();
		}
		
		
		public void verifyTheUserIsAbleToDeleteTheItem()
		{
			deletebutton.click();
			driver.switchTo().alert().accept();
		}
		
		}
	
		
		
		
		
		
		
		
		
		
		
	

