package celulas;

import java.awt.Color;
import java.util.ArrayList;

import jogo.Peao;

public class Celula {
	
	private Celula celulaSeguinte;
	private ArrayList<Peao> peoes;
	private int posicao;
	private boolean isCelulafinal;
	private String cor;
	
	
	public Celula() {
		peoes = new ArrayList<>();
		
	}
	
	public Celula(int posicao) {
		this.posicao = posicao;
		peoes = new ArrayList<>();
		celulaSeguinte = null;
	}
	
	public Celula(int posicao, String cor) {
		this.cor = cor;
		this.posicao = posicao;
		peoes = new ArrayList<>();
		celulaSeguinte = null;
	}
	
	/**
	 * Verifica se é possivel adicionar o @param peao nesta celula
	 * Se o arraylist de peoes estiver vazio é possível
	 * Se o @param peão tiver a mesma cor que os outros peoes é possível também
	 * */
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
	 * @param peoes the peoes to set
	 */
	public void setPeoes(ArrayList<Peao> peoes) {
		this.peoes = peoes;
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
	 * @return the posicao
	 */
	public int getPosicao() {
		return posicao;
	}

	/**
	 * @param coluna the coluna to set
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
