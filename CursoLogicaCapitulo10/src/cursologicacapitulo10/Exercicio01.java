package cursologicacapitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while(true) {
			System.out.print("Digite a tarefa " +  i + ": ");
			tarefa = scanner.nextLine();
			
			if("x".equals(tarefa)) {
				break;
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		
		escreverNoArquivo("C:/desenvolvimento/Estudo/arquivos/meu-aquivo.txt", linhas);
		
		scanner.close();
		
		System.out.println("Fim...!");
	}
	
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path parth = Paths.get(arquivo);
		Files.write(parth, linhas);
	}

}
