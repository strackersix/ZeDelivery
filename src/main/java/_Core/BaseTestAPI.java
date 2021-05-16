package _Core;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class BaseTestAPI implements Constantes {
	
	@BeforeClass
	public static void setup () {
		
		RestAssured.baseURI = base_URI;
		RestAssured.port = port_HTTPS;
		
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setContentType(contentType);
 		RestAssured.requestSpecification = reqBuilder.build();
 		
 		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
 		resBuilder.expectResponseTime(Matchers.lessThan(Max_Timout));
		
	}
	
}
