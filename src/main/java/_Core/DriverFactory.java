package _Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverFactory {

	public static WebDriver driver;
	
	private void instanciarDriverFactor() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	public DriverFactory() {
	
		inicializaDriverFactory();
	}
	
	public void inicializaDriverFactory() {
		
		if (driver == null)
			instanciarDriverFactor();
	}
	
	public static void finalizarDriverFactory() {
		
		driver.quit();
		driver = null;
	}
		
}
