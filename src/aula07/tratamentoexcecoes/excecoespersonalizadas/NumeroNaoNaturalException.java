package aula07.tratamentoexcecoes.excecoespersonalizadas;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("N�mero n�o natural informado.");
	}
}
