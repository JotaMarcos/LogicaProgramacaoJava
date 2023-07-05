package cursologicacapitulo03;

import java.util.Scanner;

public class TipoLogico {

	public static void main(String[] args) {
		
//		Boolean variavelVerdadeira = true;
//		System.out.println("-------------------------------");
//		System.out.println("Variável verdadeira: " + variavelVerdadeira);
//		
//		System.out.println("-------------------------------");
//		Boolean variavelFalsa = false;
//		System.out.println("Variável falsa: " + variavelFalsa);
		
		System.out.println("-------------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu nome completo: ");
		String nomeCompleto = scanner.nextLine();
		System.out.println("-------------------------------------------------------------");
		System.out.print("Digite a sua idade: ");
		Integer idade = scanner.nextInt();
		Boolean MAIORIDADE = idade >= 18;
		System.out.println("-------------------------------------------------------------");
		Boolean podeTirarCarteira = MAIORIDADE;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! O(A): " + nomeCompleto + " pode tirar carteira!");	
		} else {
			System.out.println("Não! O(A): " + nomeCompleto + " não pode tirar carteira!");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		
		scanner.close();	
	
	}

}
