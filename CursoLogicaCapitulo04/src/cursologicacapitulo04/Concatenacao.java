package cursologicacapitulo04;

import java.util.Scanner;

public class Concatenacao {
	
	public static void main(String[] args) {
//		String inicio = "Esse é ";
//		String meio = "um exemplo de ";
//		String fim = "concatenação de textos.";
//		
//		System.out.println(inicio + meio + fim);
//		
//		System.out.println("Esse é " + meio + "concatenação de textos.");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobreNome = scanner.nextLine();
		System.out.print("Digite a sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.println("Olá " + nome + " " + sobreNome + " você possuí " + idade + " anos.");
				
		scanner.close();
		
		
	}
	

}
