package cursologicacapitulo05;

import java.util.Scanner;

public class EstruturaIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();
		System.out.print("Digite o valor do empréstimo R$ ");
		Double emprestimo = scanner.nextDouble();
		System.out.print("Digite o valor da movimentação média R$ ");
		Double movimentacaoMedia = scanner.nextDouble();
		
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) > emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
        
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode liberar empréstimo ao cliente " + nomeCliente + "!");
		} else {
			System.out.println("Não pode liberar empréstimo ao cliente " + nomeCliente + "!");
		}
		
		
		
		scanner.close();
		

	}

}
