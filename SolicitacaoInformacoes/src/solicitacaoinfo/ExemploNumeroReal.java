package solicitacaoinfo;

import java.util.Scanner;

public class ExemploNumeroReal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		float peso = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Digite sua altura: ");
		double altura = Double.parseDouble(teclado.nextLine());
		
		
		System.out.println("Peso: " + peso +
						 "\nAltura: " + altura);
		
		teclado.close();
	}

}
