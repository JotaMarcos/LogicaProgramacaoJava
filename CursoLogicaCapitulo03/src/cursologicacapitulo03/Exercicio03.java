package cursologicacapitulo03;

import java.util.Scanner;

public class Exercicio03 {
	
	static final Double NOTA_DE_APROVACAO = 70.0;

	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = scanner.nextLine();
		System.out.println("-------------------------------------------------------------");
		System.out.print("Digite a nota do aluno: ");
		Double notaAluno = scanner.nextDouble();
		Boolean situacaoNota = notaAluno > NOTA_DE_APROVACAO;
		System.out.println("-------------------------------------------------------------");
		Boolean aprovadoAluno = situacaoNota;
		
		if(aprovadoAluno) {
			System.out.println("O(A) aluno(a): " + nomeAluno + " foi Aprovado!");	
		} else {
			System.out.println("O(A) aluno(a): " + nomeAluno + " foi Reprovado!");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		
		scanner.close();	
	}

}
