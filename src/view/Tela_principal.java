package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Tela_principal {

	private JFrame frmCoreMusic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_principal window = new Tela_principal();
					window.frmCoreMusic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoreMusic = new JFrame();
		frmCoreMusic.setTitle("Core Music");
		frmCoreMusic.setBounds(100, 100, 1366, 768);
		frmCoreMusic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoreMusic.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmCoreMusic.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		mnArquivo.add(mntmSair);
		
		JMenu mnNewMenu = new JMenu("Controle");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Pessoa");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastroDeCidade = new JMenuItem("Patrim\u00F4nio");
		mnNewMenu.add(mntmCadastroDeCidade);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aula");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cidade");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmCadastroDeEstado = new JMenuItem("Estado");
		mnNewMenu.add(mntmCadastroDeEstado);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		
	}
}
