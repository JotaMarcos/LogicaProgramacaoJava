package cursologicocapitulo06;

import java.text.DecimalFormat;
import java.util.Iterator;

public class IteracaoFor {
	
	public static final DecimalFormat df = new DecimalFormat("R$ ###,##0.00");

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i + ": Uma frase qualquer.");
//		}
		
//		Double[] carrinhoDeCompras = new Double[] {50.0, 51.0, 52.0};
//		Double total = 0.0;
//		
//		for (int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println("Iteração " + i + ", Total: " + df.format(total));
//			total += carrinhoDeCompras[i]; 
//		}
//		
//		System.out.println("Total da compra: " +  df.format(total));
		
//		for (int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println("Iteração: " + i);
//			
//		}
		
//		for (int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai continuar!");
//				continue;
//			}
//			System.out.println("Iteração: " + i);
//		}
//		
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
//		for(int i = 0; i < produtos.length; i++) {
//			Integer produtoCorrente = produtos[i];
//			if(produtoCorrente.equals(produtos[i])) {
//				System.out.println(i + ": Produto encontrado! " + df.format(produtos[i]));
//				System.out.println("Produto encontrado!");
//				break;
//			}
//		}
		
		for(int i = 0; i < produtos.length; i++) {
			Integer produtoCorrente = produtos[i];
			if(produtoCorrente.equals(produtos[i])) {
				System.out.println(i + ": Produto encontrado! " + df.format(produtos[i]));
				System.out.println("Produto encontrado!");
				continue;
			}
		}
		
	}

}
