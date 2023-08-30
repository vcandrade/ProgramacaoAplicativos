package aula05.heranca.exercicio;

public class PessoaTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("João da Silva", 20, "BCC", "Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		aluno1.imprimirDados();

		Professor professor1 = new Professor("Maria de Oliveira", 35, 5000.00, "Balduíno Taques", 2048, "Centro",
				"Ponta Grossa", "PR");
		professor1.imprimirDados();

		Endereco end = new Endereco("Monteiro Lobato", 512, "Jd. Carvalho", "Ponta Grossa", "PR");
		Aluno aluno2 = new Aluno("Ricardo", 21, "ADS", end);
		aluno2.imprimirDados();
	}
}
