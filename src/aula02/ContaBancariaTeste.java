package aula02;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria contaBancaria1 = new ContaBancaria(111, "Jo�o da Silva");

		contaBancaria1.setNomeTitular("");

		System.out.println(contaBancaria1.getNumeroConta());
		System.out.println(contaBancaria1.getNomeTitular());
	}
}
