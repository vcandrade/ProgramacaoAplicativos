package aula13.layout.borderlayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame {

	private JButton btnNorte;
	private JButton btnSul;
	private JButton btnLeste;
	private JButton btnOeste;
	private JButton btnCentro;
	private BorderLayout layout;
	
	public BorderLayoutFrame() {
	
		this.layout = new BorderLayout(5, 5); // cria um border layout e define o espa�o de 5 pixels entre os componentes
		this.setLayout(layout); // configura o layout do frame
		
		//cria��o dos componentes
		this.btnNorte = new JButton("Norte");
		this.btnSul = new JButton("Sul");
		this.btnLeste = new JButton("Leste");
		this.btnOeste = new JButton("Oeste");
		this.btnCentro = new JButton("Centro");
		
		// adiciona os componentes ao frame e define a localiza��o
		this.add(btnNorte, BorderLayout.NORTH);
		this.add(btnSul, BorderLayout.SOUTH);
		this.add(btnLeste, BorderLayout.EAST);
		this.add(btnOeste, BorderLayout.WEST);
		this.add(btnCentro, BorderLayout.CENTER);
		
		this.setTitle("Exemplo de BorderLayout"); // define o t�tulo do frame
		this.setSize(600, 400); // define o tamanho do frame
		this.setLocationRelativeTo(null); // define o local que ser� apresentado
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // define o que ocorrer� com a aplica��o ao fechar o frame
	}
}
