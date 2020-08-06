package _Core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactoryMobile {

	public static AndroidDriver<MobileElement> driver = EncapsularCreateDriver();

	public static void CreateDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "UBV7N18321003225");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.cerveceriamodelo.modelonow");
		desiredCapabilities.setCapability("appActivity", "com.cerveceriamodelo.modelonow.MainActivity");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Gabriel\\eclipse-workspace\\Ze\\src\\test\\resources\\Mobile\\APK\\ZÈDelivery_v20.27.1_apkpure.com.apk");

		try {

			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

		} catch (MalformedURLException e) {

			e.printStackTrace();

		}

	}
	
	public static AndroidDriver<MobileElement> EncapsularCreateDriver() {

		if (driver == null) {
			CreateDriver();

		}

		return driver;

	}

	public static void FinalizarDriverFactory() {

		if (driver != null) {
			driver.quit();
			driver = null;

		}

	}

}
