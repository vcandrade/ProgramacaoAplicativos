package aula04.colecoes.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		Banco banco = new Banco(987654, "New Bank");

		banco.criarNovasContas(111, "João da Silva");
		banco.criarNovasContas(222, "Maria de Oliveira");
		banco.criarNovasContas(333, "Ricardo Carvalho");

		banco.realizarDeposito(222, 150.00);
		banco.realizarSaque(222, 100.00);

		banco.imprimirContas(222);
	}
}
