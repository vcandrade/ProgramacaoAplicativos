package aula07.tratamentoexcecoes.excecoespersonalizadas;

public class ExemploException {

	public static void main(String[] args) {

		try {
		
			Calculadora calc = new Calculadora();
			calc.calcularRaizQuadrada(81);
			
		} catch(NumeroNaoNaturalException nnne) {
			
			System.out.println(nnne.getMessage());
		}
	}
}
