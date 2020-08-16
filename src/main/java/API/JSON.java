package API;

public interface JSON {
	
	String T_01_inserirUsuarios = "[{\"id\": 1, \"username\": \"ana.maria\", \"firstName\": \"Ana\", \"lastName\": \"Maria\", \"email\": \"ana.maria@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 } , { \"id\": 2, \"username\": \"rodrigo.mendes\", \"firstName\": \"Rodrigo\", \"lastName\": \"Mendes\", \"email\": \"rodrigo.mendes@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 } , { \"id\": 3, \"username\": \"tatiana.vasconcelos\", \"firstName\": \"Tatiana\", \"lastName\": \"Vasconcelos\", \"email\": \"tatiana.vasconcelos@itau.com.br\", \"password\": \"123456\", \"phone\": \"11981699678\", \"userStatus\": 1 }]";
	String T_02_inserirPets = "{ \"id\": 1, \"category\": { \"id\": 10, \"name\": \"Snoopy\" }, \"name\": \"Bichento\", \"photoUrls\": [ \"cat\" ], \"tags\": [ { \"id\": 20, \"name\": \"Perry\" } ], \"status\": \"Ativado\" }";
	String T_03_vendaPetParryAnaMaria = "{ \"id\": 1, \"petId\": 20, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:02:27.627Z\", \"status\": \"placed\", \"complete\": true }";
	String T_04_vendaPetSnoopyRodrigoMendes = "{ \"id\": 2, \"petId\": 10, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:03:27.627Z\", \"status\": \"placed\", \"complete\": true }";
	String T_05_vendaPetSnoopyTatianaVasconcelos = "{ \"id\": 3, \"petId\": 10, \"quantity\": 1, \"shipDate\": \"2020-06-21T16:03:27.627Z\", \"status\": \"placed\", \"complete\": true }";
	String T_06_consultarPrimeiraOrdem = "v2/store/order/1";
	String T_07_consultarSegundaOrdem = "v2/store/order/2";
	String T_08_consultarTerceiraOrdem = "v2/store/order/3";

}
