package aula05.heranca.exercicio;

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String nome, int idade, String curso, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {

		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.curso = curso;
	}

	public Aluno(String nome, int idade, String curso, Endereco end) {

		super(nome, idade, end);
		this.curso = curso;
	}

	public void realizarMatribula() {

		System.out.println(this.nome + " está matriculado no curso " + this.curso);
	}

	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Curso: " + this.curso);
	}
}
