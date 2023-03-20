package jogo;

public class Peao {
	private String cor;
	private int linha;
	private int coluna;
	
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
}
