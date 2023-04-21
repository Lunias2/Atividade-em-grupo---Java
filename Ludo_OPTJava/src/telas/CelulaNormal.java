package telas;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import jogo.Peao;

public class CelulaNormal extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3053319162089410039L;
	private CelulaNormal celulaSeguinte;
	private ArrayList<Peao> peoes;
	private int posicao;
	private boolean isCelulafinal;
	private String cor;
	private boolean exibirImagem;
	
	
	
	public CelulaNormal() {
		peoes = new ArrayList<>();
		celulaSeguinte = null;
		this.exibirImagem = false;
		
		addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	try {
	    			setExibirImagem(false);
	        		celulaSeguinte.setExibirImagem(true);
				} catch (Exception e2) {
					// TODO: handle exception
				}
            	
            }
        });
		
	}
	
	public CelulaNormal(int posicao) {
		this.posicao = posicao;
		peoes = new ArrayList<>();
		celulaSeguinte = null;
		this.exibirImagem = false;
	}
	
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(this.exibirImagem) {
        	try {
        		// Carrega a imagem a partir de um arquivo
        		BufferedImage imagem = ImageIO.read(new File("src/imagem/peao verde.jpg"));
        		
        		// Desenha a imagem no fundo do painel
        		g.drawImage(imagem, 0, 0, getWidth(), getHeight(), null);
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        }
    }
	/**
	 * @return the celulaSeguinte
	 */
	public CelulaNormal getCelulaSeguinte() {
		return celulaSeguinte;
	}

	/**
	 * @return the peoes
	 */
	public ArrayList<Peao> getPeoes() {
		return peoes;
	}

	/**
	 * @return the posicao
	 */
	public int getPosicao() {
		return posicao;
	}

	/**
	 * @return the isCelulafinal
	 */
	public boolean isCelulafinal() {
		return isCelulafinal;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param celulaSeguinte the celulaSeguinte to set
	 */
	public void setCelulaSeguinte(CelulaNormal celulaSeguinte) {
		this.celulaSeguinte = celulaSeguinte;
	}

	/**
	 * @param peoes the peoes to set
	 */
	public void setPeoes(ArrayList<Peao> peoes) {
		this.peoes = peoes;
	}

	/**
	 * @param posicao the posicao to set
	 */
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	/**
	 * @param isCelulafinal the isCelulafinal to set
	 */
	public void setCelulafinal(boolean isCelulafinal) {
		this.isCelulafinal = isCelulafinal;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the exibirImagem
	 */
	public boolean isExibirImagem() {
		return exibirImagem;
	}

	/**
	 * @param exibirImagem the exibirImagem to set
	 */
	public void setExibirImagem(boolean exibirImagem) {
		this.exibirImagem = exibirImagem;
		repaint();
	}
	
	
}
