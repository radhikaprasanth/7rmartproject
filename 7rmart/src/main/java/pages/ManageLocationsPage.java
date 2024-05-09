package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageLocationsPage {

	WebDriver driver;
	public ManageLocationsPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	@FindBy(xpath="//p[text()='Manage Location']")private WebElement managelocationlink;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbuttonclick;
	@FindBy(xpath="//select[@name='country_id']")private WebElement selectcountryfield;
	@FindBy(xpath="//select[@name='state_id']")private WebElement selectstatefield;
	@FindBy(xpath="//input[@name='location']")private WebElement locationfield;
	@FindBy(xpath="//input[@name='delivery']")private WebElement deliverychargefield;
	@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;
	
	public void verifyUserIsAbleToClickOnManageLocation()
	{
		managelocationlink.click();
	}
	public void verifyUserIsAbleToClickOnNewButton()
	{
		newbuttonclick.click();
	}
	
	public void verifyUserIsAbleToSelectCountry(String country)
	{
		Select selects=new Select(selectcountryfield);
		selects.selectByVisibleText(country);
		
	}
	public void verifyUserIsAbleToSelectState()
	{
		Select selects=new Select(selectstatefield);
		selects.selectByIndex(5);
	}
	
	public void verifyUserIsAbleToEnterLocation(String location)
	{
		locationfield.sendKeys(location);
	}
	
	public void verifyUserIsAbleToEnterDeliveryCharge(int deliverycharges)
	{
		deliverychargefield.sendKeys(String.valueOf(deliverycharges));
		
	}
	public void verifyUserIsAbleToSaveTheDatas()
	{
		savebutton.click();
	}
	
	public boolean isAlertDisplayed()
	{
		return alerttext.isDisplayed();
		
	}
	
	
	
}
