package aula05.heranca.exercicio;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected Endereco end;

	public Pessoa(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {

		this.nome = nome;
		this.idade = idade;
		this.end = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}

	public Pessoa(String nome, int idade, Endereco end) {

		this.nome = nome;
		this.idade = idade;
		this.end = end;
	}

	public void imprimirDados() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Logradouro: " + this.end.getLogradouro());
		System.out.println("Número: " + this.end.getNumero());
		System.out.println("Bairro: " + this.end.getBairro());
		System.out.println("Cidade: " + this.end.getCidade());
		System.out.println("UF: " + this.end.getUnidadeFederativa());
	}
}
