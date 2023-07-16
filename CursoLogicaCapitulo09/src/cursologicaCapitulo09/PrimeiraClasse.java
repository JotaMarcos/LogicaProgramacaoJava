package cursologicaCapitulo09;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		Produto produto  = new Produto();
		
		produto.nome = "Smartphone XPTO10";
		produto.precoUnitario = 3850.0;
		produto.quantidadeEstoque = 9;
		
		System.out.println("Produto: " + produto.nome + ". " +  produto.eNecessarioReporEstoque());
		
		
		
//		produto.exibirQuantidadeEmEstouque();
		//Produto.exibirReposicaoDeQuantidadeEmEstouque(produto); // Esse é método estático
		//produto.exibirReposicaoDeQuantidadeEmEstouque();
		
	}
	
	
//	static void exibirQuantidadeEmEstouque(Produto produto) {
//		System.out.println("--------------------------------------------------------");
//		System.out.println("Quantidade em estoque do produto " + produto.nome + " : " + produto.quantidadeEstoque);
//		System.out.println("--------------------------------------------------------");
//	}
//	
//	static void exibirReposicaoDeQuantidadeEmEstouque(Produto produto) {
//		System.out.println("--------------------------------------------------------------------------------------------------");
//		if(produto.quantidadeEstoque < 10) {
//			System.out.println("Quantidade em estoque do produto " + produto.nome + " : " + produto.quantidadeEstoque + " com estoque baixo e é necessária a reposição.");
//		} else {
//			System.out.println("Quantidade em estoque do produto " + produto.nome + " : " + produto.quantidadeEstoque + " com estoque normal e não é necessária a reposição.");
//		}
//		System.out.println("--------------------------------------------------------------------------------------------------");
//	}

}
