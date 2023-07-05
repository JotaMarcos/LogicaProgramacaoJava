package cursologicacapitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	
	public static final DecimalFormat df = new DecimalFormat("R$ #.00");
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto R$: ");
		Double valorProduto = scanner.nextDouble();		
		System.out.print("Digite o valor do Frete R$: ");
		Double valorFrete = scanner.nextDouble();
		
		
		Boolean  EMariorQueCem = valorProduto > 100;
		
		
		if (EMariorQueCem) {
			Double valorFinalCompra = (valorProduto + valorFrete);
			System.out.println("O valor final da compra é R$ " + df.format(valorFinalCompra));
		} else {
			System.out.println("O valor final da compra é R$ " + df.format(valorProduto));
		}
		
		scanner.close();
	
	}

}
