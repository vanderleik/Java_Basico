package exemplowhile;

public class Exemplo01 {

	public static void main(String[] args) {

		int quantidadeDeLouca = 10;
		
		while(quantidadeDeLouca > 0) {
			System.out.println("Lavando a louça " + quantidadeDeLouca);
			quantidadeDeLouca = quantidadeDeLouca -1;
		}
		System.out.println("Acabei a louça, ufa!!!");

	}

}
