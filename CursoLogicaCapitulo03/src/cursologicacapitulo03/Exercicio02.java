package cursologicacapitulo03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
				
		System.out.print("Digite o seu sobrenome: ");
		String sobreNome = scanner.nextLine();
		
		String nomeCompleto = nome + " " + sobreNome;
		
		System.out.println("Olá, Seja bem vindo! " + nomeCompleto + "!");
		
		
		scanner.close();
		

	}

}
