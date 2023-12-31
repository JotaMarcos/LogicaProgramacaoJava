package workconsole;

import java.util.Scanner;

public class InteracaoConsole {
	
	Scanner scanner = new Scanner(System.in);
	
	
	public Integer lerNumero(String texto) {
		System.out.print(texto);
		return scanner.nextInt();
	}
	
	public Double lerDecimal(String texto) {
		System.out.print(texto);
		return scanner.nextDouble();
		
	}
	
	public String lerLinha(String texto) {
		System.out.print(texto);
		return scanner.nextLine();
	}
	
	public void fechar() {
		scanner.close();
	}
	
	public void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirLinha(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirErro(String texto) {
		System.err.println(texto);
	}
	
}
