package aula05.heranca.exemplo;

public class Carro extends Veiculo {

	private int numeroPortas;

	public Carro(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel, int numeroPortas) {

		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.numeroPortas = numeroPortas;
	}

	public void calibrarPneus() {

		System.out.println(this.fabricante + " " + this.modelo + " est� calibrando os pneus.");
	}
}
