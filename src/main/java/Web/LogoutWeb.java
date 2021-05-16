package Web;

import org.junit.Test;

import _Core.Constantes;
import _Core.DriverFactory;
import org.junit.Assert;

public class LogoutWeb implements Constantes {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaLogout () {
		
		step.url(urlZeDelivery);
		step.perfil();
		step.sair();
		
		Assert.assertEquals("ENTRAR NA CONTA COM E-MAIL", step.validaLogout());
		DriverFactory.finalizarDriverFactory();
		
	}
	
}
