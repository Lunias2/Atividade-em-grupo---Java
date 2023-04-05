package telas;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;

public class IUTelaJogo extends JFrame {

	private JLabel lblImagem;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4675677208742332558L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IUTelaJogo frame = new IUTelaJogo();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public IUTelaJogo() {
		setBounds(100, 100, 1700, 1000);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1700, 33);
		getContentPane().add(menuBar);

		JMenu menuConectar = new JMenu("Conectar");
		menuBar.add(menuConectar);

		JMenuItem botaoSerHost = new JMenuItem("Ser Host");
		menuConectar.add(botaoSerHost);

		JMenuItem botaoConectar = new JMenuItem("Conectar");
		menuConectar.add(botaoConectar);

		JMenu menuRegras = new JMenu("Regras");
		menuBar.add(menuRegras);

		JMenuItem mntmNewMenuItem = new JMenuItem("Ver regras");
		menuRegras.add(mntmNewMenuItem);

		JPanel painelJogo = new JPanel();
		painelJogo.setBounds(0, 31, 1000, 930);
		getContentPane().add(painelJogo);
		painelJogo.setLayout(null);

		ImageIcon icon = new ImageIcon("src/imagem/imagemLudo.jpg");
		Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        lblImagem = new JLabel(scaledIcon);
		lblImagem.setBounds(0, 0, 1000, 930);
		painelJogo.add(lblImagem);

		JPanel painelDivisa = new JPanel();
		painelDivisa.setBounds(1001, 30, 10, 930);
		getContentPane().add(painelDivisa);
		painelDivisa.setBackground(new Color(75, 101, 173));
		
		JPanel painelInteracao = new JPanel();
		painelInteracao.setBounds(1010, 31, 447, 930);
		getContentPane().add(painelInteracao);
		painelInteracao.setLayout(null);
		
		JButton btnRolarDado = new JButton("rolarDado");
		btnRolarDado.setBounds(10, 11, 170, 52);
		painelInteracao.add(btnRolarDado);
		
		JLabel lblRolagem = new JLabel("");
		lblRolagem.setBounds(20, 74, 192, 108);
		painelInteracao.add(lblRolagem);
		
		Random dado = new Random();
		btnRolarDado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor = dado.nextInt(6) + 1;
				String endereco = "src/imagem/ludoLado" + valor + ".png";
				ImageIcon icon = new ImageIcon(endereco);
				lblRolagem.setText(endereco);
				Image image = icon.getImage();
		        Image scaledImage = image.getScaledInstance(1000, 980, Image.SCALE_SMOOTH);
		        ImageIcon scaledIcon = new ImageIcon(scaledImage);
		        lblImagem.setIcon(null);
		        lblImagem = new JLabel(scaledIcon);
				lblImagem.setBounds(0, 0, 1000, 980);
				painelJogo.add(lblImagem);
			}
		});

	}
}
