package cursologicacapitulo03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------------------------------------------");
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		System.out.println("-------------------------------------------------------------");
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		System.out.println("-------------------------------------------------------------");
		Double subTotal = valorProduto * quantidadeProduto;
		System.out.println("O valor do subtotal: " + subTotal);
		System.out.println("-------------------------------------------------------------");
		Boolean quantidadeDesejadaProduto = quantidadeProduto > 10;
		
		Double desconto = subTotal * 10 / 100;
		
		if (quantidadeDesejadaProduto) {
			Double valorTotal = subTotal - desconto;
			System.out.println("Terá desconto de 10%!");
			System.out.println("O valor total: " + valorTotal);
		} else {
			Double valorTotal = subTotal;
			System.out.println("Não terá desconto!");
			System.out.println("O valor total: " + valorTotal);
		}
		
		System.out.println("-------------------------------------------------------------");
		scanner.close();
	}

}
