package Mobile;

import org.junit.Test;

import org.junit.Assert;

public class LogoutMobile {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaLogout () {
		
		step.perfil();
		step.sair();
		
		Assert.assertEquals("ENTRAR NA CONTA", step.validarLogout());
				
	}
	
	

}
