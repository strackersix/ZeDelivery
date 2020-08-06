package _Core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageMobile extends DriverFactoryMobile {
	
	public void waitToBeClickable ( String locator, int secunds ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

	}
	
	public void waitToBeVisibility (String locator, int secondsTimeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
			
	}

}
