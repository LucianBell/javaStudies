package sintaxeVariaveisFluxo;

public class testaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condi");

		int idade = 22;
		int quantidadeDePessoas = 1;

		if (idade <= 18) {
			System.out.println("OMG, YOUR SO YOUNG");
			System.out.println("You can't get in man :/");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("You got a responsible with you? Okay, come in then :D");
			} else {
				System.out.println("Getting old, hum?");
				System.out.println("You can come in, welcome man :D");
			}
		}
	}

}
