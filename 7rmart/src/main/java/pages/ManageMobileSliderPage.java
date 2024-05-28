package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageMobileSliderPage {
	WebDriver driver;
	public ManageMobileSliderPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider']")private WebElement mobileslidertile;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement categorydropdown;
	@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss'][1]")private WebElement deletebutton;
	
	public void verifyTheUserIsAbleToClickOnMobilesliderTile()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",mobileslidertile);
		mobileslidertile.click();
	}
	
	public void verifyTheUserIsAbleToClickOnNewIcon()
	{
		newbutton.click();
	}
	
	public void verifyTheUserIsAbleToSelectTheCategory(String category)
	{
		Select selects=new Select(categorydropdown);
		selects.selectByVisibleText(category);
	}
	
	public void verifyTheUserIsAbleToSaveTheItem()
	{
		savebutton.click();
	}
	public boolean isAlertDisplayed()
	{
		return alerttext.isDisplayed();
	}
	public void verifyTheUserIsAbleToClickOnDeleteIcon()
	{
		
		deletebutton.click();
		
		
		driver.switchTo().alert().accept();
	}
	
	public boolean isAlertDisplayedAfterDelete()
	{
		return alerttext.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
