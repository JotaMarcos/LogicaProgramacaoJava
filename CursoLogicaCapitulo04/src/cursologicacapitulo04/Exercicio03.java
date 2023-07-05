package cursologicacapitulo04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("########.00");
		Scanner scanner = new Scanner(System.in);
		
		Double valorGastoTotal = 0.0;
		
		System.out.print("Digite o valor da Conta de Luz R$ ");
		valorGastoTotal += scanner.nextDouble();
		System.out.print("Digite o valor de Conta de Água R$ ");
		valorGastoTotal += scanner.nextDouble();
		System.out.print("Digite o valor de Conta de Telefone R$ ");
		valorGastoTotal += scanner.nextDouble();
		System.out.print("Digite o valor da Escola do(s) Filho(s) R$ ");
		valorGastoTotal += scanner.nextDouble();
		System.out.print("Digite o valor da Fatura do Cartão R$ ");
		valorGastoTotal += scanner.nextDouble();
		System.out.print("Digite o valor dos Gastos com Supermercado R$ ");
		valorGastoTotal += scanner.nextDouble();
		
		
		System.out.println("Valor Total do Gasto da Família R$ " + df.format(valorGastoTotal));						  
		
		scanner.close();
		
	}

}
