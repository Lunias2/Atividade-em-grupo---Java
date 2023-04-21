package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class IUTelaJogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4675677208742332558L;
	private LinkedList<CelulaNormal> celulas;
	private int contador;

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
	public IUTelaJogo(){
		celulas = new LinkedList<>();
		setBounds(100, 100, 1100, 820);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1084, 33);
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
				JOptionPane.showMessageDialog(null, "O Ludo e um jogo de tabuleiro para dois a quatro jogadores, que se movem em torno do tabuleiro tentando levar todas as suas pecas do inicio ate a base."
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
		
		JMenu Desistir = new JMenu("Desistir");
		menuBar.add(Desistir);
		JMenuItem botaoDesistencia = new JMenuItem("Pedir desistência");
		botaoDesistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que quer desistir?", "Confirmar desistência",JOptionPane.YES_NO_OPTION);
				if(resposta == JOptionPane.YES_OPTION) {
					
				}
				else {
					
				}
			}
		});
		Desistir.add(botaoDesistencia);
		
		JPanel painelJogo = new JPanel();
		painelJogo.setBounds(0, 31, 750, 750);
		getContentPane().add(painelJogo);
		painelJogo.setLayout(null);
		
		//-------------------------------------------------------------------------- INICIO PARTE VERDE --------------------------------------------------------------------------
		
		CelulaNormal celulaNormal01 = new CelulaNormal();
		celulaNormal01.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal01.setBackground(new Color(255, 255, 255));
		celulaNormal01.setBounds(0, 300, 50, 50);
		painelJogo.add(celulaNormal01);
		
		CelulaNormal celulaNormal02 = new CelulaNormal();
		celulaNormal02.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal02.setBackground(Color.green); //new Color(255, 255, 255)
		celulaNormal02.setBounds(50, 300, 50, 50);
		painelJogo.add(celulaNormal02);
		
		CelulaNormal celulaNormal03 = new CelulaNormal();
		celulaNormal03.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal03.setBackground(new Color(255, 255, 255));
		celulaNormal03.setBounds(100, 300, 50, 50);
		painelJogo.add(celulaNormal03);
		
		CelulaNormal celulaNormal04 = new CelulaNormal();
		celulaNormal04.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal04.setBackground(new Color(255, 255, 255));
		celulaNormal04.setBounds(150, 300, 50, 50);
		painelJogo.add(celulaNormal04);
		
		CelulaNormal celulaNormal05 = new CelulaNormal();
		celulaNormal05.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal05.setBackground(Color.WHITE);
		celulaNormal05.setBounds(200, 300, 50, 50);
		painelJogo.add(celulaNormal05);
		
		CelulaNormal celulaNormal06 = new CelulaNormal();
		celulaNormal06.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal06.setBackground(new Color(255, 255, 255));
		celulaNormal06.setBounds(250, 300, 50, 50);
		painelJogo.add(celulaNormal06);
		
		CelulaNormal celulaNormal07 = new CelulaNormal();
		celulaNormal07.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal07.setBackground(new Color(255, 255, 255));
		celulaNormal07.setBounds(300, 250, 50, 50);
		painelJogo.add(celulaNormal07);
		
		CelulaNormal celulaNormal08 = new CelulaNormal();
		celulaNormal08.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal08.setBackground(new Color(255, 255, 255));
		celulaNormal08.setBounds(300, 200, 50, 50);
		painelJogo.add(celulaNormal08);
		
		CelulaNormal celulaNormal09 = new CelulaNormal();
		celulaNormal09.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal09.setBackground(new Color(255, 255, 255));
		celulaNormal09.setBounds(300, 150, 50, 50);
		painelJogo.add(celulaNormal09);
		
		CelulaSegura celulaSeguraVerde = new CelulaSegura();
		celulaSeguraVerde.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraVerde.setBackground(new Color(0, 0, 0));
		celulaSeguraVerde.setBounds(300, 100, 50, 50);
		painelJogo.add(celulaSeguraVerde);
		
		CelulaNormal celulaNormal10 = new CelulaNormal();
		celulaNormal10.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal10.setBackground(new Color(255, 255, 255));
		celulaNormal10.setBounds(300, 50, 50, 50);
		painelJogo.add(celulaNormal10);
		
		CelulaNormal celulaNormal11 = new CelulaNormal();
		celulaNormal11.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal11.setBackground(new Color(255, 255, 255));
		celulaNormal11.setBounds(300, 0, 50, 50);
		painelJogo.add(celulaNormal11);
		
		CelulaBidividida celulaMeioVerdeInicio = new CelulaBidividida();
		celulaMeioVerdeInicio.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVerdeInicio.setBackground(Color.GREEN);
		celulaMeioVerdeInicio.setBounds(0, 350, 50, 50);
		painelJogo.add(celulaMeioVerdeInicio);
		
		JPanel celulaMeioVerdeFim = new JPanel();
		celulaMeioVerdeFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVerdeFim.setBackground(Color.GREEN);
		celulaMeioVerdeFim.setBounds(300, 300, 50, 50);
		painelJogo.add(celulaMeioVerdeFim);
		
		CelulaFinal celulaFinalVerde1 = new CelulaFinal(0);
		celulaFinalVerde1.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVerde1.setBackground(Color.GREEN);
		celulaFinalVerde1.setBounds(50, 350, 50, 50);
		painelJogo.add(celulaFinalVerde1);
		celulaMeioVerdeInicio.addCelula(celulaFinalVerde1);
		
		CelulaFinal celulaFinalVerde2 = new CelulaFinal(1);
		celulaFinalVerde2.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVerde2.setBackground(Color.GREEN);
		celulaFinalVerde2.setBounds(100, 350, 50, 50);
		painelJogo.add(celulaFinalVerde2);
		celulaMeioVerdeInicio.addCelula(celulaFinalVerde2);
		
		CelulaFinal celulaFinalVerde3 = new CelulaFinal(2);
		celulaFinalVerde3.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVerde3.setBackground(Color.GREEN);
		celulaFinalVerde3.setBounds(150, 350, 50, 50);
		painelJogo.add(celulaFinalVerde3);
		celulaMeioVerdeInicio.addCelula(celulaFinalVerde3);
		
		CelulaFinal celulaFinalVerde4 = new CelulaFinal(3);
		celulaFinalVerde4.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVerde4.setBackground(Color.GREEN);
		celulaFinalVerde4.setBounds(200, 350, 50, 50);
		painelJogo.add(celulaFinalVerde4);
		celulaMeioVerdeInicio.addCelula(celulaFinalVerde4);
		
		CelulaFinal celulaFinalVerde5 = new CelulaFinal(4);
		celulaFinalVerde5.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVerde5.setBackground(Color.GREEN);
		celulaFinalVerde5.setBounds(250, 350, 50, 50);
		painelJogo.add(celulaFinalVerde5);
		celulaMeioVerdeInicio.addCelula(celulaFinalVerde5);
		
		CelulaFinal celulaFinalVerde6 = new CelulaFinal(5);
		celulaFinalVerde6.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVerde6.setBackground(Color.GREEN);
		celulaFinalVerde6.setBounds(300, 350, 50, 50);
		painelJogo.add(celulaFinalVerde6);
		celulaMeioVerdeInicio.addCelula(celulaFinalVerde6);
		
		
		//-------------------------------------------------------------------------- FIM PARTE VERDE --------------------------------------------------------------------------
		
		
		//-------------------------------------------------------------------------- INICIO PARTE AMARELA --------------------------------------------------------------------------
		CelulaNormal celulaNormal12 = new CelulaNormal();
		celulaNormal12.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal12.setBackground(new Color(255, 255, 255));
		celulaNormal12.setBounds(400, 0, 50, 50);
		painelJogo.add(celulaNormal12);
		
		CelulaNormal celulaNormal13 = new CelulaNormal();
		celulaNormal13.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal13.setBackground(Color.YELLOW);
		celulaNormal13.setBounds(400, 50, 50, 50);
		painelJogo.add(celulaNormal13);
		
		CelulaNormal celulaNormal14 = new CelulaNormal();
		celulaNormal14.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal14.setBackground(new Color(255, 255, 255));
		celulaNormal14.setBounds(400, 100, 50, 50);
		painelJogo.add(celulaNormal14);
		
		CelulaNormal celulaNormal15 = new CelulaNormal();
		celulaNormal15.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal15.setBackground(new Color(255, 255, 255));
		celulaNormal15.setBounds(400, 150, 50, 50);
		painelJogo.add(celulaNormal15);
		
		CelulaNormal celulaNormal16 = new CelulaNormal();
		celulaNormal16.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal16.setBackground(new Color(255, 255, 255));
		celulaNormal16.setBounds(400, 200, 50, 50);
		painelJogo.add(celulaNormal16);
		
		CelulaNormal celulaNormal17 = new CelulaNormal();
		celulaNormal17.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal17.setBackground(new Color(255, 255, 255));
		celulaNormal17.setBounds(400, 250, 50, 50);
		painelJogo.add(celulaNormal17);
		
		CelulaNormal celulaNormal18 = new CelulaNormal();
		celulaNormal18.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal18.setBackground(new Color(255, 255, 255));
		celulaNormal18.setBounds(450, 300, 50, 50);
		painelJogo.add(celulaNormal18);
		
		CelulaNormal celulaNormal19 = new CelulaNormal();
		celulaNormal19.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal19.setBackground(new Color(255, 255, 255));
		celulaNormal19.setBounds(500, 300, 50, 50);
		painelJogo.add(celulaNormal19);
		
		CelulaNormal celulaNormal20 = new CelulaNormal();
		celulaNormal20.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal20.setBackground(new Color(255, 255, 255));
		celulaNormal20.setBounds(550, 300, 50, 50);
		painelJogo.add(celulaNormal20);
		
		CelulaSegura celulaSeguraAmarelo = new CelulaSegura();
		celulaSeguraAmarelo.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraAmarelo.setBackground(new Color(0, 0, 0));
		celulaSeguraAmarelo.setBounds(600, 300, 50, 50);
		painelJogo.add(celulaSeguraAmarelo);
		
		CelulaNormal celulaNormal21 = new CelulaNormal();
		celulaNormal21.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal21.setBackground(new Color(255, 255, 255));
		celulaNormal21.setBounds(650, 300, 50, 50);
		painelJogo.add(celulaNormal21);
		
		CelulaNormal celulaNormal22 = new CelulaNormal();
		celulaNormal22.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal22.setBackground(new Color(255, 255, 255));
		celulaNormal22.setBounds(700, 300, 50, 50);
		painelJogo.add(celulaNormal22);
		
		CelulaBidividida celulaMeiaAmarelaInicio = new CelulaBidividida();
		celulaMeiaAmarelaInicio.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeiaAmarelaInicio.setBackground(Color.YELLOW);
		celulaMeiaAmarelaInicio.setBounds(350, 0, 50, 50);
		painelJogo.add(celulaMeiaAmarelaInicio);
		
		JPanel celulaMeioAmarelaFim = new JPanel();
		celulaMeioAmarelaFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioAmarelaFim.setBackground(Color.YELLOW);
		celulaMeioAmarelaFim.setBounds(400, 300, 50, 50);
		painelJogo.add(celulaMeioAmarelaFim);
		
		CelulaFinal celulaFinalAmarela1 = new CelulaFinal(0);
		celulaFinalAmarela1.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAmarela1.setBackground(Color.YELLOW);
		celulaFinalAmarela1.setBounds(350, 50, 50, 50);
		painelJogo.add(celulaFinalAmarela1);
		celulaMeiaAmarelaInicio.addCelula(celulaFinalAmarela1);
		
		CelulaFinal celulaFinalAmarela2 = new CelulaFinal(1);
		celulaFinalAmarela2.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAmarela2.setBackground(Color.YELLOW);
		celulaFinalAmarela2.setBounds(350, 100, 50, 50);
		painelJogo.add(celulaFinalAmarela2);
		celulaMeiaAmarelaInicio.addCelula(celulaFinalAmarela2);
		
		CelulaFinal celulaFinalAmarela3 = new CelulaFinal(2);
		celulaFinalAmarela3.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAmarela3.setBackground(Color.YELLOW);
		celulaFinalAmarela3.setBounds(350, 150, 50, 50);
		painelJogo.add(celulaFinalAmarela3);
		celulaMeiaAmarelaInicio.addCelula(celulaFinalAmarela3);
		
		CelulaFinal celulaFinalAmarela4 = new CelulaFinal(3);
		celulaFinalAmarela4.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAmarela4.setBackground(Color.YELLOW);
		celulaFinalAmarela4.setBounds(350, 200, 50, 50);
		painelJogo.add(celulaFinalAmarela4);
		celulaMeiaAmarelaInicio.addCelula(celulaFinalAmarela4);
		
		CelulaFinal celulaFinalAmarela5 = new CelulaFinal(4);
		celulaFinalAmarela5.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAmarela5.setBackground(Color.YELLOW);
		celulaFinalAmarela5.setBounds(350, 250, 50, 50);
		painelJogo.add(celulaFinalAmarela5);
		celulaMeiaAmarelaInicio.addCelula(celulaFinalAmarela5);
		
		CelulaFinal celulaFinalAmarela6 = new CelulaFinal(5);
		celulaFinalAmarela6.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAmarela6.setBackground(Color.YELLOW);
		celulaFinalAmarela6.setBounds(350, 300, 50, 50);
		painelJogo.add(celulaFinalAmarela6);
		celulaMeiaAmarelaInicio.addCelula(celulaFinalAmarela6);
		
		//-------------------------------------------------------------------------- FIM PARTE AMARELA --------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------- INICIO PARTE AZUL --------------------------------------------------------------------------
		CelulaNormal celulaNormal23 = new CelulaNormal();
		celulaNormal23.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal23.setBackground(new Color(255, 255, 255));
		celulaNormal23.setBounds(700, 400, 50, 50);
		painelJogo.add(celulaNormal23);
		
		CelulaNormal celulaNormal24 = new CelulaNormal();
		celulaNormal24.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal24.setBackground(Color.BLUE);
		celulaNormal24.setBounds(650, 400, 50, 50);
		painelJogo.add(celulaNormal24);
		
		CelulaNormal celulaNormal25 = new CelulaNormal();
		celulaNormal25.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal25.setBackground(new Color(255, 255, 255));
		celulaNormal25.setBounds(600, 400, 50, 50);
		painelJogo.add(celulaNormal25);
		
		CelulaNormal celulaNormal26 = new CelulaNormal();
		celulaNormal26.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal26.setBackground(new Color(255, 255, 255));
		celulaNormal26.setBounds(550, 400, 50, 50);
		painelJogo.add(celulaNormal26);
		
		CelulaNormal celulaNormal27 = new CelulaNormal();
		celulaNormal27.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal27.setBackground(new Color(255, 255, 255));
		celulaNormal27.setBounds(500, 400, 50, 50);
		painelJogo.add(celulaNormal27);
		
		CelulaNormal celulaNormal28 = new CelulaNormal();
		celulaNormal28.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal28.setBackground(new Color(255, 255, 255));
		celulaNormal28.setBounds(450, 400, 50, 50);
		painelJogo.add(celulaNormal28);
		
		CelulaNormal celulaNormal29 = new CelulaNormal();
		celulaNormal29.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal29.setBackground(new Color(255, 255, 255));
		celulaNormal29.setBounds(400, 450, 50, 50);
		painelJogo.add(celulaNormal29);
		
		CelulaNormal celulaNormal30 = new CelulaNormal();
		celulaNormal30.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal30.setBackground(new Color(255, 255, 255));
		celulaNormal30.setBounds(400, 500, 50, 50);
		painelJogo.add(celulaNormal30);
		
		CelulaNormal celulaNormal31 = new CelulaNormal();
		celulaNormal31.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal31.setBackground(new Color(255, 255, 255));
		celulaNormal31.setBounds(400, 550, 50, 50);
		painelJogo.add(celulaNormal31);
		
		CelulaSegura celulaSeguraAzul = new CelulaSegura();
		celulaSeguraAzul.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraAzul.setBackground(new Color(0, 0, 0));
		celulaSeguraAzul.setBounds(400, 600, 50, 50);
		painelJogo.add(celulaSeguraAzul);
		
		CelulaNormal celulaNormal32 = new CelulaNormal();
		celulaNormal32.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal32.setBackground(new Color(255, 255, 255));
		celulaNormal32.setBounds(400, 650, 50, 50);
		painelJogo.add(celulaNormal32);
		
		CelulaNormal celulaNormal33 = new CelulaNormal();
		celulaNormal33.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal33.setBackground(new Color(255, 255, 255));
		celulaNormal33.setBounds(400, 700, 50, 50);
		painelJogo.add(celulaNormal33);
		
		CelulaBidividida celulaMeioAzulInicio = new CelulaBidividida();
		celulaMeioAzulInicio.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioAzulInicio.setBackground(Color.BLUE);
		celulaMeioAzulInicio.setBounds(700, 350, 50, 50);
		painelJogo.add(celulaMeioAzulInicio);
		
		JPanel celulaMeioAzulFim = new JPanel();
		celulaMeioAzulFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioAzulFim.setBackground(Color.BLUE);
		celulaMeioAzulFim.setBounds(400, 400, 50, 50);
		painelJogo.add(celulaMeioAzulFim);
		
		CelulaFinal celulaFinalAzul1 = new CelulaFinal(0);
		celulaFinalAzul1.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAzul1.setBackground(Color.BLUE);
		celulaFinalAzul1.setBounds(650, 350, 50, 50);
		painelJogo.add(celulaFinalAzul1);
		celulaMeioAzulInicio.addCelula(celulaFinalAzul1);
		
		CelulaFinal celulaFinalAzul2 = new CelulaFinal(1);
		celulaFinalAzul2.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAzul2.setBackground(Color.BLUE);
		celulaFinalAzul2.setBounds(600, 350, 50, 50);
		painelJogo.add(celulaFinalAzul2);
		celulaMeioAzulInicio.addCelula(celulaFinalAzul2);
		
		CelulaFinal celulaFinalAzul3 = new CelulaFinal(2);
		celulaFinalAzul3.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAzul3.setBackground(Color.BLUE);
		celulaFinalAzul3.setBounds(550, 350, 50, 50);
		painelJogo.add(celulaFinalAzul3);
		celulaMeioAzulInicio.addCelula(celulaFinalAzul3);
		
		CelulaFinal celulaFinalAzul4 = new CelulaFinal(3);
		celulaFinalAzul4.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAzul4.setBackground(Color.BLUE);
		celulaFinalAzul4.setBounds(500, 350, 50, 50);
		painelJogo.add(celulaFinalAzul4);
		celulaMeioAzulInicio.addCelula(celulaFinalAzul4);
		
		CelulaFinal celulaFinalAzul5 = new CelulaFinal(4);
		celulaFinalAzul5.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAzul5.setBackground(Color.BLUE);
		celulaFinalAzul5.setBounds(450, 350, 50, 50);
		painelJogo.add(celulaFinalAzul5);
		celulaMeioAzulInicio.addCelula(celulaFinalAzul5);
		
		CelulaFinal celulaFinalAzul6 = new CelulaFinal(5);
		celulaFinalAzul6.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalAzul6.setBackground(Color.BLUE);
		celulaFinalAzul6.setBounds(400, 350, 50, 50);
		painelJogo.add(celulaFinalAzul6);
		celulaMeioAzulInicio.addCelula(celulaFinalAzul6);
		
		//-------------------------------------------------------------------------- FIM PARTE AZUL --------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------- INICIO PARTE VERMELHA --------------------------------------------------------------------------
		
		CelulaNormal celulaNormal34 = new CelulaNormal();
		celulaNormal34.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal34.setBackground(new Color(255, 255, 255));
		celulaNormal34.setBounds(300, 700, 50, 50);
		painelJogo.add(celulaNormal34);
		
		CelulaNormal celulaNormal35 = new CelulaNormal();
		celulaNormal35.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal35.setBackground(Color.RED);
		celulaNormal35.setBounds(300, 650, 50, 50);
		painelJogo.add(celulaNormal35);
		
		CelulaNormal celulaNormal36 = new CelulaNormal();
		celulaNormal36.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal36.setBackground(new Color(255, 255, 255));
		celulaNormal36.setBounds(300, 600, 50, 50);
		painelJogo.add(celulaNormal36);
		
		CelulaNormal celulaNormal37 = new CelulaNormal();
		celulaNormal37.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal37.setBackground(new Color(255, 255, 255));
		celulaNormal37.setBounds(300, 550, 50, 50);
		painelJogo.add(celulaNormal37);
		
		CelulaNormal celulaNormal38 = new CelulaNormal();
		celulaNormal38.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal38.setBackground(new Color(255, 255, 255));
		celulaNormal38.setBounds(300, 500, 50, 50);
		painelJogo.add(celulaNormal38);
		
		CelulaNormal celulaNormal39 = new CelulaNormal();
		celulaNormal39.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal39.setBackground(new Color(255, 255, 255));
		celulaNormal39.setBounds(300, 450, 50, 50);
		painelJogo.add(celulaNormal39);
		
		CelulaNormal celulaNormal40 = new CelulaNormal();
		celulaNormal40.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal40.setBackground(new Color(255, 255, 255));
		celulaNormal40.setBounds(250, 400, 50, 50);
		painelJogo.add(celulaNormal40);
		
		CelulaNormal celulaNormal41 = new CelulaNormal();
		celulaNormal41.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal41.setBackground(new Color(255, 255, 255));
		celulaNormal41.setBounds(200, 400, 50, 50);
		painelJogo.add(celulaNormal41);
		
		CelulaNormal celulaNormal42 = new CelulaNormal();
		celulaNormal42.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal42.setBackground(new Color(255, 255, 255));
		celulaNormal42.setBounds(150, 400, 50, 50);
		painelJogo.add(celulaNormal42);
		
		CelulaSegura celulaSeguraVermelha = new CelulaSegura();
		celulaSeguraVermelha.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaSeguraVermelha.setBackground(new Color(0, 0, 0));
		celulaSeguraVermelha.setBounds(100, 400, 50, 50);
		painelJogo.add(celulaSeguraVermelha);
		
		CelulaNormal celulaNormal43 = new CelulaNormal();
		celulaNormal43.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal43.setBackground(new Color(255, 255, 255));
		celulaNormal43.setBounds(50, 400, 50, 50);
		painelJogo.add(celulaNormal43);
		
		CelulaNormal celulaNormal44 = new CelulaNormal();
		celulaNormal44.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaNormal44.setBackground(new Color(255, 255, 255));
		celulaNormal44.setBounds(0, 400, 50, 50);
		painelJogo.add(celulaNormal44);
		
		CelulaBidividida celulaMeioVermelhaInicio = new CelulaBidividida();
		celulaMeioVermelhaInicio.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVermelhaInicio.setBackground(Color.RED);
		celulaMeioVermelhaInicio.setBounds(350, 700, 50, 50);
		painelJogo.add(celulaMeioVermelhaInicio);
		
		JPanel celulaMeioVermelhaFim = new JPanel();
		celulaMeioVermelhaFim.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaMeioVermelhaFim.setBackground(Color.RED);
		celulaMeioVermelhaFim.setBounds(300, 400, 50, 50);
		painelJogo.add(celulaMeioVermelhaFim);
		
		CelulaFinal celulaFinalVermelho1 = new CelulaFinal(0);
		celulaFinalVermelho1.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVermelho1.setBackground(Color.RED);
		celulaFinalVermelho1.setBounds(350, 650, 50, 50);
		painelJogo.add(celulaFinalVermelho1);
		celulaMeioVermelhaInicio.addCelula(celulaFinalVermelho1);
		
		CelulaFinal celulaFinalVermelho2 = new CelulaFinal(1);
		celulaFinalVermelho2.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVermelho2.setBackground(Color.RED);
		celulaFinalVermelho2.setBounds(350, 600, 50, 50);
		painelJogo.add(celulaFinalVermelho2);
		celulaMeioVermelhaInicio.addCelula(celulaFinalVermelho2);
		
		CelulaFinal celulaFinalVermelho3 = new CelulaFinal(2);
		celulaFinalVermelho3.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVermelho3.setBackground(Color.RED);
		celulaFinalVermelho3.setBounds(350, 550, 50, 50);
		painelJogo.add(celulaFinalVermelho3);
		celulaMeioVermelhaInicio.addCelula(celulaFinalVermelho3);
		
		CelulaFinal celulaFinalVermelho4 = new CelulaFinal(3);
		celulaFinalVermelho4.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVermelho4.setBackground(Color.RED);
		celulaFinalVermelho4.setBounds(350, 500, 50, 50);
		painelJogo.add(celulaFinalVermelho4);
		celulaMeioVermelhaInicio.addCelula(celulaFinalVermelho4);
		
		CelulaFinal celulaFinalVermelho5 = new CelulaFinal(4);
		celulaFinalVermelho5.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVermelho5.setBackground(Color.RED);
		celulaFinalVermelho5.setBounds(350, 450, 50, 50);
		painelJogo.add(celulaFinalVermelho5);
		celulaMeioVermelhaInicio.addCelula(celulaFinalVermelho5);
		
		CelulaFinal celulaFinalVermelho6 = new CelulaFinal(5);
		celulaFinalVermelho6.setBorder(new LineBorder(new Color(0, 0, 0)));
		celulaFinalVermelho6.setBackground(Color.RED);
		celulaFinalVermelho6.setBounds(350, 400, 50, 50);
		painelJogo.add(celulaFinalVermelho6);
		celulaMeioVermelhaInicio.addCelula(celulaFinalVermelho6);
		
		//-------------------------------------------------------------------------- FIM PARTE VERMELHO --------------------------------------------------------------------------

		//-------------------------------------------------------------------------- INICIO PARTE MEIO --------------------------------------------------------------------------
		JPanel celulaDado = new CelulaNormal();
		celulaDado.setBackground(new Color(255, 255, 255));
		celulaDado.setBounds(350, 350, 50, 50);
		painelJogo.add(celulaDado);
		celulaDado.setLayout(null);
		
		JLabel lblRolagem = new JLabel("6");
		lblRolagem.setBounds(0, 0, 50, 50);
		celulaDado.add(lblRolagem);
		lblRolagem.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblRolagem.setHorizontalAlignment(SwingConstants.CENTER);
		//-------------------------------------------------------------------------- FIM PARTE MEIO --------------------------------------------------------------------------
		
		
		
		//-------------------------------------------------------------------------- INICIO BASE VERDE --------------------------------------------------------------------------
		
		JPanel baseVerde = new JPanel();
		baseVerde.setLayout(null);
		baseVerde.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseVerde.setBackground(Color.GREEN);
		baseVerde.setBounds(0, 0, 300, 300);
		painelJogo.add(baseVerde);
		
		JPanel subBaseVerde = new JPanel();
		subBaseVerde.setLayout(null);
		subBaseVerde.setBounds(35, 39, 230, 230);
		baseVerde.add(subBaseVerde);
		String caminhoVerde = "src/imagem/peao verde.jpg";
		JPanelCircular peao1Verde = new JPanelCircular(55, Color.GREEN, caminhoVerde);
		peao1Verde.setBounds(21, 15, 55, 55);
		subBaseVerde.add(peao1Verde);

		JPanelCircular peao2Verde = new JPanelCircular(55, Color.GREEN, caminhoVerde);
		peao2Verde.setBounds(158, 13, 55, 55);
		subBaseVerde.add(peao2Verde);
		
		JPanelCircular peao3Verde = new JPanelCircular(55, Color.GREEN, caminhoVerde);
		peao3Verde.setBounds(20, 161, 55, 55);
		subBaseVerde.add(peao3Verde);
		
		JPanelCircular peao4Verde = new JPanelCircular(55, Color.GREEN, caminhoVerde);
		peao4Verde.setBounds(158, 161, 55, 55);
		subBaseVerde.add(peao4Verde);
		
		//-------------------------------------------------------------------------- FIM BASE VERDE --------------------------------------------------------------------------

		//-------------------------------------------------------------------------- INICIO BASE AMARELA --------------------------------------------------------------------------
		
		JPanel baseAmarela = new JPanel();
		baseAmarela.setLayout(null);
		baseAmarela.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseAmarela.setBackground(Color.YELLOW);
		baseAmarela.setBounds(450, 0, 300, 300);
		painelJogo.add(baseAmarela);
		
		JPanel subBaseAmarela = new JPanel();
		subBaseAmarela.setLayout(null);
		subBaseAmarela.setBounds(35, 39, 230, 230);
		baseAmarela.add(subBaseAmarela);
		String caminhoAmarelo = "src/imagem/peao amarelo.jpg";
		JPanelCircular peao1Amarela = new JPanelCircular(55, Color.YELLOW, caminhoAmarelo);
		peao1Amarela.setBounds(21, 15, 55, 55);
		subBaseAmarela.add(peao1Amarela);
		
		JPanelCircular peao2Amarela = new JPanelCircular(55, Color.YELLOW, caminhoAmarelo);
		peao2Amarela.setBounds(158, 13, 55, 55);
		subBaseAmarela.add(peao2Amarela);
		
		JPanelCircular peao3Amarela = new JPanelCircular(55, Color.YELLOW, caminhoAmarelo);
		peao3Amarela.setBounds(20, 161, 55, 55);
		subBaseAmarela.add(peao3Amarela);
		
		JPanelCircular peao4Amarela = new JPanelCircular(55, Color.YELLOW, caminhoAmarelo);
		peao4Amarela.setBounds(158, 161, 55, 55);
		subBaseAmarela.add(peao4Amarela);
		
		//-------------------------------------------------------------------------- FIM BASE AMARELA --------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------- INICIO BASE AZUL --------------------------------------------------------------------------
		
		JPanel baseAazul = new JPanel();
		baseAazul.setLayout(null);
		baseAazul.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseAazul.setBackground(Color.BLUE);
		baseAazul.setBounds(450, 450, 300, 300);
		painelJogo.add(baseAazul);
		
		JPanel subBaseAazul = new JPanel();
		subBaseAazul.setLayout(null);
		subBaseAazul.setBounds(35, 39, 230, 230);
		baseAazul.add(subBaseAazul);
		
		String caminhoAzul = "src/imagem/peao azul.jpg";

		JPanelCircular peao1Azul = new JPanelCircular(55, Color.BLUE, caminhoAzul);
		peao1Azul.setBounds(21, 15, 55, 55);
		subBaseAazul.add(peao1Azul);
		
		JPanelCircular peao2Azul = new JPanelCircular(55, Color.BLUE, caminhoAzul);
		peao2Azul.setBounds(158, 13, 55, 55);
		subBaseAazul.add(peao2Azul);
		
		JPanelCircular peao3Azul = new JPanelCircular(55, Color.BLUE, caminhoAzul);
		peao3Azul.setBounds(20, 161, 55, 55);
		subBaseAazul.add(peao3Azul);
		
		JPanelCircular peao4Azul = new JPanelCircular(55, Color.BLUE, caminhoAzul);
		peao4Azul.setBounds(158, 161, 55, 55);
		subBaseAazul.add(peao4Azul);
		
		//-------------------------------------------------------------------------- FIM BASE AZUL --------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------- INICIO BASE VERMELHA --------------------------------------------------------------------------
		JPanel baseVermelha = new JPanel();
		baseVermelha.setLayout(null);
		baseVermelha.setBorder(new LineBorder(new Color(0, 0, 0)));
		baseVermelha.setBackground(Color.RED);
		baseVermelha.setBounds(0, 450, 300, 300);
		painelJogo.add(baseVermelha);
		
		JPanel subBaseVermelha = new JPanel();
		subBaseVermelha.setLayout(null);
		subBaseVermelha.setBounds(35, 39, 230, 230);
		baseVermelha.add(subBaseVermelha);
		
		String caminhoVermelho = "src/imagem/peao vermelho.jpg";

		JPanelCircular peao1Vermelho = new JPanelCircular(300, Color.RED, caminhoVermelho);
		peao1Vermelho.setBounds(21, 15, 55, 55);
		subBaseVermelha.add(peao1Vermelho);
		
		JPanelCircular peao3Vermelho = new JPanelCircular(300, Color.RED, caminhoVermelho);
		peao3Vermelho.setBounds(20, 161, 55, 55);
		subBaseVermelha.add(peao3Vermelho);
		
		JPanelCircular peao4Vermelho = new JPanelCircular(300, Color.RED, caminhoVermelho);
		peao4Vermelho.setBounds(158, 161, 55, 55);
		subBaseVermelha.add(peao4Vermelho);
		
		JPanelCircular peao2Vermelho = new JPanelCircular(300, Color.RED, caminhoVermelho);
		peao2Vermelho.setBounds(158, 13, 55, 55);
		subBaseVermelha.add(peao2Vermelho);
		
		//-------------------------------------------------------------------------- FIM BASE VERMELHA --------------------------------------------------------------------------
		
		//-------------------------------------------------------------------------- INICIO CONSTRUÇÃO CAMINHO --------------------------------------------------------------------------
		
		celulas.add(celulaNormal01); celulaNormal01.setPosicao(0); celulaNormal01.setCelulaSeguinte(celulaNormal02);
		celulas.add(celulaNormal02); celulaNormal02.setPosicao(1); celulaNormal02.setCelulaSeguinte(celulaNormal03);
		celulas.add(celulaNormal03); celulaNormal03.setPosicao(2); celulaNormal03.setCelulaSeguinte(celulaNormal04);
		celulas.add(celulaNormal04); celulaNormal04.setPosicao(3); celulaNormal04.setCelulaSeguinte(celulaNormal05);
		celulas.add(celulaNormal05); celulaNormal05.setPosicao(4); celulaNormal05.setCelulaSeguinte(celulaNormal06);
		celulas.add(celulaNormal06); celulaNormal06.setPosicao(5); celulaNormal06.setCelulaSeguinte(celulaNormal07);
		celulas.add(celulaNormal07); celulaNormal07.setPosicao(6); celulaNormal07.setCelulaSeguinte(celulaNormal08);
		celulas.add(celulaNormal08); celulaNormal08.setPosicao(7); celulaNormal08.setCelulaSeguinte(celulaNormal09);
		celulas.add(celulaNormal09); celulaNormal09.setPosicao(8); celulaNormal09.setCelulaSeguinte(celulaSeguraVerde);
		celulas.add(celulaSeguraVerde); celulaSeguraVerde.setPosicao(9); celulaSeguraVerde.setCelulaSeguinte(celulaNormal10);
		celulas.add(celulaNormal10); celulaNormal10.setPosicao(10); celulaNormal10.setCelulaSeguinte(celulaNormal11);
		celulas.add(celulaNormal11); celulaNormal11.setPosicao(11); celulaNormal11.setCelulaSeguinte(celulaMeiaAmarelaInicio);
		celulas.add(celulaMeiaAmarelaInicio); celulaMeiaAmarelaInicio.setPosicao(12); celulaMeiaAmarelaInicio.setCelulaSeguinte(celulaNormal12);
		celulas.add(celulaNormal12); celulaNormal12.setPosicao(13); celulaNormal12.setCelulaSeguinte(celulaNormal13);
		celulas.add(celulaNormal13); celulaNormal13.setPosicao(14); celulaNormal13.setCelulaSeguinte(celulaNormal14); 
		celulas.add(celulaNormal14); celulaNormal14.setPosicao(15); celulaNormal14.setCelulaSeguinte(celulaNormal15);
		celulas.add(celulaNormal15); celulaNormal15.setPosicao(16); celulaNormal15.setCelulaSeguinte(celulaNormal16);
		celulas.add(celulaNormal16); celulaNormal16.setPosicao(17); celulaNormal16.setCelulaSeguinte(celulaNormal17);
		celulas.add(celulaNormal17); celulaNormal17.setPosicao(18); celulaNormal17.setCelulaSeguinte(celulaNormal18); 
		celulas.add(celulaNormal18); celulaNormal18.setPosicao(19); celulaNormal18.setCelulaSeguinte(celulaNormal19);
		celulas.add(celulaNormal19); celulaNormal19.setPosicao(20); celulaNormal19.setCelulaSeguinte(celulaNormal20);
		celulas.add(celulaNormal20); celulaNormal20.setPosicao(21); celulaNormal20.setCelulaSeguinte(celulaSeguraAmarelo);
		celulas.add(celulaSeguraAmarelo); celulaSeguraAmarelo.setPosicao(22); celulaSeguraAmarelo.setCelulaSeguinte(celulaNormal21);
		celulas.add(celulaNormal21); celulaNormal21.setPosicao(23); celulaNormal21.setCelulaSeguinte(celulaNormal22);
		celulas.add(celulaNormal22); celulaNormal22.setPosicao(24); celulaNormal22.setCelulaSeguinte(celulaMeioAzulInicio);
		celulas.add(celulaMeioAzulInicio); celulaMeioAzulInicio.setPosicao(25); celulaMeioAzulInicio.setCelulaSeguinte(celulaNormal23);
		celulas.add(celulaNormal23); celulaNormal23.setPosicao(26); celulaNormal23.setCelulaSeguinte(celulaNormal24);
		celulas.add(celulaNormal24); celulaNormal24.setPosicao(27); celulaNormal24.setCelulaSeguinte(celulaNormal25);
		celulas.add(celulaNormal25); celulaNormal25.setPosicao(28); celulaNormal25.setCelulaSeguinte(celulaNormal26);
		celulas.add(celulaNormal26); celulaNormal26.setPosicao(29); celulaNormal26.setCelulaSeguinte(celulaNormal27);
		celulas.add(celulaNormal27); celulaNormal27.setPosicao(30); celulaNormal27.setCelulaSeguinte(celulaNormal28);
		celulas.add(celulaNormal28); celulaNormal28.setPosicao(31); celulaNormal28.setCelulaSeguinte(celulaNormal29);
		celulas.add(celulaNormal29); celulaNormal29.setPosicao(32); celulaNormal29.setCelulaSeguinte(celulaNormal30);
		celulas.add(celulaNormal30); celulaNormal30.setPosicao(33); celulaNormal30.setCelulaSeguinte(celulaNormal31);
		celulas.add(celulaNormal31); celulaNormal31.setPosicao(34); celulaNormal31.setCelulaSeguinte(celulaSeguraAzul);
		celulas.add(celulaSeguraAzul); celulaSeguraAzul.setPosicao(35); celulaSeguraAzul.setCelulaSeguinte(celulaNormal32);
		celulas.add(celulaNormal32); celulaNormal32.setPosicao(36); celulaNormal32.setCelulaSeguinte(celulaNormal33);
		celulas.add(celulaNormal33); celulaNormal33.setPosicao(37); celulaNormal33.setCelulaSeguinte(celulaMeioVermelhaInicio);
		celulas.add(celulaMeioVermelhaInicio); celulaMeioVermelhaInicio.setPosicao(38); celulaMeioVermelhaInicio.setCelulaSeguinte(celulaNormal34);
		celulas.add(celulaNormal34); celulaNormal34.setPosicao(39); celulaNormal34.setCelulaSeguinte(celulaNormal35);
		celulas.add(celulaNormal35); celulaNormal35.setPosicao(40); celulaNormal35.setCelulaSeguinte(celulaNormal36);
		celulas.add(celulaNormal36); celulaNormal36.setPosicao(41); celulaNormal36.setCelulaSeguinte(celulaNormal37);
		celulas.add(celulaNormal37); celulaNormal37.setPosicao(42); celulaNormal37.setCelulaSeguinte(celulaNormal38);
		celulas.add(celulaNormal38); celulaNormal38.setPosicao(43); celulaNormal38.setCelulaSeguinte(celulaNormal39);
		celulas.add(celulaNormal39); celulaNormal39.setPosicao(44); celulaNormal39.setCelulaSeguinte(celulaNormal40);
		celulas.add(celulaNormal40); celulaNormal40.setPosicao(45); celulaNormal40.setCelulaSeguinte(celulaNormal41);
		celulas.add(celulaNormal41); celulaNormal41.setPosicao(46); celulaNormal41.setCelulaSeguinte(celulaNormal42);
		celulas.add(celulaNormal42); celulaNormal42.setPosicao(47); celulaNormal42.setCelulaSeguinte(celulaSeguraVermelha);
		celulas.add(celulaSeguraVermelha); celulaSeguraVermelha.setPosicao(48); celulaSeguraVermelha.setCelulaSeguinte(celulaNormal43);
		celulas.add(celulaNormal43); celulaNormal43.setPosicao(49); celulaNormal43.setCelulaSeguinte(celulaNormal44);
		celulas.add(celulaNormal44); celulaNormal44.setPosicao(50); celulaNormal44.setCelulaSeguinte(celulaMeioVerdeInicio);
		celulas.add(celulaMeioVerdeInicio); celulaMeioVerdeInicio.setPosicao(51); celulaMeioVerdeInicio.setCelulaSeguinte(celulaNormal01);
		
		
		//-------------------------------------------------------------------------- FIM CONSTRUÇÃO CAMINHO--------------------------------------------------------------------------
		
		JPanel painelDivisa = new JPanel();
		painelDivisa.setBounds(750, 33, 10, 750);
		getContentPane().add(painelDivisa);
		painelDivisa.setBackground(new Color(75, 101, 173));
		
		JPanel painelInteracao = new JPanel();
		painelInteracao.setBounds(760, 33, 324, 750);
		getContentPane().add(painelInteracao);
		painelInteracao.setLayout(null);
		
		JTextArea textArea = new JTextArea("Rolagens:\n");
		textArea.setEditable(false);
		textArea.setBounds(20, 73, 276, 650);
		painelInteracao.add(textArea);
		
		JScrollPane barra = new JScrollPane(textArea);
		barra.setBounds(20, 73, 276, 650);
		painelInteracao.add(barra);
		
		Random dado = new Random();
		contador = 0;
		JButton btnRolarDado = new JButton("Rolar Dados");
		btnRolarDado.setBounds(10, 11, 170, 52);
		painelInteracao.add(btnRolarDado);
		btnRolarDado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int rolagem = dado.nextInt(6) + 1;
					textArea.append(rolagem + "\n");
					lblRolagem.setText(Integer.toString(rolagem));
					for(;rolagem != 0 ; rolagem-- ) {
						esconderPeao(celulas.get(contador));
						mostrarPeao(celulas.get(contador).getCelulaSeguinte());
						contador++;
						if(!(contador < celulas.size()))
							contador = 0;
					}
					
				} catch (Exception e2) {
					System.out.println("Não moveu");
				}
				
				
			}
		});
		
	}
	
	public void mostrarPeao(JPanel celula) {
		((CelulaNormal) celula).setExibirImagem(true);
		
	}
	
	public void esconderPeao(JPanel celula) {
		((CelulaNormal) celula).setExibirImagem(false);
	}
	
}