package aula07.tratamentoexcecoes.excecoespersonalizadas;

public class Calculadora {

	public void calcularRaizQuadrada(int valor) throws NumeroNaoNaturalException {

		if (valor < 0) {

			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(valor);

		System.out.println(resultado);
	}
}
