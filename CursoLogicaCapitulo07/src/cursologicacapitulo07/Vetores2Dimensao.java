package cursologicacapitulo07;

public class Vetores2Dimensao {

	public static void main(String[] args) {
		
//		Double faturamentoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1000.0, 2500.0, 1800.0};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
//		System.out.println("Faturamento do dia 1º de Janeiro: R$ " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 3 de Fevereiro: R$ " + faturamentoAnual[1][2]);
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			System.out.println("------------------------------------------");
//			Double[] mes = faturamentoAnual[i];
			
			for (int j = 0; j < faturamentoAnual[i].length; j++) {
//				Double dia = mes[j];
				Double dia = faturamentoAnual[i][j];
				System.out.println("Dia: " + (j + 1) + ": " + dia);
			}
			System.out.println("------------------------------------------");
		}		
		
	}

}
