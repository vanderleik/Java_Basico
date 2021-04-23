package exemploif;

public class ExemploOperadorTernario {

	public static void main(String[] args) {


		byte numero = 1;
		if(numero == 1) {
			System.out.println("Um");
		}else {
			System.out.println("dois");
		}
		
		// Operador ternario
		System.out.println();
		System.out.println("Operador ternário");
		System.out.println(numero == 1 ? "Um" : "Dois");
		
		
		char letra = 'b';
		
		System.out.println(
				letra == 'a' 
				? "Cadastro"
						: "Edição");	
	}
	

}
