package _Core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	//Capabilities Android
	String platformName_value = "Android";
	String deviceName_value = "Pixel_Emulator";
	String automationName_value = "uiautomator2";
	String appPackage_value = "com.cerveceriamodelo.modelonow";
	String appActivity_value = "com.cerveceriamodelo.modelonow.MainActivity";
	String APP_value = "C:\\Users\\Administrador\\eclipse-workspace\\ZeDelivery\\src\\test\\resources\\Mobile\\APK\\ZéDelivery_v20.27.1_apkpure.com.apk";
	
	//API
	String urlZeDelivery = "https://www.ze.delivery/";
	String usuarioZeDelivery = "joao.silva.automacao@gmail.com";
	String senhaZeDelivery = "joao.silva@123";
	
	String base_URI = "https://petstore.swagger.io/";
	String base_PATH = "";
	Integer port_HTTP = 80; 
	Integer port_HTTPS = 443; 
	
	ContentType contentType = ContentType.JSON;
	Long Max_Timout = 20000L;


}
