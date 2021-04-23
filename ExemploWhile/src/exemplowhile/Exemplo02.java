package exemplowhile;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		String possuiAluno = "Sim";
		Scanner teclado = new Scanner(System.in);
		
		int quantidade = 0;
		while (possuiAluno.equals("Sim")){
			
			System.out.print("Nome: ");
			String nome = teclado.nextLine();
			
			System.out.print("Idade: ");
			Byte idade = Byte.parseByte(teclado.nextLine());
			
			System.out.println("Possui aluno? Sim ou Não");
			possuiAluno = teclado.nextLine();
			
			quantidade++;
			System.out.println();
			System.out.println("Quantidade: " + quantidade);
			System.out.println();
		}

	teclado.close();
	}

}
