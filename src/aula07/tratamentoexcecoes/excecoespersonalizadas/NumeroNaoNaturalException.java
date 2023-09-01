package aula07.tratamentoexcecoes.excecoespersonalizadas;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("Número não natural informado.");
	}
}
