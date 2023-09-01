package aula07.tratamentoexcecoes.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {
		
			Calculadora calc = new Calculadora();
			calc.dividir();

		} catch (ArithmeticException ae) {

			System.out.println("Não é possível dividir por 0.");

		} catch (InputMismatchException ime) {

			System.out.println("Entrada de dados inválida.");

		} catch (Exception e) {

			System.out.println("Ocorreu uma exceção.");
		}
	}
}
