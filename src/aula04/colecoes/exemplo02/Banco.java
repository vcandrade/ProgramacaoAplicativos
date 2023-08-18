package aula04.colecoes.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nome;
	private List<ContaBancaria> contas;

	public Banco(int cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.contas = new ArrayList<ContaBancaria>();
	}

	public void criarNovasContas(int numeroConta, String nomeTitular) {

		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		this.contas.add(contaBancaria);

		System.out.println("Conta cadastrada com sucesso.");
	}
	
	public void remover(String nomeTitular) {
		
		for (ContaBancaria contaBancaria : contas) {
			
			if(contaBancaria.getNomeTitular().equals(nomeTitular)) {
				
				contas.remove(contaBancaria);
				return;
			}
		}
	}

	public void realizarDeposito(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.depositar(valor);
				return;
			}
		}
		System.out.println("Conta inexistente.");
	}

	public void realizarSaque(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.sacar(valor);
				return;
			}
		}
		System.out.println("Conta inexistente.");
	}

	public void imprimirContas(int numeroConta) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.imprimirSaldo();
				return;
			}
		}
	}
}
