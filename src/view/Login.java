package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import javax.swing.JSplitPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;

public class Login {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=51,9
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(69, 130, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCancelar.setBounds(331, 130, 89, 23);
		panel.add(btnCancelar);
		
		JLabel lblLogin = new JLabel("Senha");
		lblLogin.setBounds(69, 89, 46, 14);
		panel.add(lblLogin);
		
		JLabel lblLogin_1 = new JLabel("Usu\u00E1rio");
		lblLogin_1.setBounds(69, 42, 46, 14);
		panel.add(lblLogin_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 39, 297, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 86, 297, 20);
		panel.add(passwordField);
		
		
	}
}
