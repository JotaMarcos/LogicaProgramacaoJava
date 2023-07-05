package cursologicacapitulo03;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRACARTEIRA = 18;

	public static void main(String[] args) {
		
//		final Integer IDADEMINIMAPARATIRACARTEIRA = 18;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRACARTEIRA;
		
		if (!podeTirarCarteira) {
			System.out.println("--------------------------------------------");
			System.out.println("Você possuí " + idade + " anos.");
			System.out.println("--------------------------------------------");
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		} else {
			System.out.println("--------------------------------------------");
			System.out.println("Você possuí " + idade + " anos.");
			System.out.println("--------------------------------------------");
			System.out.println("Sim! Ele(a) não pode tirar carteira.");
		}
		
		scanner.close();
		

	}

}
