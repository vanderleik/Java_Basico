package exemplodowhile;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean cadastrar;
		do {
			System.out.print("Nome do produto: ");
			String nomeProduto = teclado.nextLine();
			
			System.out.print("Preço do produto: ");
			double precoProduto = Double.parseDouble(teclado.nextLine());
			
			System.out.print("Deseja cadastrar mais produtos? ");
			
			cadastrar = Boolean.parseBoolean(teclado.nextLine());
			
		}while(cadastrar == true);
			
		teclado.close();
	}

}
