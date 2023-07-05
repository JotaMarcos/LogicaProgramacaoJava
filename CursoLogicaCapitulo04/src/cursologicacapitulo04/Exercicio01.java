package cursologicacapitulo04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		Integer valor1 = scanner.nextInt();
		
		System.out.print("Qual é a operação? ");
		Integer operacao = scanner.nextInt();
		// 1 - adição, 2 - subtração, 3 - multiplicação, 4 - divisão
		System.out.print("Digite o segundo valor: ");
		Integer valor2 = scanner.nextInt();
		
		Integer resultado;
		
		if (operacao == 1) {
			System.out.println("A operação é: " + valor1 + " + " + valor2);
			resultado = valor1 + valor2;
			System.out.print("O resultado da adição é: " + resultado);
		} else if(operacao == 2) {
			System.out.println("A operação é: " + valor1 + " - " + valor2);
			resultado = valor1 - valor2;
			System.out.print("O resultado da adição é: " + resultado);
		} else if(operacao == 3) {
			System.out.println("A operação é: " + valor1 + " * " + valor2);
			resultado = valor1 * valor2;
			System.out.print("O resultado da adição é: " + resultado);
		} else if(operacao == 4) {
			System.out.println("A operação é: " + valor1 + " / " + valor2);
			resultado = valor1 / valor2;
			System.out.print("O resultado da adição é: " + resultado);
		} else {
			System.out.println("Operação inválida!");
		}
		
		
		scanner.close();
		
	}

}
