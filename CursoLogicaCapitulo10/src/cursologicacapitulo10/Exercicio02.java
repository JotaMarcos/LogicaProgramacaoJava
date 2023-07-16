package cursologicacapitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {
		List<String> linhas = lerArquivo("C:/desenvolvimento/Estudo/arquivos/meu-aquivo.txt");
		
		System.out.println("==================== LISTA DE TAREFAS DO DIA ====================");
		
		for (int i = 0; i < linhas.size(); i++) {
			String tarefa = linhas.get(i);
			
			System.out.println("Tarefa " + i + ": "  + tarefa);
		}
		
		System.out.println("=================================================================");
	}
	
	static List<String> lerArquivo(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);	
	}

}
