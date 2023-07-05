package cursologicacapitulo04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do(a) contribuinte: ");
		String nomeContribuinte = scanner.nextLine();
		
		System.out.print("Digite a idade do(a) contribuinte: ");
		Integer idadeContribuinte = scanner.nextInt();
		
		System.out.print("Digite o tempo de contribuição com a Previdência Social: ");
		Integer tempoDeContribuicao = scanner.nextInt();
		
		
		Boolean podeAposentar = (idadeContribuinte >= 55 && tempoDeContribuicao >= 25);
		
		if (podeAposentar) {
			System.out.println("O contribuinte " + nomeContribuinte + " pode aposentar.");
		} else {
			System.out.println("O contribuinte " + nomeContribuinte + " não pode aposentar.");
		}
		
		
		
		
		scanner.close();
		
	}

}
