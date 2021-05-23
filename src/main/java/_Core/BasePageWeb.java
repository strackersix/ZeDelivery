package _Core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageWeb extends DriverFactory {
	
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	public void click (WebElement element) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	}
	
	public void sendKeys (WebElement element, String text) {
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		}		
	}
		
	public void waitToBeClickable (WebElement element, int secunds) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitToBeVisibility (WebElement element, int secondsTimeOut) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
