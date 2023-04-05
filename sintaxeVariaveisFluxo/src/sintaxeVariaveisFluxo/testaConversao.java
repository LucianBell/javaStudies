package sintaxeVariaveisFluxo;

public class testaConversao {

	public static void main(String[] args) {
		double salario = 1270.5;
		int valor = (int) salario;
		//Casting: adaptar uma variável de um determinado tipo p/ outro,
		//usado principalmente quando ñ se consegue fazer automaticamente
		
		System.out.println(valor);
		
		long numeroGrande = 32323232l;
		short valorPequeno = 2131;
		byte b = 127;
		
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		System.out.println(valor1 + valor2);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	}
	
}
