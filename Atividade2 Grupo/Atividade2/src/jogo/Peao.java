package jogo;

public class Peao {
	private String cor;
	private int posicao;
	
	/**
	 * @param cor
	 * @param linha
	 * @param coluna
	 */
	public Peao(String cor, int posicao) {
		this.cor = cor;
		this.posicao = posicao;
	}

	/**
	 * 
	 */
	public Peao() {
	}

	/**
	 * @return the posicao
	 */
	public int getPosicao() {
		return posicao;
	}

	/**
	 * @param posicao the posicao to set
	 */
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

}
