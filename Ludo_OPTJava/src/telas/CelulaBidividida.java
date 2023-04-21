package telas;

import java.util.LinkedList;


public class CelulaBidividida extends CelulaNormal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7050243595469127894L;
	private LinkedList<CelulaFinal> caminho;
	private int posicao2;

	/**
	 * @param posicao
	 */
	public CelulaBidividida(int posicao) {
		super(posicao);
		this.caminho = new LinkedList<>();
	}

	/**
	 * 
	 */
	public CelulaBidividida() {
		super();
		this.caminho = new LinkedList<>();
	}
	
	public void addCelula(CelulaFinal celula) {
		this.caminho.add(celula);
	}

	/**
	 * @return the caminho
	 */
	public LinkedList<CelulaFinal> getCaminho() {
		return caminho;
	}

	/**
	 * @param caminho the caminho to set
	 */
	public void setCaminho(LinkedList<CelulaFinal> caminho) {
		this.caminho = caminho;
	}

	/**
	 * @return the posicao2
	 */
	public int getPosicao2() {
		return posicao2;
	}

	/**
	 * @param posicao2 the posicao2 to set
	 */
	public void setPosicao2(int posicao2) {
		this.posicao2 = posicao2;
	}
	

}
