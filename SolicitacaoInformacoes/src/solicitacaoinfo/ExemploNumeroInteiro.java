package solicitacaoinfo;

import java.util.Scanner;

public class ExemploNumeroInteiro {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		byte idade = Byte.parseByte(teclado.nextLine());
		
		System.out.print("Digite o n�mero 1: ");
		short numero1 = Short.parseShort(teclado.nextLine());
		
		System.out.print("Digite o n�mero 2: ");
		int numero2 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Digite o n�mero 3: ");
		long numero3 = Long.parseLong(teclado.nextLine());
		
		System.out.println(
				    "Idade: " +idade
				+ "\nN�mero 1: " + numero1
				+ "\nNumero 2: " + numero2
				+ "\nNumero 3: " + numero3);
		
		long somatorio = idade + numero1 + numero2 + numero3;
		
		System.out.println("Total: " + somatorio);
		teclado.close();
	}

}
