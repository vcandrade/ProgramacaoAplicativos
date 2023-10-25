package aula13.layout.cardlayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayoutFrame extends JFrame {

	private JPanel panelCont;
	private JPanel panelFirst;
	private JPanel panelSecond;
	private JButton buttonOne;
	private JButton buttonSecond;
	private CardLayout layout;

	public CardLayoutFrame() {

		panelCont = new JPanel();
		panelFirst = new JPanel();
		panelSecond = new JPanel();
		
		buttonOne = new JButton("Switch to second panel/workspace");
		buttonSecond = new JButton("Switch to first panel/workspace");
		
		this.layout = new CardLayout();
		panelCont.setLayout(layout);

		panelFirst.add(buttonOne);
		panelSecond.add(buttonSecond);
		panelFirst.setBackground(Color.BLUE);
		panelSecond.setBackground(Color.GREEN);

		panelCont.add(panelFirst, "1");
		panelCont.add(panelSecond, "2");
		layout.show(panelCont, "1");
		
		buttonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				layout.show(panelCont, "2");
			}
		});
		
		buttonSecond.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				layout.show(panelCont, "1");
			}
		});
		
		this.add(panelCont);
		this.setTitle("Exemplo de BorderLayout"); // define o título do frame
		this.setSize(600, 400); // define o tamanho do frame
		this.setLocationRelativeTo(null); // define o local que será apresentado
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // define o que ocorrerá com a aplicação ao fechar o frame
		this.pack();
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CardLayoutFrame().setVisible(true);;
			}
		});
	}
}
