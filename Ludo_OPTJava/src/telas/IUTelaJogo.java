package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class IUTelaJogo extends JFrame {

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
		botaoSerHost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					InetAddress enderecoHost = InetAddress.getLocalHost();
					JOptionPane.showMessageDialog(botaoSerHost, enderecoHost.getHostAddress());
				} catch (UnknownHostException hostErro) {
					JOptionPane.showMessageDialog(botaoSerHost, "Endereço nao encontrado!");
				}
			}
		});
		menuConectar.add(botaoSerHost);

		JMenuItem botaoConectar = new JMenuItem("Conectar");
		botaoConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ip = JOptionPane.showInputDialog(null, "Digite o endereco IP da maquina que se deseja conectar");
					InetAddress enderecoHost = InetAddress.getByName(ip);
					JOptionPane.showMessageDialog(botaoConectar, "Conectado ao endereco " + enderecoHost.getHostAddress());
				}catch ( UnknownHostException host){
					JOptionPane.showMessageDialog(botaoConectar, "Endereco invalido. \nErro: " + host.toString() );
					
				}
				
			}
		});
		menuConectar.add(botaoConectar);
		

		JMenu menuRegras = new JMenu("Regras");
		menuBar.add(menuRegras);

		JMenuItem botaoVerRegras = new JMenuItem("Ver regras");
		
		botaoVerRegras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(menuRegras, "O Ludo e um jogo de tabuleiro para dois a quatro jogadores, que se movem em torno do tabuleiro tentando levar todas as suas pecas do inicio ate a base."
						+ "\n As regras do Ludo sao simples:\r\n"
						+ "\r\n"
						+ "1 - Cada jogador comeca com quatro pecas na area de inicio do tabuleiro.\r\n"
						+ "2 - O objetivo do jogo e mover todas as suas pecas da area de inicio ate a base, passando pelo caminho em volta do tabuleiro.\r\n"
						+ "3 - Os jogadores usam um dado para determinar quantos espacos podem ser movidos em cada jogada.\r\n"
						+ "4 - As pecas so podem ser movidas para a frente, para um espaco vazio ou ocupado por uma peca aliada.\r\n"
						+ "5 - Se uma peca e movida para um espaco ocupado por uma peca adversaria, a peca adversaria volta para a area de inicio.\r\n"
						+ "6 - Se um jogador rola um seis no dado, ele pode mover uma peca para fora da area de inicio.\r\n"
						+ "7 - Um jogador so pode mover uma peca se tiver rolado um numero correspondente no dado.\r\n"
						+ "8 - O primeiro jogador a levar todas as suas pecas para a base vence o jogo.\r\n");
			}
		});
		menuRegras.add(botaoVerRegras);
		

		JPanel painelJogo = new JPanel();
		painelJogo.setBounds(0, 31, 1000, 930);
		getContentPane().add(painelJogo);
		painelJogo.setLayout(null);
		
		JPanel celulaNormal01 = new JPanel();
		celulaNormal01.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal01.setBackground(Color.GREEN);
		celulaNormal01.setBounds(266, 451, 34, 33);
		painelJogo.add(celulaNormal01);
		
		JPanel celulaNormal02 = new JPanel();
		celulaNormal02.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal02.setBackground(new Color(255, 255, 255));
		celulaNormal02.setBounds(233, 451, 34, 33);
		painelJogo.add(celulaNormal02);
		
		JPanel celulaNormal03 = new JPanel();
		celulaNormal03.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal03.setBackground(new Color(255, 255, 255));
		celulaNormal03.setBounds(299, 451, 34, 33);
		painelJogo.add(celulaNormal03);
		
		JPanel celulaNormal04 = new JPanel();
		celulaNormal04.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal04.setBackground(new Color(255, 255, 255));
		celulaNormal04.setBounds(365, 451, 34, 33);
		painelJogo.add(celulaNormal04);
		
		JPanel celulaNormal06 = new JPanel();
		celulaNormal06.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal06.setBackground(new Color(255, 255, 255));
		celulaNormal06.setBounds(398, 451, 34, 33);
		painelJogo.add(celulaNormal06);
		
		JPanel celulaNormal07 = new JPanel();
		celulaNormal07.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal07.setBackground(new Color(255, 255, 255));
		celulaNormal07.setBounds(431, 419, 34, 33);
		painelJogo.add(celulaNormal07);
		
		JPanel celulaNormal08 = new JPanel();
		celulaNormal08.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal08.setBackground(new Color(255, 255, 255));
		celulaNormal08.setBounds(431, 387, 34, 33);
		painelJogo.add(celulaNormal08);
		
		JPanel celulaNormal09 = new JPanel();
		celulaNormal09.setBounds(254, 2213, 34, 33);
		painelJogo.add(celulaNormal09);
		
		JPanel celulaNormal10 = new JPanel();
		celulaNormal10.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal10.setBackground(new Color(255, 255, 255));
		celulaNormal10.setBounds(431, 355, 34, 33);
		painelJogo.add(celulaNormal10);
		
		JPanel celulaNormal11 = new JPanel();
		celulaNormal11.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal11.setBackground(new Color(255, 255, 255));
		celulaNormal11.setBounds(431, 291, 34, 33);
		painelJogo.add(celulaNormal11);
		
		JPanel celulaNormal12 = new JPanel();
		celulaNormal12.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal12.setBackground(new Color(255, 255, 255));
		celulaNormal12.setBounds(431, 259, 34, 33);
		painelJogo.add(celulaNormal12);
		
		JPanel celulaNormal13 = new JPanel();
		celulaNormal13.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal13.setBackground(new Color(255, 255, 255));
		celulaNormal13.setBounds(499, 259, 34, 33);
		painelJogo.add(celulaNormal13);
		
		JPanel celulaNormal14 = new JPanel();
		celulaNormal14.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal14.setBackground(Color.YELLOW);
		celulaNormal14.setBounds(499, 291, 34, 33);
		painelJogo.add(celulaNormal14);
		
		JPanel celulaNormal15 = new JPanel();
		celulaNormal15.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal15.setBackground(new Color(255, 255, 255));
		celulaNormal15.setBounds(499, 323, 34, 33);
		painelJogo.add(celulaNormal15);
		
		JPanel celulaNormal16 = new JPanel();
		celulaNormal16.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal16.setBackground(new Color(255, 255, 255));
		celulaNormal16.setBounds(499, 355, 34, 33);
		painelJogo.add(celulaNormal16);
		
		JPanel celulaNormal17 = new JPanel();
		celulaNormal17.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal17.setBackground(new Color(255, 255, 255));
		celulaNormal17.setBounds(499, 387, 34, 33);
		painelJogo.add(celulaNormal17);
		
		JPanel celulaNormal18 = new JPanel();
		celulaNormal18.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal18.setBackground(new Color(255, 255, 255));
		celulaNormal18.setBounds(499, 419, 34, 33);
		painelJogo.add(celulaNormal18);
		
		JPanel celulaNormal19 = new JPanel();
		celulaNormal19.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal19.setBackground(new Color(255, 255, 255));
		celulaNormal19.setBounds(332, 451, 34, 33);
		painelJogo.add(celulaNormal19);
		
		JPanel celulaNormal20 = new JPanel();
		celulaNormal20.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal20.setBackground(new Color(255, 255, 255));
		celulaNormal20.setBounds(532, 451, 34, 33);
		painelJogo.add(celulaNormal20);
		
		JPanel celulaNormal21 = new JPanel();
		celulaNormal21.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal21.setBackground(new Color(255, 255, 255));
		celulaNormal21.setBounds(565, 451, 34, 33);
		painelJogo.add(celulaNormal21);
		
		JPanel celulaNormal22 = new JPanel();
		celulaNormal22.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal22.setBackground(new Color(255, 255, 255));
		celulaNormal22.setBounds(598, 451, 34, 33);
		painelJogo.add(celulaNormal22);
		
		JPanel celulaNormal23 = new JPanel();
		celulaNormal23.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal23.setBackground(new Color(255, 255, 255));
		celulaNormal23.setBounds(664, 451, 34, 33);
		painelJogo.add(celulaNormal23);
		
		JPanel celulaNormal24 = new JPanel();
		celulaNormal24.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal24.setBackground(new Color(255, 255, 255));
		celulaNormal24.setBounds(697, 451, 34, 33);
		painelJogo.add(celulaNormal24);
		
		JPanel celulaNormal25 = new JPanel();
		celulaNormal25.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal25.setBackground(new Color(255, 255, 255));
		celulaNormal25.setBounds(697, 515, 34, 33);
		painelJogo.add(celulaNormal25);
		
		JPanel celulaNormal26 = new JPanel();
		celulaNormal26.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal26.setBackground(Color.BLUE);
		celulaNormal26.setBounds(664, 515, 34, 33);
		painelJogo.add(celulaNormal26);
		
		JPanel celulaNormal27 = new JPanel();
		celulaNormal27.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal27.setBackground(new Color(255, 255, 255));
		celulaNormal27.setBounds(631, 515, 34, 33);
		painelJogo.add(celulaNormal27);
		
		JPanel celulaNormal28 = new JPanel();
		celulaNormal28.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal28.setBackground(new Color(255, 255, 255));
		celulaNormal28.setBounds(598, 515, 34, 33);
		painelJogo.add(celulaNormal28);
		
		JPanel celulaNormal29 = new JPanel();
		celulaNormal29.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal29.setBackground(new Color(255, 255, 255));
		celulaNormal29.setBounds(565, 515, 34, 33);
		painelJogo.add(celulaNormal29);
		
		JPanel celulaNormal30 = new JPanel();
		celulaNormal30.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal30.setBackground(new Color(255, 255, 255));
		celulaNormal30.setBounds(532, 515, 34, 33);
		painelJogo.add(celulaNormal30);
		
		JPanel celulaNormal31 = new JPanel();
		celulaNormal31.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal31.setBackground(new Color(255, 255, 255));
		celulaNormal31.setBounds(499, 547, 34, 33);
		painelJogo.add(celulaNormal31);
		
		JPanel celulaNormal32 = new JPanel();
		celulaNormal32.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal32.setBackground(new Color(255, 255, 255));
		celulaNormal32.setBounds(499, 579, 34, 33);
		painelJogo.add(celulaNormal32);
		
		JPanel celulaNormal33 = new JPanel();
		celulaNormal33.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal33.setBackground(new Color(255, 255, 255));
		celulaNormal33.setBounds(499, 611, 34, 33);
		painelJogo.add(celulaNormal33);
		
		JPanel celulaNormal34 = new JPanel();
		celulaNormal34.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal34.setBackground(new Color(255, 255, 255));
		celulaNormal34.setBounds(499, 675, 34, 33);
		painelJogo.add(celulaNormal34);
		
		JPanel celulaNormal37 = new JPanel();
		celulaNormal37.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal37.setBackground(new Color(255, 255, 255));
		celulaNormal37.setBounds(499, 707, 34, 33);
		painelJogo.add(celulaNormal37);
		
		JPanel celulaNormal38 = new JPanel();
		celulaNormal38.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal38.setBackground(new Color(255, 255, 255));
		celulaNormal38.setBounds(431, 707, 34, 33);
		painelJogo.add(celulaNormal38);
		
		JPanel celulaNormal39 = new JPanel();
		celulaNormal39.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal39.setBackground(new Color(255, 255, 255));
		celulaNormal39.setBounds(431, 675, 34, 33);
		painelJogo.add(celulaNormal39);
		
		JPanel celulaNormal40 = new JPanel();
		celulaNormal40.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal40.setBackground(new Color(255, 255, 255));
		celulaNormal40.setBounds(431, 643, 34, 33);
		painelJogo.add(celulaNormal40);
		
		JPanel celulaNormal41 = new JPanel();
		celulaNormal41.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal41.setBackground(new Color(255, 255, 255));
		celulaNormal41.setBounds(431, 611, 34, 33);
		painelJogo.add(celulaNormal41);
		
		JPanel celulaNormal42 = new JPanel();
		celulaNormal42.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal42.setBackground(new Color(255, 255, 255));
		celulaNormal42.setBounds(431, 579, 34, 33);
		painelJogo.add(celulaNormal42);
		
		JPanel celulaNormal43 = new JPanel();
		celulaNormal43.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal43.setBackground(new Color(255, 255, 255));
		celulaNormal43.setBounds(431, 547, 34, 33);
		painelJogo.add(celulaNormal43);
		
		JPanel celulaNormal44 = new JPanel();
		celulaNormal44.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal44.setBackground(new Color(255, 255, 255));
		celulaNormal44.setBounds(398, 515, 34, 33);
		painelJogo.add(celulaNormal44);
		
		JPanel celulaNormal45 = new JPanel();
		celulaNormal45.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal45.setBackground(new Color(255, 255, 255));
		celulaNormal45.setBounds(365, 515, 34, 33);
		painelJogo.add(celulaNormal45);
		
		JPanel celulaNormal46 = new JPanel();
		celulaNormal46.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal46.setBackground(new Color(255, 255, 255));
		celulaNormal46.setBounds(332, 515, 34, 33);
		painelJogo.add(celulaNormal46);
		
		JPanel celulaNormal47 = new JPanel();
		celulaNormal47.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal47.setBackground(new Color(255, 255, 255));
		celulaNormal47.setBounds(266, 515, 34, 33);
		painelJogo.add(celulaNormal47);
		
		JPanel celulaNormal48 = new JPanel();
		celulaNormal48.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal48.setBackground(new Color(255, 255, 255));
		celulaNormal48.setBounds(233, 515, 34, 33);
		painelJogo.add(celulaNormal48);
		
		JPanel celulaMeioVerdeFim = new JPanel();
		celulaMeioVerdeFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVerdeFim.setBackground(Color.GREEN);
		celulaMeioVerdeFim.setBounds(431, 451, 34, 33);
		painelJogo.add(celulaMeioVerdeFim);
		
		JPanel celulaSeguraVerde = new JPanel();
		celulaSeguraVerde.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraVerde.setBackground(new Color(0, 0, 0));
		celulaSeguraVerde.setBounds(431, 323, 34, 33);
		painelJogo.add(celulaSeguraVerde);
		
		JPanel celulaAmbiguaAmarela = new JPanel();
		celulaAmbiguaAmarela.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaAmbiguaAmarela.setBackground(Color.YELLOW);
		celulaAmbiguaAmarela.setBounds(465, 259, 34, 33);
		painelJogo.add(celulaAmbiguaAmarela);
		
		JPanel celulaMeioAmarelaFim = new JPanel();
		celulaMeioAmarelaFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioAmarelaFim.setBackground(Color.YELLOW);
		celulaMeioAmarelaFim.setBounds(499, 451, 34, 33);
		painelJogo.add(celulaMeioAmarelaFim);
		
		JPanel celulaSeguraAmarelo = new JPanel();
		celulaSeguraAmarelo.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraAmarelo.setBackground(new Color(0, 0, 0));
		celulaSeguraAmarelo.setBounds(631, 451, 34, 33);
		painelJogo.add(celulaSeguraAmarelo);
		
		JPanel celulaMeioAzul = new JPanel();
		celulaMeioAzul.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioAzul.setBackground(Color.BLUE);
		celulaMeioAzul.setBounds(697, 483, 34, 33);
		painelJogo.add(celulaMeioAzul);
		
		JPanel celulaMeioAzulFim = new JPanel();
		celulaMeioAzulFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioAzulFim.setBackground(Color.BLUE);
		celulaMeioAzulFim.setBounds(499, 515, 34, 33);
		painelJogo.add(celulaMeioAzulFim);
		
		JPanel celulaFinal01 = new JPanel();
		celulaFinal01.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal01.setBackground(Color.GREEN);
		celulaFinal01.setBounds(266, 483, 34, 33);
		painelJogo.add(celulaFinal01);
		
		JPanel celulaFinal02 = new JPanel();
		celulaFinal02.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal02.setBackground(Color.GREEN);
		celulaFinal02.setBounds(299, 483, 34, 33);
		painelJogo.add(celulaFinal02);
		
		JPanel celulaFinal03 = new JPanel();
		celulaFinal03.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal03.setBackground(Color.GREEN);
		celulaFinal03.setBounds(332, 483, 34, 33);
		painelJogo.add(celulaFinal03);
		
		JPanel celulaFinal04 = new JPanel();
		celulaFinal04.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal04.setBackground(Color.GREEN);
		celulaFinal04.setBounds(365, 483, 34, 33);
		painelJogo.add(celulaFinal04);
		
		JPanel celulaFinal05 = new JPanel();
		celulaFinal05.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal05.setBackground(Color.GREEN);
		celulaFinal05.setBounds(398, 483, 34, 33);
		painelJogo.add(celulaFinal05);
		
		JPanel celulaFinal06 = new JPanel();
		celulaFinal06.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal06.setBackground(Color.GREEN);
		celulaFinal06.setBounds(431, 483, 34, 33);
		painelJogo.add(celulaFinal06);
		
		JPanel celulaFinal07 = new JPanel();
		celulaFinal07.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal07.setBackground(Color.YELLOW);
		celulaFinal07.setBounds(465, 291, 34, 33);
		painelJogo.add(celulaFinal07);
		
		JPanel celulaFinal08 = new JPanel();
		celulaFinal08.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal08.setBackground(Color.YELLOW);
		celulaFinal08.setBounds(465, 323, 34, 33);
		painelJogo.add(celulaFinal08);
		
		JPanel celulaFinal09 = new JPanel();
		celulaFinal09.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal09.setBackground(Color.YELLOW);
		celulaFinal09.setBounds(465, 355, 34, 33);
		painelJogo.add(celulaFinal09);
		
		JPanel celulaFinal10 = new JPanel();
		celulaFinal10.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal10.setBackground(Color.YELLOW);
		celulaFinal10.setBounds(465, 387, 34, 33);
		painelJogo.add(celulaFinal10);
		
		JPanel celulaFinal11 = new JPanel();
		celulaFinal11.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal11.setBackground(Color.YELLOW);
		celulaFinal11.setBounds(465, 419, 34, 33);
		painelJogo.add(celulaFinal11);
		
		JPanel celulaFinal12 = new JPanel();
		celulaFinal12.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal12.setBackground(Color.YELLOW);
		celulaFinal12.setBounds(465, 451, 34, 33);
		painelJogo.add(celulaFinal12);
		
		JPanel celulaFinal19 = new JPanel();
		celulaFinal19.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal19.setBackground(Color.BLUE);
		celulaFinal19.setBounds(499, 483, 34, 33);
		painelJogo.add(celulaFinal19);
		
		JPanel celulaFinal18 = new JPanel();
		celulaFinal18.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal18.setBackground(Color.BLUE);
		celulaFinal18.setBounds(532, 483, 34, 33);
		painelJogo.add(celulaFinal18);
		
		JPanel celulaFinal16 = new JPanel();
		celulaFinal16.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal16.setBackground(Color.BLUE);
		celulaFinal16.setBounds(565, 483, 34, 33);
		painelJogo.add(celulaFinal16);
		
		JPanel celulaFinal15 = new JPanel();
		celulaFinal15.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal15.setBackground(Color.BLUE);
		celulaFinal15.setBounds(598, 483, 34, 33);
		painelJogo.add(celulaFinal15);
		
		JPanel celulaFinal14 = new JPanel();
		celulaFinal14.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal14.setBackground(Color.BLUE);
		celulaFinal14.setBounds(631, 483, 34, 33);
		painelJogo.add(celulaFinal14);
		
		JPanel celulaFinal13 = new JPanel();
		celulaFinal13.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal13.setBackground(Color.BLUE);
		celulaFinal13.setBounds(664, 483, 34, 33);
		painelJogo.add(celulaFinal13);
		
		JPanel celulaSeguraAzul = new JPanel();
		celulaSeguraAzul.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraAzul.setBackground(new Color(0, 0, 0));
		celulaSeguraAzul.setBounds(499, 643, 34, 33);
		painelJogo.add(celulaSeguraAzul);
		
		JPanel celulaMeioVermelha = new JPanel();
		celulaMeioVermelha.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVermelha.setBackground(Color.RED);
		celulaMeioVermelha.setBounds(465, 707, 34, 33);
		painelJogo.add(celulaMeioVermelha);
		
		JPanel celulaFinal20 = new JPanel();
		celulaFinal20.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal20.setBackground(Color.RED);
		celulaFinal20.setBounds(465, 675, 34, 33);
		painelJogo.add(celulaFinal20);
		
		JPanel celulaFinal21 = new JPanel();
		celulaFinal21.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal21.setBackground(Color.RED);
		celulaFinal21.setBounds(465, 643, 34, 33);
		painelJogo.add(celulaFinal21);
		
		JPanel celulaFinal23 = new JPanel();
		celulaFinal23.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal23.setBackground(Color.RED);
		celulaFinal23.setBounds(465, 611, 34, 33);
		painelJogo.add(celulaFinal23);
		
		JPanel celulaFinal24 = new JPanel();
		celulaFinal24.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal24.setBackground(Color.RED);
		celulaFinal24.setBounds(465, 579, 34, 33);
		painelJogo.add(celulaFinal24);
		
		JPanel celulaFinal25 = new JPanel();
		celulaFinal25.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal25.setBackground(Color.RED);
		celulaFinal25.setBounds(465, 547, 34, 33);
		painelJogo.add(celulaFinal25);
		
		JPanel celulaFinal26 = new JPanel();
		celulaFinal26.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinal26.setBackground(Color.RED);
		celulaFinal26.setBounds(465, 515, 34, 33);
		painelJogo.add(celulaFinal26);
		
		JPanel celulaMeioVermelhaFim = new JPanel();
		celulaMeioVermelhaFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVermelhaFim.setBackground(Color.RED);
		celulaMeioVermelhaFim.setBounds(431, 515, 34, 33);
		painelJogo.add(celulaMeioVermelhaFim);
		
		JPanel celulaSeguraVermelha = new JPanel();
		celulaSeguraVermelha.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraVermelha.setBackground(new Color(0, 0, 0));
		celulaSeguraVermelha.setBounds(299, 515, 34, 33);
		painelJogo.add(celulaSeguraVermelha);
		
		JPanel celulaDado = new JPanel();
		celulaDado.setBackground(new Color(255, 255, 255));
		celulaDado.setBounds(465, 483, 34, 33);
		painelJogo.add(celulaDado);
		celulaDado.setLayout(null);
		
		JPanel celulaMeioVerde = new JPanel();
		celulaMeioVerde.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVerde.setBackground(Color.GREEN);
		celulaMeioVerde.setBounds(233, 483, 34, 33);
		painelJogo.add(celulaMeioVerde);
		
		JPanel baseVerde = new JPanel();
		baseVerde.setBackground(Color.GREEN);
		baseVerde.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseVerde.setBounds(233, 259, 199, 193);
		painelJogo.add(baseVerde);
		baseVerde.setLayout(null);
		
		JPanel subBaseVerde = new JPanel();
		subBaseVerde.setBounds(32, 33, 135, 126);
		baseVerde.add(subBaseVerde);
		subBaseVerde.setLayout(null);
		
		JPanelCircular peao1Verde = new JPanelCircular(300, Color.GREEN);
		peao1Verde.setBounds(10, 10, 34, 34);
		subBaseVerde.add(peao1Verde);
		
		JPanel peao3Verde = new JPanelCircular(300, Color.GREEN);
		peao3Verde.setBounds(10, 81, 34, 34);
		subBaseVerde.add(peao3Verde);
		
		JPanelCircular peao4Verde = new JPanelCircular(300, Color.GREEN);
		peao4Verde.setBounds(91, 81, 34, 34);
		subBaseVerde.add(peao4Verde);
		
		JPanelCircular peao2Verde = new JPanelCircular(300, Color.GREEN);
		peao2Verde.setBounds(91, 10, 34, 34);
		subBaseVerde.add(peao2Verde);
		
		JPanel baseAmarela = new JPanel();
		baseAmarela.setBackground(Color.YELLOW);
		baseAmarela.setLayout(null);
		baseAmarela.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseAmarela.setBounds(532, 259, 199, 193);
		painelJogo.add(baseAmarela);
		
		JPanel subBaseAmarela = new JPanel();
		subBaseAmarela.setLayout(null);
		subBaseAmarela.setBounds(32, 33, 135, 126);
		baseAmarela.add(subBaseAmarela);
		
		JPanelCircular peao1Amarelo = new JPanelCircular(300, Color.YELLOW);
		peao1Amarelo.setBounds(10, 10, 34, 34);
		subBaseAmarela.add(peao1Amarelo);
		
		JPanelCircular peao3Amarelo = new JPanelCircular(300, Color.YELLOW);
		peao3Amarelo.setBounds(10, 81, 34, 34);
		subBaseAmarela.add(peao3Amarelo);
		
		JPanelCircular peao4Amarelo = new JPanelCircular(300, Color.YELLOW);
		peao4Amarelo.setBounds(91, 81, 34, 34);
		subBaseAmarela.add(peao4Amarelo);
		
		JPanelCircular peao2Amarelo = new JPanelCircular(300, Color.YELLOW);
		peao2Amarelo.setBounds(91, 10, 34, 34);
		subBaseAmarela.add(peao2Amarelo);
		
		JPanel baseVermelha = new JPanel();
		baseVermelha.setLayout(null);
		baseVermelha.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseVermelha.setBackground(Color.RED);
		baseVermelha.setBounds(233, 547, 199, 193);
		painelJogo.add(baseVermelha);
		
		JPanel subBaseVermelha = new JPanel();
		subBaseVermelha.setLayout(null);
		subBaseVermelha.setBounds(32, 33, 135, 126);
		baseVermelha.add(subBaseVermelha);
		
		JPanelCircular peao1Vermelho = new JPanelCircular(300, Color.RED);
		peao1Vermelho.setBounds(10, 10, 34, 34);
		subBaseVermelha.add(peao1Vermelho);
		
		JPanelCircular peao3Vermelho = new JPanelCircular(300, Color.RED);
		peao3Vermelho.setBounds(10, 81, 34, 34);
		subBaseVermelha.add(peao3Vermelho);
		
		JPanelCircular peao4Vermelho = new JPanelCircular(300, Color.RED);
		peao4Vermelho.setBounds(91, 81, 34, 34);
		subBaseVermelha.add(peao4Vermelho);
		
		JPanelCircular peao2Vermelho = new JPanelCircular(300, Color.RED);
		peao2Vermelho.setBounds(91, 10, 34, 34);
		subBaseVermelha.add(peao2Vermelho);
		
		JPanel baseAzul = new JPanel();
		baseAzul.setLayout(null);
		baseAzul.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseAzul.setBackground(Color.BLUE);
		baseAzul.setBounds(532, 547, 199, 193);
		painelJogo.add(baseAzul);
		
		JPanel subBaseAzul = new JPanel();
		subBaseAzul.setLayout(null);
		subBaseAzul.setBounds(32, 33, 135, 126);
		baseAzul.add(subBaseAzul);
		
		JPanelCircular peao1Azul = new JPanelCircular(300, Color.BLUE);
		peao1Azul.setBounds(10, 10, 34, 34);
		subBaseAzul.add(peao1Azul);
		
		JPanelCircular peao3Azul = new JPanelCircular(300, Color.BLUE);
		peao3Azul.setBounds(10, 81, 34, 34);
		subBaseAzul.add(peao3Azul);
		
		JPanelCircular peao4Azul = new JPanelCircular(300, Color.BLUE);
		peao4Azul.setBounds(91, 81, 34, 34);
		subBaseAzul.add(peao4Azul);
		
		JPanelCircular peao2Azul = new JPanelCircular(300, Color.BLUE);
		peao2Azul.setBounds(91, 10, 34, 34);
		subBaseAzul.add(peao2Azul);
		
		
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
		lblRolagem.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblRolagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRolagem.setBounds(0, 0, 34, 33);
		celulaDado.add(lblRolagem);
		
		Random dado = new Random();
		btnRolarDado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblRolagem.setText(Integer.toString(dado.nextInt(6) + 1));
			}
		});
	}
}