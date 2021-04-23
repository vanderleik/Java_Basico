package solicitacaoinfo;

import java.util.Scanner;

public class ExemploCaracter {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu sexo: ");
		
		char sexo = teclado.nextLine().charAt(0);
		
		System.out.println("Sexo digitado: " + sexo);
		
		teclado.close();

	}

}
