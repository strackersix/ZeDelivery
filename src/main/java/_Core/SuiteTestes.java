package _Core;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import API.API;
import Mobile.ExcluirProdutosDaSacola;
import Mobile.LoginMobile;
import Mobile.LogoutMobile;
import Web.InserirProdutosNaSacola;
import Web.LoginWeb;
import Web.LogoutWeb;

@RunWith(Suite.class)
@SuiteClasses({
	
	//API
	API.class,
	
	//WEB
	LoginWeb.class,
	InserirProdutosNaSacola.class,
	LogoutWeb.class,
	
	//Mobile
	LoginMobile.class,
	ExcluirProdutosDaSacola.class,
	LogoutMobile.class
	
})



public class SuiteTestes {
	
	@AfterClass
	public static void killDriverFactory () {
		
		DriverFactoryMobile.finalizarDriverFactory();
		
	}

}
