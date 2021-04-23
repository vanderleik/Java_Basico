package exemploif;

public class ExemploOperadoresRelacionais {

	public static void main(String[] args) {
		
		// Operadores relacionais
		// == igual
		// > maior
		// >= maior igual
		// < menor
		// <= menor igual
		// != diferente (negação de igualdade) [não é igual]
		
		byte idade = 21;
		if(idade >= 18) {
			System.out.println("Adulto");
		}else {
			System.out.println("Menor de idade");
		}
		
		char sexo = 'f';
		
		if (sexo == 'f') {
			System.out.println("Feminino");
		}else {
			System.out.println("Masculino");
		}
		
		if(sexo != 'f') {
			System.out.println("Masculino");
		}else {
			System.out.println("Feminino");
		}
	}

}
