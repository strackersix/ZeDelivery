package Web;

import org.junit.Test;

import _Core.Constantes;

public class InserirProdutosNaSacola implements Constantes {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaPedido () {
		
		step.url(urlZeDelivery);
		step.sextouOld("skOl", 20, "brAhMa", 30, "ORIGINAL", 40);

		
	
	}
		

}
