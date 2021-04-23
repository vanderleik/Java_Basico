
public class OperacoesAritmeticas {
	
	public static void main(String[] args) {
		
		int numero1 = 100;
		int numero2 = 200;
		

		// Soma
		int soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		
		// Subtração
		int subtracao = numero1 - numero2;
		System.out.println("Subtração: " + subtracao);
		
		// multiplicação
		int multiplicacao = numero1 * numero2;
		System.out.println("Multiplicação: "+ multiplicacao);
		
		// Divisão
		
		double divisao = (double) numero1 / numero2;// cast
		System.out.println("Divisão: " + divisao);
		
		//Resto da divisao
		int restoDivisao = numero1 % 2; // se o número é par retorna 0
		int restoDivisao1 = 23 % 2;// se o número é ímpar retorna 1
		
		System.out.println("Resto da divisão: " + restoDivisao);
		System.out.println("Resto da divisão 1: " + restoDivisao1);
				
				
	}

}
