
public class ExemploDecrementar {

	public static void main(String[] args) {
		
		int quantidadeProdutos = 3;
		
		String nomeProduto1 = "Xbox One X";
		double valorProduto1 = 3500.00;
		double valorTotal = valorProduto1;
		
		quantidadeProdutos --;
		
		String nomeProduto2 = "Jogo Favorit0";
		double valorProduto2 = 215.75;
		
		valorTotal = valorProduto1 + valorProduto2;
		quantidadeProdutos -= 1;
		
		System.out.println("Quantidade de produtos: " + quantidadeProdutos);
		System.out.println("Valor total: " + valorTotal);

	}

}
