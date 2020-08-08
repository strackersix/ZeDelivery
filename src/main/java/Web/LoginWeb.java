package Web;

import org.junit.Assert;
import org.junit.Test;

import _Core.Constantes;
import _Core.DriverFactoryWeb;

public class LoginWeb implements Constantes {
	
	_Framework step = new _Framework();
	
	@Test
	public void executeLogin () {
		
		step.url(urlZeDelivery);
		step.maiorIdade();
		step.entrar();
		step.entrarComEmail();
		step.usuario(usuarioZeDelivery);
		step.senha(senhaZeDelivery);
		step.logar();
		
		Assert.assertEquals("Olá, Joao", step.validaLogin());
		
		
	}
		
}
