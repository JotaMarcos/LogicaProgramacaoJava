package cursologicacapitulo03;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------------");
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		System.out.println("-------------------------------------------------------------");
		System.out.print("Digite o tipo do pagamento [1 - à vista / 2 - a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		System.out.println("-------------------------------------------------------------");
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			juros = 10.0;
			System.out.println("O pagamento será a prazo!");
			System.out.println("-------------------------------------------------------------");
			
		} else {
			System.out.println("O pagamento será à vista!");				
			System.out.println("-------------------------------------------------------------");
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("O valor total: " + valorTotal);
		
		scanner.close();
		System.out.println("-------------------------------------------------------------");
	}

}
