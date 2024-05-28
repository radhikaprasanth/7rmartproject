package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{


	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	public void javaSriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	public void clickAndHoldOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
		//actions.moveToElement(element).build().perform();
		//actions.doubleClick(element).build().perform();
		//actions.contextClick(element).build().perform();
		//actions.dragAndDrop(element, element).build().perform();
	}
	public void dragAndDrop(WebElement dragableItem, WebElement dropItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragableItem, dropItem);
	}

	public void singleClick(WebElement dragableItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(dragableItem).click().perform();
	}

	public void doubleClick(WebElement dragableItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(dragableItem);
	}
	
	
public void rightClick(WebElement dragableItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick(dragableItem);
	}

	public void getAttributes(WebElement element, String attribute) {
		element.getAttribute(attribute);
	}
	public void selectValueUsingSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);		
	}
	
	public void selectValueUsingSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);		
	}
	
	public void selectValueUsingSelectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	
	
	
}
