
public class ExemploIncrementar {

	public static void main(String[] args) {
		// 
		
		int quantidadeProduto = 0;
		quantidadeProduto += 1;
		
		quantidadeProduto++;
		
		System.out.println("Quantidade de produto: " + quantidadeProduto);
		

		double valorProduto1 = 10.75;
		double soma = valorProduto1;
		
		double valorProduto2 = 22.98;
		
		soma = soma + valorProduto2;
		
		double valorProduto3 = 24.98;
		soma += valorProduto3;
		System.out.println();
		System.out.println("Soma: " + soma);
	}

}
