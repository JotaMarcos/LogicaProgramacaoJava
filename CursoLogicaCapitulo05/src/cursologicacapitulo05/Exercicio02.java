package cursologicacapitulo05;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento anual da empresa R$ ");
		Double metaFaturamento = scanner.nextDouble();
		
		System.out.print("Digite o faturamento real da empresa no último ano R$ ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.print("Digite a média salarial do funcionário(a) para o ano anterior R$ ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (metaFaturamento * 80) / 100;
		
		Boolean bateuMeta = faturamentoReal >= metaFaturamento;
		
		Boolean faturouPeloMenosOitentaPorCento = faturamentoReal >= oitentaPorCentoDaMeta;
		
		if (bateuMeta) {
			System.out.println("Você vai ganhar um bônus de 100%! Ele será de: R$ " + mediaSalarial);
		} else if(faturouPeloMenosOitentaPorCento){
			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100; // Esse cálculo só precisa ser feito se a meta NÃO tiver sido batida.
			System.out.println("Você vai ganhar um bônus de 80%! Ele será de: R$ " + oitentaPorCentoDaMediaSalarial);
		} else {
			System.out.println("Infelizmente, esse ano não tem bônus!");
		}
		
		
		scanner.close();
	
		}
	
	}
