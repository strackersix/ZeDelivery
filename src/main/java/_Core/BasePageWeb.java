package _Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageWeb extends DriverFactory {
	
	public static WebDriver driver = inicializaDriverFactory();
	WebDriverWait wait = new WebDriverWait(driver, 10);
		
	public BasePageWeb () {
		
		PageFactory.initElements(driver, this);
	}
	
	public void click (WebElement element) {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	}
	
	public void clickEtimeReduzido (WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 3);
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
		
	public void waitToBeClickable (By element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitToBeVisibility (By element) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public String getText(WebElement element) {
			
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}
}
