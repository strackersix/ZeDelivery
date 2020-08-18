package API;

public interface PetStoreSwagger {
	
	String T_01_inserirUsuariosJson = "[{\"id\": 1, \"username\": \"ana.maria\", \"firstName\": \"Ana\", \"lastName\": \"Maria\", \"email\": \"ana.maria@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 } , { \"id\": 2, \"username\": \"rodrigo.mendes\", \"firstName\": \"Rodrigo\", \"lastName\": \"Mendes\", \"email\": \"rodrigo.mendes@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 } , { \"id\": 3, \"username\": \"tatiana.vasconcelos\", \"firstName\": \"Tatiana\", \"lastName\": \"Vasconcelos\", \"email\": \"tatiana.vasconcelos@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 }]";
	String T_01_inserirUsuariosEndpoint = "v2/user/createWithList";
	
	String T_02_inserirPetsJson = "{ \"id\": 1, \"category\": { \"id\": 10, \"name\": \"Snoopy\" }, \"name\": \"Bichento\", \"photoUrls\": [ \"cat\" ], \"tags\": [ { \"id\": 20, \"name\": \"Perry\" } ], \"status\": \"Ativado\" }";
	String T_02_inserirPetsEndpoint = "v2/pet";
	
	String T_03_vendaPetParryAnaMariaJson = "{ \"id\": 1, \"petId\": 20, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:02:27.627Z\", \"status\": \"placed\", \"complete\": true }";
	String T_03_vendaPetParryAnaMariaEndpoint = "v2/store/order";
	
	String T_04_vendaPetSnoopyRodrigoMendesJson = "{ \"id\": 2, \"petId\": 10, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:03:27.627Z\", \"status\": \"placed\", \"complete\": true }";
	String T_04_vendaPetSnoopyRodrigoMendesEndpoint = "v2/store/order";
	
	String T_05_vendaPetSnoopyTatianaVasconcelosJson = "{ \"id\": 3, \"petId\": 10, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:03:27.627Z\", \"status\": \"placed\", \"complete\": true }";
	String T_05_vendaPetSnoopyTatianaVasconcelosEndpoint = "v2/store/order";
	
	String T_06_consultarPrimeiraOrdemJson = "v2/store/order/1";
	String T_07_consultarSegundaOrdemJson = "v2/store/order/2";
	String T_08_consultarTerceiraOrdemJson = "v2/store/order/3";
	
	
}
