package aula03.exemplo02;

public class Funcionario {

	private int registro;
	private String nome;
	private DiaSemana folga;
	
	public Funcionario(int registro, String nome, DiaSemana folga) {
		
		this.registro = registro;
		this.nome = nome;
		this.folga = folga;
	}
	
	public void imprimirDados() {
		
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Dia de Folga: " + this.folga.getDia());
	}
}










