package API;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import _Core.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class API extends BaseTest {
	
	@Test 
	public void T_01_inserirUsuarios () {
		
		given()
			.contentType(contentType)
			.body("[{\"id\": 1, \"username\": \"ana.maria\", \"firstName\": \"Ana\", \"lastName\": \"Maria\", \"email\": \"ana.maria@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 } , { \"id\": 2, \"username\": \"rodrigo.mendes\", \"firstName\": \"Rodrigo\", \"lastName\": \"Mendes\", \"email\": \"rodrigo.mendes@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 } , { \"id\": 3, \"username\": \"tatiana.vasconcelos\", \"firstName\": \"Tatiana\", \"lastName\": \"Vasconcelos\", \"email\": \"tatiana.vasconcelos@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 }]")
		.when()
			.post("v2/user/createWithList")
		.then()
			.log().all()
			.statusCode(200)
			.body("type", is("unknown"))
			.body("message", is("ok"))
		;
				
	}
	
	@Test 
	public void T_02_inserirPets () {
		
		given()
			.contentType(contentType)
			.body("{ \"id\": 1, \"category\": { \"id\": 10, \"name\": \"Snoopy\" }, \"name\": \"Bichento\", \"photoUrls\": [ \"cat\" ], \"tags\": [ { \"id\": 20, \"name\": \"Perry\" } ], \"status\": \"Ativado\" }")
		.when()
			.post("v2/pet")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(1))
			.body("category.id", is(10))
			.body("category.name", is("Snoopy"))
			.body("name", is("Bichento"))
			.body("photoUrls", contains("cat"))
			.body("tags.id", contains(20))
			.body("tags.name", contains("Perry"))
			.body("status", is("Ativado"))
		;
		
	}
	
	@Test
	public void T_03_vendaPetParryAnaMaria () {
		
		given()
			.contentType(contentType)
			.body("{ \"id\": 1, \"petId\": 20, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:02:27.627Z\", \"status\": \"placed\", \"complete\": true }")
		.when()
			.post("v2/store/order")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(1))
			.body("petId", is(20))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:02:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true))
				
		;
		
	}
	
	@Test
	public void T_04_vendaPetSnoopyRodrigoMendes () {
		
		given()
			.log().all()
			.contentType(contentType)
			.body("{ \"id\": 2, \"petId\": 10, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:03:27.627Z\", \"status\": \"placed\", \"complete\": true }")
		.when()
			.post("v2/store/order")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(2))
			.body("petId", is(10))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:03:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true))
		
		;
		
	}
	
	@Test
	public void T_05_vendaPetSnoopyTatianaVasconcelos () {
		
		given()
			.log().all()
			.contentType(contentType)
			.body("{ \"id\": 3, \"petId\": 10, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:03:27.627Z\", \"status\": \"placed\", \"complete\": true }")
		.when()
			.post("v2/store/order")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(3))
			.body("petId", is(10))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:03:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true))
			
		;
		
	}
	
	@Test
	public void T_06_consultarPrimeiraOrdem () {
		
		given()
			.contentType(contentType)
		.when()
			.get("v2/store/order/1")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(1))
			.body("petId", is(20))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:02:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true))
			
		;
		
	}
	
	@Test
	public void T_07_consultarSegundaOrdem () {
		
		given()
			.contentType(contentType)
		.when()
			.get("v2/store/order/2")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(2))
			.body("petId", is(10))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:03:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true))
		;
		
	}
	
	@Test
	public void T_08_consultarTerceiraOrdem () {
		
		given()
			.contentType(contentType)
		.when()
			.get("v2/store/order/3")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(3))
			.body("petId", is(10))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:03:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true))
		;
		
	}

}
