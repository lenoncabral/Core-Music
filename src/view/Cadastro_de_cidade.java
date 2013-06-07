package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cadastro_de_cidade {

	private JFrame frmCidade;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_de_cidade window = new Cadastro_de_cidade();
					window.frmCidade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro_de_cidade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCidade = new JFrame();
		frmCidade.setTitle("Cidade");
		frmCidade.setBounds(100, 100, 450, 188);
		frmCidade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCidade.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo");
		label.setBounds(10, 14, 46, 14);
		frmCidade.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 11, 86, 20);
		frmCidade.getContentPane().add(textField);
		
		JButton button = new JButton("<<");
		button.setBounds(242, 5, 49, 23);
		frmCidade.getContentPane().add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(289, 5, 44, 23);
		frmCidade.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(332, 5, 44, 23);
		frmCidade.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(375, 5, 49, 23);
		frmCidade.getContentPane().add(button_3);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 39, 46, 14);
		frmCidade.getContentPane().add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 59, 355, 20);
		frmCidade.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(375, 39, 46, 14);
		frmCidade.getContentPane().add(lblUf);
		
		textField_2 = new JTextField();
		textField_2.setBounds(375, 59, 33, 20);
		frmCidade.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton button_4 = new JButton("Novo");
		button_4.setBounds(22, 110, 89, 23);
		frmCidade.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Gravar");
		button_5.setBounds(121, 110, 89, 23);
		frmCidade.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Cancelar");
		button_6.setBounds(220, 110, 89, 23);
		frmCidade.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("Buscar");
		button_7.setBounds(319, 110, 89, 23);
		frmCidade.getContentPane().add(button_7);
	}

}
