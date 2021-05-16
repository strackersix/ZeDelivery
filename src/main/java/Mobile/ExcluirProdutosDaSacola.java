package Mobile;

import org.junit.Test;

public class ExcluirProdutosDaSacola {
	
	_Framework step = new _Framework();
	
	@Test
	public void testaExcluirProdutosDaSacola () {
		
		step.selecionarEndereco();
		step.verSacola();
		step.excluirProdutos();
		
	}

}
