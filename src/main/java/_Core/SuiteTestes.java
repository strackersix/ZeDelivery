package _Core;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import API.API;
import Mobile.LoginMobile;
import Mobile.ExcluirProdutosDaSacola;
import Web.Login;
import Web.InserirProdutosNaSacola;

@RunWith(Suite.class)
@SuiteClasses({
	
	//API
	API.class,
	
	//WEB
	Login.class,
	InserirProdutosNaSacola.class,
	
	//Mobile
	LoginMobile.class,
	ExcluirProdutosDaSacola.class,
	
	
	
})



public class SuiteTestes {
	
	@AfterClass
	public static void killDriverFactory () {
		
//		DriverFactoryWeb.finalizarDriverFactory();
		
	}
	

}
