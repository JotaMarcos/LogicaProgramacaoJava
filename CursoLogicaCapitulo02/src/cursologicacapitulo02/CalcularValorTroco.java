package cursologicacapitulo02;
import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto (R$): ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor passado pelo cliente (R$): ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		
		System.out.println("O seu troco é no valor de  (R$): " +  resultado);
		
		
		scanner.close();
	}

}
