package bibliotecapropria;

import workconsole.InteracaoConsole;

public class BibliotecaPropria {

	public static void main(String[] args) {
		
		InteracaoConsole interacao = new InteracaoConsole();
		
		Integer numero = interacao.lerNumero("Digite um número: ");
		interacao.imprimir("Número: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um número decimal: ");
		interacao.imprimir("Decimal: " + decimal);
		
		
		interacao.imprimirErro("Essa é uma mensagem de erro!");
		
		interacao.fechar();
		
	}

}
