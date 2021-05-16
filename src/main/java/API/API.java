package API;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.gson.JsonObject;

import _Core.BaseTestAPI;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class API extends BaseTestAPI implements PetStoreSwagger {
	
	@Test 
	public void T_01_inserirUsuarios () {
		
		given()
			.contentType(contentType)
			.body(T_01_inserirUsuariosJson)	
		.when()
			.post(inserirUsuariosEndpoint)
		.then()
			.log().all()
			.statusCode(200)
			.body("code", is(200))
			.body("type", is("unknown"))
			.body("message", is("ok"))
			
		;
	}
		
	@Test 
	public void T_02_inserirPets () {
		
		given()
			.contentType(contentType)
			.body(T_02_inserirPetsJson)
		.when()
			.post(inserirPets)
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
			.body(T_03_vendaPetParryAnaMariaJson)
		.when()
			.post(vendaPetParryAnaMaria)
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
			.body(T_04_vendaPetSnoopyRodrigoMendesJson)
		.when()
			.post(vendaPetSnoopyRodrigoMendes)
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
			.body(T_05_vendaPetSnoopyTatianaVasconcelosJson)
		.when()
			.post(vendaPetSnoopyTatianaVasconcelos)
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
			.get(T_06_consultarPrimeiraOrdemJson)
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
			.get(T_07_consultarSegundaOrdemJson)
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
			.get(T_07_consultarSegundaOrdemJson)
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(2))
			.body("petId", is(10))
			.body("quantity", is(1))
			.body("shipDate", is("2020-06-21T16:03:27.627+0000"))
			.body("status", is("placed"))
			.body("complete", equalTo(true));
						
	}

}
