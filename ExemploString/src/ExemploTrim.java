
public class ExemploTrim {

	public static void main(String[] args) {
		String nome = "   Francisco da Silva   ";
		System.out.println(nome.length());
		System.out.println(nome);
		nome = nome.trim();//trim remove os espa�os no in�cio e no final, n�o remove os espa�os entre os nomes
		System.out.println(nome.length());
		System.out.println(nome);
	}

}
