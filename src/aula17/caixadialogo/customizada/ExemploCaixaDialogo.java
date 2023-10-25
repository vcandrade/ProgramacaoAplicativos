package aula17.caixadialogo.customizada;

import javax.swing.JOptionPane;

public class ExemploCaixaDialogo {

	public static void main(String[] args) {

		String[] options = { "Op��o 1", "Op��o 2", "Cancelar" };

		int option = JOptionPane.showOptionDialog(null, "Selecione uma op��o", "Caixa de Di�logo Personalizada", 
				                                  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		if (option == 0) {
			
			System.out.println("Op��o 1 selecionada");
		
		} else if (option == 1) {
			
			System.out.println("Op��o 2 selecionada");
		
		} else if (option == 2) {
			
			System.out.println("Opera��o cancelada");
		
		} else {
			
			System.out.println("Nenhuma op��o selecionada");
		}
	}
}
