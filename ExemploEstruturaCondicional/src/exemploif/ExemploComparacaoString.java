package exemploif;

public class ExemploComparacaoString {
	
	public static void main(String[] args) {
		
		String nome = new String("Olá");
		String texto = new String ("olá");
		
		if(nome.equals(texto)) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
	
		
		if (nome.equalsIgnoreCase(texto)) {
			System.out.println("igual ignorando a caixa alta");
		}else {
			System.out.println("Diferente");
		}
	}

}
