
public class OperacoesAritmeticas {
	
	public static void main(String[] args) {
		
		int numero1 = 100;
		int numero2 = 200;
		

		// Soma
		int soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		
		// Subtra��o
		int subtracao = numero1 - numero2;
		System.out.println("Subtra��o: " + subtracao);
		
		// multiplica��o
		int multiplicacao = numero1 * numero2;
		System.out.println("Multiplica��o: "+ multiplicacao);
		
		// Divis�o
		
		double divisao = (double) numero1 / numero2;// cast
		System.out.println("Divis�o: " + divisao);
		
		//Resto da divisao
		int restoDivisao = numero1 % 2; // se o n�mero � par retorna 0
		int restoDivisao1 = 23 % 2;// se o n�mero � �mpar retorna 1
		
		System.out.println("Resto da divis�o: " + restoDivisao);
		System.out.println("Resto da divis�o 1: " + restoDivisao1);
				
				
	}

}
