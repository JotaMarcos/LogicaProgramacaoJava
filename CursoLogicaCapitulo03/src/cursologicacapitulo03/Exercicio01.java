package cursologicacapitulo03;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Double numero = scanner.nextDouble();
		
		Double numeroQuadrado = numero * numero;
		
		System.out.println("O quadrado do número " + numero + " é igual a: " + numeroQuadrado);
		
		scanner.close();
		
	}

}
