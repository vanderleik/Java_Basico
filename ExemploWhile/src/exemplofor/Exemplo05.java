package exemplofor;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Número parada: ");
		int numeroParada = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i <= 10000; i++) {
			if(i == 10) {
				continue;// ele ignora o número 10 e continua a partir do 11
			}
			System.out.println(i);
			
			if(i == numeroParada) {
				break;
			}
		}

	teclado.close();
	}
}
