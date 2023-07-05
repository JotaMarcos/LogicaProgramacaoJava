package cursologicacapitulo07;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		
//		String[] cardapio = {"Calabresa", "Atum", "Portuguesa", "Quatro Queijo"};
//		cardapio[1] = "Frango com Catupiri";
		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Portuguesa";
		cardapio[3] = "Quatro Queijo";
		
		cardapio[1] = "Frango com Catupiri";
		System.out.println("===============================================================");
		System.out.println("Escolha o sabor: ");
		
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "] " + cardapio[i]);
		}
		System.out.println("-------------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número referente ao sabor de sua pizza: ");
		Integer saborEscolhido = scanner.nextInt();
		Boolean saborEscolhidoPedido = saborEscolhido < cardapio.length;
		
		if(saborEscolhidoPedido) {
			System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
		} else {
			System.err.println("Sabor escolhido não existe!");
			System.exit(1);
		}
			
		System.out.println("===============================================================");
		scanner.close();
			
	}

}
