package cursologicacapitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:/desenvolvimento/Estudo/arquivos/meu-arquivo.txt");
		
		List<String> linhas =  Files.readAllLines(arquivo);
		
		System.out.println("================ Lista de Jogadores ================");
		for (int i = 0; i < linhas.size(); i++) {
			String nomeDoJogador = linhas.get(i);
			
			System.out.println("Jogador " + i + ": " + nomeDoJogador);
		}		
		System.out.println("====================================================");
		
	}

}
