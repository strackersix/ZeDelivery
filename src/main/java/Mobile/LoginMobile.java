package Mobile;

import org.junit.Test;

import _Core.Constantes;

public class LoginMobile implements Constantes {

	_Framework step = new _Framework();

	@Test
	public void testLoginMobile() throws InterruptedException {

		step.pularIntroducao();
		step.entrarNaConta();
		step.escreverEmail(usuarioZeDelivery);
		step.escreverSenha(senhaZeDelivery);
		step.clicarBotaoEntrarEmailESenha();

	}

}
