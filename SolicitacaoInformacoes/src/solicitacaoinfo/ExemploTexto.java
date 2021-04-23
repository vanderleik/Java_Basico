package solicitacaoinfo;

import java.util.Scanner;

public class ExemploTexto {

	public static void main(String[] args) {
	
		System.out.print("Digite seu nome: ");
		
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		System.out.println("Nome: " + nome);
		
		scanner.close();
		
	}

}
