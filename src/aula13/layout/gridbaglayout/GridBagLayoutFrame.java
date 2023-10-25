package aula13.layout.gridbaglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GridBagLayoutFrame {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("One");
	JButton btn2 = new JButton("Two");
	JButton btn3 = new JButton("Three");

	public GridBagLayoutFrame() {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5); // espaçamento entre componentes

		gbc.gridx = 0; // coluna
		gbc.gridy = 0; // linha
		panel.add(btn1, gbc);

		gbc.gridx = 1; // coluna
		gbc.gridy = 0; // linha
		panel.add(btn2, gbc);
		
		gbc.gridwidth = 2; // quantidade de colunas que irá ocupar
		gbc.gridx = 0; // coluna
		gbc.gridy = 2; // linha
		panel.add(btn3, gbc);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GridBagLayoutFrame();
			}
		});
	}
}
