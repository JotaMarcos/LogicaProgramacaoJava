package cursologicaCapitulo09;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	static Integer quantidadeMinimaEstoque = 1;
	
	String nome;
	
	Double precoUnitario;
	
	Integer quantidadeEstoque;
	

	
	Boolean eNecessarioReporEstoque() {
		if(quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			//System.out.println("é necessário repor o estoque.");
			return true;
		} else {
			//System.out.println("não é necessário repor o estoque.");
			return false;
		}
		
	}
	
	
//	void exibirQuantidadeEmEstouque() {
//		System.out.println("--------------------------------------------------------");
//		System.out.println("Quantidade em estoque do produto " + nome + " : " + quantidadeEstoque);
//		System.out.println("--------------------------------------------------------");
//	}
//	
//	void exibirReposicaoDeQuantidadeEmEstouque() {
//		System.out.println("--------------------------------------------------------------------------------------------------");
//		if(quantidadeEstoque < 10) {
//			System.out.println("Quantidade em estoque do produto " + nome + " : " + quantidadeEstoque + " com estoque baixo e é necessária a reposição.");
//		} else {
//			System.out.println("Quantidade em estoque do produto " + nome + " : " + quantidadeEstoque + " com estoque normal e não é necessária a reposição.");
//		}
//		System.out.println("--------------------------------------------------------------------------------------------------");
//	}
//	
}
