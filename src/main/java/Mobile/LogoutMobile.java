package Mobile;

import org.junit.Test;

import org.junit.Assert;

public class LogoutMobile {
	
	_Framework step = new _Framework();
	
	@Test
	public void testeLogout () {
		
		step.perfil();
		step.sair();
		
		Assert.assertEquals("ENTRAR NA CONTA", step.validarLogout());
				
	}
	
	

}
