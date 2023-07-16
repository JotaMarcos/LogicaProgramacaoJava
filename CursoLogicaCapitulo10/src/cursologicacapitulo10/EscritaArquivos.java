package cursologicacapitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
//		linhas.add("Linha um");
//		linhas.add("Você é aquilo que faz constantemente...");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador: " + i + ": ");
			String nome = scanner.nextLine();
			
			linhas.add(nome);
		}
		
		
		
		Path arquivo1 = Paths.get("C:/desenvolvimento/Estudo/arquivos/meu-arquivo.txt");
		Path arquivo2 = Paths.get("C:/desenvolvimento/Estudo/arquivos/meu-arquivo.doc");
		Path arquivo3 = Paths.get("C:/desenvolvimento/Estudo/arquivos/meu-arquivo.xls");
		Path arquivo4 = Paths.get("C:/desenvolvimento/Estudo/arquivos/meu-arquivo.pdf");
		
		Files.write(arquivo1, linhas);
		Files.write(arquivo2, linhas);
		Files.write(arquivo3, linhas);
		Files.write(arquivo4, linhas);
		
		scanner.close();
		System.out.println("Fim...!");

				
		
		
	}

}
