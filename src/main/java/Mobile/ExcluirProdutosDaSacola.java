package Mobile;

import org.junit.Test;

public class ExcluirProdutosDaSacola {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaExcluirprodutosDaSacola () {
		
		step.selecionarEndereco();
		step.selecionarCasa();
		step.continuar();
		step.verProdutosDisponiveis();
		step.verSacola();
		step.excluirProdutos();
		
	}

}
