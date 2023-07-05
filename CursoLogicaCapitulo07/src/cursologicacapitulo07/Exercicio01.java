package cursologicacapitulo07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] tarefasDiarias = new String[5];
		System.out.println("===============================================================");
		for(int i = 0; i < tarefasDiarias.length; i++) {
			System.out.print("Tarefa: " + i + ": ");
			tarefasDiarias[i] = scanner.nextLine();
		}
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefasDiarias.length; i++) {
			System.out.println(i + ": " + tarefasDiarias[i]);
		}
			
		System.out.println("===============================================================");
		scanner.close();
		
	}

}
