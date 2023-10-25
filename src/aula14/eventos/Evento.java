package aula14.eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Evento extends JFrame {

	private JLabel lblDigite;
	private JLabel lblResultado;
	private JTextField txtTexto;
	private JButton btnCapturar;
	private FlowLayout layout;

	public Evento() {

		this.initComponents();
	}

	private void initComponents() {

		this.layout = new FlowLayout(FlowLayout.CENTER, 5, 20);
		this.setLayout(layout);

		this.lblDigite = new JLabel("Digite");
		this.lblResultado = new JLabel("<O texto aparecerá aqui>");
		this.txtTexto = new JTextField("Digite aqui o texto...");
		this.txtTexto.setColumns(25);
		this.txtTexto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				txtTextofocusGained();
			}
		});		
		
		this.btnCapturar = new JButton("Capturar");
		this.btnCapturar.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				btnCapturarActionPerfomed();
			}
		});

		this.add(lblDigite);
		this.add(txtTexto);
		this.add(btnCapturar);
		this.add(lblResultado);

		this.setTitle("Exemplo de Eventos");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void txtTextofocusGained() {

		System.out.println("Ganho de foco.");
	}
	
	private void btnCapturarActionPerfomed() {

		System.out.println("Botão Pressionado.");
	}
}
