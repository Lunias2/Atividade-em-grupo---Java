package jogo;

public class Peao {
	private String cor;
	private int linha;
	private int coluna;
	private int posicao;
	
	/**
	 * @param cor
	 * @param linha
	 * @param coluna
	 */
	public Peao(String cor, int linha, int coluna) {
		this.cor = cor;
		this.linha = linha;
		this.coluna = coluna;
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
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}

	/**
	 * @return the coluna
	 */
	public int getColuna() {
		return coluna;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @param linha the linha to set
	 */
	public void setLinha(int linha) {
		this.linha = linha;
	}

	/**
	 * @param coluna the coluna to set
	 */
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
}
