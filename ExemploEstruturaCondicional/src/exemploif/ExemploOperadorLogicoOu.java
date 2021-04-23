package exemploif;

public class ExemploOperadorLogicoOu {

	public static void main(String[] args) {

		double nota = 6.59;
		boolean aprovadoExame = false;
		
		// V ou V => V
		// V ou F => V
		// F ou V => V
		// F ou F => F
		if((nota >=7.0) || (aprovadoExame == true)) {
			System.out.println("Você está aprovado");
		}else {
			System.out.println("Reprovado");
		}

	}

}
