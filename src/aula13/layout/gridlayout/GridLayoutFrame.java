package aula13.layout.gridlayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame {

	private JButton btnBotao1;
	private JButton btnBotao2;
	private JButton btnBotao3;
	private JButton btnBotao4;
	private JButton btnBotao5;
	private JButton btnBotao6;
	private GridLayout layout;
	
	public GridLayoutFrame() {
	
		this.layout = new GridLayout(2, 3, 10, 10);
		this.setLayout(layout);
		
		this.btnBotao1 = new JButton("Bot�o 1");
		this.btnBotao2 = new JButton("Bot�o 2");
		this.btnBotao3 = new JButton("Bot�o 3");
		this.btnBotao4 = new JButton("Bot�o 4");
		this.btnBotao5 = new JButton("Bot�o 5");
		this.btnBotao6 = new JButton("Bot�o 6");
		
		this.add(btnBotao1);
		this.add(btnBotao2);
		this.add(btnBotao3);
		this.add(btnBotao4);
		this.add(btnBotao5);
		this.add(btnBotao6);
		
		this.setTitle("Exemplo de GridLayout");
		this.setSize(600, 400); // define o tamanho do frame
		this.setLocationRelativeTo(null); // define o local que ser� apresentado
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // define o que ocorrer� com a aplica��o ao fechar o frame
	}
}
