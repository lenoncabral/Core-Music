package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cadastro_de_estado {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_de_estado window = new Cadastro_de_estado();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro_de_estado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo");
		label.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 11, 86, 20);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("<<");
		button.setBounds(242, 5, 49, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(289, 5, 44, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(332, 5, 44, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(375, 5, 49, 23);
		frame.getContentPane().add(button_3);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 50, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 71, 235, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pa\u00EDs");
		lblNewLabel.setBounds(311, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(311, 71, 113, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(255, 71, 46, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSigl = new JLabel("Sigla");
		lblSigl.setBounds(255, 50, 46, 14);
		frame.getContentPane().add(lblSigl);
		
		JButton button_4 = new JButton("Novo");
		button_4.setBounds(20, 111, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Gravar");
		button_5.setBounds(119, 111, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Cancelar");
		button_6.setBounds(218, 111, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("Buscar");
		button_7.setBounds(317, 111, 89, 23);
		frame.getContentPane().add(button_7);
	}

}
