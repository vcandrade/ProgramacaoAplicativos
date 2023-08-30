package aula02.encapsulamentodados;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Dep�sito realizado com sucesso.");

		this.calcularRendimento();
	}

	public void imprimirSaldo() {

		System.out.println("N�mero da Conta: " + this.numeroConta);
		System.out.println("Nome do titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
	}

	private void calcularRendimento() {

		this.saldo *= 1.10;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {

		if (!nomeTitular.equals("")) {

			this.nomeTitular = nomeTitular;
		}
	}
}
