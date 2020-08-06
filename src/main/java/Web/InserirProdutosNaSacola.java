package Web;

import org.junit.Test;

import _Core.Constantes;
import _Core.DriverFactoryWeb;

public class InserirProdutosNaSacola implements Constantes {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaPedido () {
		
		step.url(urlZeDelivery);
		step.sextou("skol", 50, "original", 80, "coloRado", 200);
		
		try {
			
			DriverFactoryWeb finalizar = new DriverFactoryWeb();
			finalizar.finalizarDriverFactory();
			
		} finally {}
		
	}
	
	

}
