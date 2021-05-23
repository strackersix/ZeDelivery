package _Core;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class BaseScreenMobile extends Capabilities {
	
	public BaseScreenMobile() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public void click (MobileElement element) {
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	}
	
	public void sendKeys (MobileElement element, String text) {
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		}
	}
	
	public void waitToBeClickable (MobileElement element, int seconds ) {
		
		wait.until(ExpectedConditions.elementToBeClickable((element)));
	}
		
	public void waitToBeVisibility (MobileElement element, int seconds) {
		
		wait.until(ExpectedConditions.visibilityOf((element)));
	}

}
