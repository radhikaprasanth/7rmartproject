package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {


	WebDriver driver;
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	
	@FindBy(xpath="//p[text()='Manage Delivery Boy']")private  WebElement managedeliveryboy;
	@FindBy(xpath="//a[@onclick='click_button(2)']")private  WebElement searchicon;
	@FindBy(xpath="//input[@id='un']")private  WebElement namefield;
	@FindBy(xpath="//button[@type='submit']")private  WebElement searchbutton;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']")private  WebElement deliveryboytable;
	@FindBy(xpath="//table/tbody/tr/td[1]")private List<WebElement> column1;
	public void verifyTheUserIsAbleToClickmanageDeliveryboyTile()
	{
		managedeliveryboy.click();
	}
	public void verifyTheUserIsAbleToClickTheSearchButton()
	{
		searchicon.click();	
	}
	
	public void verifyTheUserIsAbleToEnterNameOnNameField(String name)
	{
		namefield.sendKeys(name);
	}
	public void verifyTheUserIsAbleToClickTheSearchButtonUnderTheFields()
	{
		searchbutton.click();
	}
	public boolean verifyTheTableContainingTheDeliveryBoyNameDetailsAreDisplayed()
	{
		return(deliveryboytable.isDisplayed());
	}
	public boolean verifyDataContainingTest(String str) 
	{
	    for (WebElement element : column1) 
	    {
	        if (element.getText().equalsIgnoreCase(str)) 
	        {
	            return true;
	        }
	    }
	    return false; 
	}
	}
	
	




