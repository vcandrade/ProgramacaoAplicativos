package aula04.colecoes.exemplo01;

import java.util.ArrayList;
import java.util.List;

import aula01.Carro;

public class ExemploCollections {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Onix", "Chevrolet", 2020, "ABC-1234", "Preto");
		Carro carro2 = new Carro("Gol", "Volkswagen", 2015, "MNO-9876", "Branco");
		Carro carro3 = new Carro("Fiesta", "Ford", 2013, "XYZ-9876", "Prata");
		
		List<Carro> lista = new ArrayList<Carro>();
		
		lista.add(carro1);
		lista.add(carro2);
		lista.add(carro3);
		
		for(int i = 0; i < lista.size(); i++) {
			
			Carro carro = lista.get(i);
			System.out.println(carro.getPlaca());
		}
		
		for(Carro carro : lista) {
			
			System.out.println(carro.getPlaca());
		}
	}
}








