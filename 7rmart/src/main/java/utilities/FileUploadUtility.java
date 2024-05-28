package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadUtility
{
	
	public void fileUploadUsingSendKeys(WebElement  element,String path) {	
		element.sendKeys(path);
	
	}
	public void fileUploadUsingSendKeys(WebDriver driver,WebElement element,String filepath)
	{
		element.sendKeys(filepath);
	}
public void fileuploadUsingRobotClass(WebElement element,String path) throws AWTException {
		
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r=new Robot();
		r.delay(250);
		r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.delay(90);
	      r.keyRelease(KeyEvent.VK_ENTER);
}
}
