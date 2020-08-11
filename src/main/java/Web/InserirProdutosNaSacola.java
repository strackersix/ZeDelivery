package Web;

import org.junit.Test;

import _Core.Constantes;

public class InserirProdutosNaSacola implements Constantes {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaPedido () {
		
		step.url(urlZeDelivery);
		step.sextou("skol", 10, "original", 20, "coloRado", 15);
	
	}
		

}
