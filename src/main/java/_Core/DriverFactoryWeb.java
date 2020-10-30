package _Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactoryWeb {

	public static WebDriver driver;
	
	private void instanciarDriverFactor() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public DriverFactoryWeb() {
		
		inicializaDriverFactory ();
		
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
