
public class ExemploCapitalizacao {

	public static void main(String[] args) {
		String texto = "Curso Java Fundamentos";
		System.out.println(texto.toLowerCase()); // texto em letra minúscula
		System.out.println(texto.toUpperCase()); // texto em letra maiúscula
		System.out.println(texto);
		
		texto = texto.toUpperCase();// altera em definitivo para caixa alta
		
		System.out.println(texto);

	}

}
