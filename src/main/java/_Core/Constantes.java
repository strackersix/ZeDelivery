package _Core;

import io.restassured.http.ContentType;

public interface Constantes {
	
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
