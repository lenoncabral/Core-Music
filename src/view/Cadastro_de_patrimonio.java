package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Cadastro_de_patrimonio {

	private JFrame frmCadastroDePatrimnio;
	private JTextField textField;
	private JTextField frm_nome;
	private JTextField frm_valor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_de_patrimonio window = new Cadastro_de_patrimonio();
					window.frmCadastroDePatrimnio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro_de_patrimonio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDePatrimnio = new JFrame();
		frmCadastroDePatrimnio.setTitle("Patrim\u00F4nio");
		frmCadastroDePatrimnio.setBounds(100, 100, 718, 451);
		frmCadastroDePatrimnio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDePatrimnio.getContentPane().setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 20, 46, 14);
		frmCadastroDePatrimnio.getContentPane().add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(66, 17, 86, 20);
		frmCadastroDePatrimnio.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("<<");
		button.setBounds(505, 11, 49, 23);
		frmCadastroDePatrimnio.getContentPane().add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(552, 11, 44, 23);
		frmCadastroDePatrimnio.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(595, 11, 44, 23);
		frmCadastroDePatrimnio.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(638, 11, 49, 23);
		frmCadastroDePatrimnio.getContentPane().add(button_3);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 56, 46, 14);
		frmCadastroDePatrimnio.getContentPane().add(lblNome);
		
		frm_nome = new JTextField();
		frm_nome.setBounds(10, 73, 403, 20);
		frmCadastroDePatrimnio.getContentPane().add(frm_nome);
		frm_nome.setColumns(10);
		
		JLabel lblDataDeAquisio = new JLabel("Data de aquisi\u00E7\u00E3o");
		lblDataDeAquisio.setBounds(423, 56, 111, 14);
		frmCadastroDePatrimnio.getContentPane().add(lblDataDeAquisio);
		
		JFormattedTextField frm_data_aquisicao = new JFormattedTextField();
		frm_data_aquisicao.setBounds(423, 73, 111, 20);
		frmCadastroDePatrimnio.getContentPane().add(frm_data_aquisicao);
		
		frm_valor = new JTextField();
		frm_valor.setBounds(544, 73, 143, 20);
		frmCadastroDePatrimnio.getContentPane().add(frm_valor);
		frm_valor.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(544, 56, 46, 14);
		frmCadastroDePatrimnio.getContentPane().add(lblValor);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 104, 66, 14);
		frmCadastroDePatrimnio.getContentPane().add(lblDescrio);
		
		JTextPane txt_descricao = new JTextPane();
		txt_descricao.setBounds(10, 129, 674, 147);
		frmCadastroDePatrimnio.getContentPane().add(txt_descricao);
		
		JLabel lblTipoDeAquisio = new JLabel("Tipo de aquisi\u00E7\u00E3o");
		lblTipoDeAquisio.setBounds(10, 287, 123, 14);
		frmCadastroDePatrimnio.getContentPane().add(lblTipoDeAquisio);
		
		JRadioButton rdbtnCompra = new JRadioButton("Compra");
		rdbtnCompra.setToolTipText("");
		rdbtnCompra.setBounds(10, 308, 109, 23);
		frmCadastroDePatrimnio.getContentPane().add(rdbtnCompra);
		
		JRadioButton rdbtnDoao = new JRadioButton("Doa\u00E7\u00E3o");
		rdbtnDoao.setToolTipText("");
		rdbtnDoao.setBounds(10, 334, 109, 23);
		frmCadastroDePatrimnio.getContentPane().add(rdbtnDoao);
		
		JButton button_4 = new JButton("Novo");
		button_4.setBounds(162, 365, 89, 23);
		frmCadastroDePatrimnio.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Gravar");
		button_5.setBounds(261, 365, 89, 23);
		frmCadastroDePatrimnio.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Cancelar");
		button_6.setBounds(360, 365, 89, 23);
		frmCadastroDePatrimnio.getContentPane().add(button_6);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(459, 365, 89, 23);
		frmCadastroDePatrimnio.getContentPane().add(btnBuscar);
	}
}
