package aula01;

public class Carro {

	// atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;

	// m�todo construtor da classe Carro
	public Carro(String modelo, String marca, int ano, String placa, String cor) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}

	// m�todos da classe Carro
	public void ligar() {

	}

	public void desligar() {

	}

	public void acelerar() {

	}

	public void frear() {

	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
