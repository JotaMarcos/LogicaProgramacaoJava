package cursologicacapitulo05;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
	
	public static final Double pesoForaCategoria = 50.0;
	public static final Double pesoCategoriaLeve = 60.0;
	public static final Double pesoCategoriaMedio = 90.0;
	public static final Double pesoCategoriaPesado = 100.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso <= pesoCategoriaLeve) && (peso >= pesoForaCategoria);
		Boolean pesoMedio = peso > pesoCategoriaLeve && peso <= pesoCategoriaMedio;
		Boolean pesoPesado = peso > pesoCategoriaMedio;
		
		if (pesoLeve) {
			System.out.println("O lutador(a) é da Categoria Peso Leve!");
		} else if(pesoMedio) {
			System.out.println("O lutador(a) é da Categoria Peso Médio!");			
		} else if(pesoPesado) {
			System.out.println("O lutador(a) é da Categoria Peso Pesado!");
		} else {
			System.out.println("O lutador(a) não se encaixa em categoria alguma.");
		}
		
		scanner.close();
		
	}

}
