package solicitacaoinfo;

import java.util.Scanner;

public class ExemploLogico {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Possui cachorro: "+
		"\nTrue -> sim"+
				"\nFalse -> não");
		boolean possuiCachorro = Boolean.parseBoolean(teclado.nextLine());
		
		if(possuiCachorro == true) {
			System.out.println("Possui cachorro");
		}else {
			System.out.println("Não possui cachorro");
		}
		
			
		teclado.close();

	}

}
