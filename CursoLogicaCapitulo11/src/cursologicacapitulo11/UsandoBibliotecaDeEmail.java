package cursologicacapitulo11;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
//		Carteiro.enviar("jmarcos_duarte@hotmail.com", 
//						"Teste de validação de e-mail", 
//						"Você é aquilo que faz constantemente..." 
//						);
//		
//		System.out.println("E-mail enviado com sucesso!");
		
Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		
		while(true) {
			System.out.print("Tarefa " +  i + ": ");
			tarefa = scanner.nextLine();
			
			if("x".equals(tarefa)) {
				break;
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		String tarefas = "";
		
		for (int j = 0; j < linhas.size(); j++) {
			tarefa += linhas.get(j) + "\n"; 
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;
		
		//System.out.print("Digite o seu e-mail: ");
		String para = "jmarcos_duarte@hotmail.com";
		
		
		String assunto = "Sua lista de tarefas";
		
		Carteiro.enviar(para, assunto, mensagem);
		
		System.out.println("E-mail enviado com sucesso!");
		
		scanner.close();
		

	}	
	

}
