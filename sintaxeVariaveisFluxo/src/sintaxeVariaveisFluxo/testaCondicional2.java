package sintaxeVariaveisFluxo;

public class testaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Welcome man :D");
		} else {
			System.out.println("Sorry man :/ you can't come in");
		}

	}
}
