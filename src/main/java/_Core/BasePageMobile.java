package _Core;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class BasePageMobile extends DriverFactoryMobile {
	
	public void waitToBeClickable ( String locator, int secunds ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(locator)));
	
	}
		
	public void waitToBeVisibility (String locator, int secondsTimeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(locator)));
			
	}

}
