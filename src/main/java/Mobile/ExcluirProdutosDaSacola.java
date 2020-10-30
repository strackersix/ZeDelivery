package Mobile;

import org.junit.Test;

public class ExcluirProdutosDaSacola {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaExcluirProdutosDaSacola () {
		
		step.selecionarEndereco();
		step.verProdutosDisponiveis();
		step.verSacola();
		step.excluirProdutos();
		
	}

}
