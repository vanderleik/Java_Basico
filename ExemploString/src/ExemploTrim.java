
public class ExemploTrim {

	public static void main(String[] args) {
		String nome = "   Francisco da Silva   ";
		System.out.println(nome.length());
		System.out.println(nome);
		nome = nome.trim();//trim remove os espaços no início e no final, não remove os espaços entre os nomes
		System.out.println(nome.length());
		System.out.println(nome);
	}

}
