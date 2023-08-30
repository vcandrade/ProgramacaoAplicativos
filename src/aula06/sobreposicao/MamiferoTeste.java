package aula06.sobreposicao;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Mamifero mamifero = null;

		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		System.out.print("Opção: ");
		int opcao = input.nextInt();

		switch (opcao) {
		case 1:
			mamifero = new Gato("Nome Gato", "Persa");
			break;
		case 2:
			mamifero = new Cachorro("Rex", "Fila", "Grande");
			break;
		case 3:
			mamifero = new Cavalo("Ponei", "Avelin");
			break;
		}
		
		mamifero.emitirSom();
		
		if(mamifero instanceof Cachorro) {
			
			((Cachorro) mamifero).brincar();
		
		} else if(mamifero instanceof Gato) {
			
			
		}
		
	}
}











