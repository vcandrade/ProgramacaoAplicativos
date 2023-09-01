package aula07.tratamentoexcecoes.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {
		
			Calculadora calc = new Calculadora();
			calc.dividir();

		} catch (ArithmeticException ae) {

			System.out.println("N�o � poss�vel dividir por 0.");

		} catch (InputMismatchException ime) {

			System.out.println("Entrada de dados inv�lida.");

		} catch (Exception e) {

			System.out.println("Ocorreu uma exce��o.");
		}
	}
}
