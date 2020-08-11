package Mobile;

import org.junit.Test;

import _Core.Constantes;

public class LoginMobile implements Constantes {

	_Framework step = new _Framework();

	@Test
	public void executeLoginMobile() throws InterruptedException {

		step.permitirDuranteUsoApp();
		step.pularIntroducao();
		step.entrarNaConta();
		step.email(usuarioZeDelivery);
		step.senha(senhaZeDelivery);
		step.entrar();

		
	}

}
