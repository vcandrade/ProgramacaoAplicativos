package aula05.heranca.exercicio;

public class Professor extends Pessoa {

	private double salario;

	public Professor(String nome, int idade, double salario, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {

		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.salario = salario;
	}

	public void calcularSalario() {

		System.out.println(this.nome + ". Salário: R$" + this.salario);
	}

	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Salário: R$" + this.salario);
	}
}
