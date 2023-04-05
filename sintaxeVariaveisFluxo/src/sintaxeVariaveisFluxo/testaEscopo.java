package sintaxeVariaveisFluxo;

public class testaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;

		// Fazendo isso, você declara a variável em um escopo que permite
		// ela ser usada nas condicionais abaixo
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			// acompanhado ainda não existe nessa linha

			acompanhado = true;
			// aqui ela já existe
		} else // Aqui ela já morreu
		{
			// aqui é outro escopo, então acompanhado ñ existe
			acompanhado = false;
			// aqui ela já existe
		} // aqui ela morreu dnv

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Welcome man :D");
		} else {
			System.out.println("Sorry man :/ you can't come in");
		}
	}
}