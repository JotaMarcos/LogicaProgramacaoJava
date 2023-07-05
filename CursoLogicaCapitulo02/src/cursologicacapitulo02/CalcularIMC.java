package cursologicacapitulo02;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso em kg: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a sua altura em metros: ");
		Double altura = scanner.nextDouble();
		
		Double multiplicaAltura = (altura * altura);
		
		Double imc = peso / multiplicaAltura;
		
		System.out.println("O seu IMC é de: " + imc);

	}

}
