package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Cadastro_de_usuario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_de_usuario window = new Cadastro_de_usuario();
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
	public Cadastro_de_usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(64, 14, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 17, 44, 14);
		frame.getContentPane().add(lblCdigo);
		
		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(197, 11, 49, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(244, 11, 44, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(">>");
		button_2.setBounds(330, 11, 49, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(">");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(287, 11, 44, 23);
		frame.getContentPane().add(button_3);
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de usu\u00E1rio:");
		lblNomeDeUsurio.setBounds(10, 65, 140, 14);
		frame.getContentPane().add(lblNomeDeUsurio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 87, 310, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(242, 192, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 115, 140, 14);
		frame.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 140, 310, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(44, 192, 89, 23);
		frame.getContentPane().add(btnNovo);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(143, 192, 89, 23);
		frame.getContentPane().add(btnGravar);
	}
}
