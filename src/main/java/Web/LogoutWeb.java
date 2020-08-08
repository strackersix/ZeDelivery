package Web;

import org.junit.Test;

import _Core.Constantes;
import _Core.DriverFactoryWeb;

public class LogoutWeb implements Constantes {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaLogout () {
		
		step.url(urlZeDelivery);
		step.perfil();
		step.sair();
		
		DriverFactoryWeb.finalizarDriverFactory();
		
	}
	
	
	

}
