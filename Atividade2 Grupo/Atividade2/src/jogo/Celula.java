package jogo;

import java.util.ArrayList;

public class Celula {
	
	private Celula celulaSeguinte;
	private ArrayList<Peao> peoes;
	private int posicao;
	private int linha;
	private int coluna;
	private boolean isCelulafinal;
	
	
	public Celula() {
		peoes = new ArrayList<>();
		
	}
	
	public Celula(int posicao, int linha, int coluna) {
		this.posicao = posicao;
		this.linha = linha;
		this.coluna = coluna;
		peoes = new ArrayList<>();
		celulaSeguinte = null;
	}
	
	
	public boolean verificaPeao(Peao peao) {
		if( peoes.isEmpty() || ( (peoes.get(0).getCor().equals(peao.getCor())) && peoes.size() < 4 ) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addPeao(Peao peao) {
		if(!peoes.contains(peao))
			peoes.add(peao);
	}
	
	public boolean removePeao(Peao peao) {
		peoes.remove(peao);
		return true;
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
	 * @return the celulaSeguinte
	 */
	public Celula getCelulaSeguinte() {
		return celulaSeguinte;
	}

	/**
	 * @param celulaSeguinte the celulaSeguinte to set
	 */
	public void setCelulaSeguinte(Celula celulaSeguinte) {
		this.celulaSeguinte = celulaSeguinte;
	}

	/**
	 * @return the isCelulafinal
	 */
	public boolean isCelulafinal() {
		return isCelulafinal;
	}

	/**
	 * @param isCelulafinal the isCelulafinal to set
	 */
	public void setCelulafinal(boolean isCelulafinal) {
		this.isCelulafinal = isCelulafinal;
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
