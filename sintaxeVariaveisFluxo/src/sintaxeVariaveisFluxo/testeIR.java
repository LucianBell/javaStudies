package sintaxeVariaveisFluxo;

public class testeIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Sua alíquota é de 7.5% e você pode deduzir R$142");
		} else if (salario >= 2801.0 && salario <= 3751) {
			System.out.println("Sua alíquota é de 15% e você pode deduzir R$350");
		} else {
			System.out.println("Sua alíquota é de 22.5% e você pode deduzir R$636");
		}
	}
}
