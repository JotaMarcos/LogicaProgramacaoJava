package cursologicaCapitulo09;

public class ClasseInstancia {

	public static void main(String[] args) {
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		System.out.println("Quantidade mínima em estoque do produto 1: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto = new Produto();
		Produto.quantidadeMinimaEstoque = 10;
		produto.nome = "Caneca";

		System.out.println("Quantidade mínima em estoque do produto 1: " + Produto.quantidadeMinimaEstoque);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println("Quantidade mínima em estoque do produto 2: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		//produto2.quantidadeMinimaEstoque = 8;
		
		System.out.println("Quantidade mínima em estoque do produto 2: " + Produto.quantidadeMinimaEstoque);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 1: " + produto2.nome);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
	}

}
