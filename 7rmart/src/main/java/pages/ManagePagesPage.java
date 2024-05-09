package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePagesPage {

	WebDriver driver;
	public ManagePagesPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page']")private WebElement managepagestile;
	@FindBy(xpath="//i[@class='fas fa-trash-alt'][1]")private WebElement deleteicon;
	@FindBy(xpath="//a[@onclick=\"return confirm('Do you want to delete this Page?')\"]")private WebElement alertbutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertsuccess;
	
	public void verifyTheUserIsAbleToClickOnManagePagesTile()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",managepagestile);
		managepagestile.click();
	}
	
	public void verifyTheUserIsAbleToClickOnDeleteIcon()
	{
		
		deleteicon.click();
		
		
		driver.switchTo().alert().accept();
	}
	
	
	
	public void verifyWhetherAlertButtonIsClicked()
	{
		alertbutton.click();
		driver.switchTo().alert().accept();
	}
	
	public boolean verifyWhetherAlertTextIsDisplayed()
	{
		return alertsuccess.isDisplayed();
		
	}
	
	
	
	
	
	
}
