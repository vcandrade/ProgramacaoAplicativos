package aula06.sobreposicao;

public class Cachorro extends Mamifero {
	
	private String porte;

	public Cachorro(String nome, String raca, String porte) {
		
		super(nome, raca);
		this.porte = porte;
	}

	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " latiu");
	}
	
	public void brincar() {
		
		System.out.println(this.nome + " brincando.");
	}
}
