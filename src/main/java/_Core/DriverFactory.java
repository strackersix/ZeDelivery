package _Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverFactory {

	private static WebDriver driver;

	public DriverFactory() {

		if (driver == null) {
			inicializaDriverFactory();
		}
	}

	public static WebDriver inicializaDriverFactory() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void finalizarDriverFactory() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
