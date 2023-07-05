package cursologicacapitulo05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira média: ");
		Double mediaPrimeiraDisciplina = scanner.nextDouble();
		System.out.print("Digite a segunda média: ");
		Double mediaSegundaDisciplina = scanner.nextDouble();
		
		Boolean notaMinimaPrimeiraDisciplina = mediaPrimeiraDisciplina >= 60;
		Boolean notaMinimaSegundaDisciplina = mediaSegundaDisciplina >= 60;
		Boolean notaMinima = (mediaPrimeiraDisciplina + mediaSegundaDisciplina) >= 150;
		Boolean valorTotalNotas = (mediaPrimeiraDisciplina + mediaSegundaDisciplina) == 200 ;
		
		if ((valorTotalNotas && notaMinima) || (notaMinimaPrimeiraDisciplina && notaMinimaSegundaDisciplina)) {
			System.out.println("Aluno(a) Aprovado!");
		} else {
			System.out.println("Aluno(a) Reprovado!");
		}
		
		scanner.close();

	}

}
