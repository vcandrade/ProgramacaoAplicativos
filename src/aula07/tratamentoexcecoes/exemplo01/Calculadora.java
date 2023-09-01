package aula07.tratamentoexcecoes.exemplo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {
		
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.println("Informe o valor do numerador:");
			int numerador = input.nextInt();
			
			System.out.println("Informe o valor do denominador:");
			int denominador = input.nextInt();
			
			int resultado = numerador / denominador;
			
			System.out.println("Resultado: " + resultado);
		
		} catch (ArithmeticException ae) {
			
			System.out.println("N�o � poss�vel dividir por 0.");
		
		} catch (InputMismatchException ime) {
			
			System.out.println("Entrada de dados inv�lida.");
			
		} catch (Exception e) {
			
			System.out.println("Ocorreu uma exce��o.");
		
		} finally {
			
			input.close();
		}
	}
}
