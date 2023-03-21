package jogo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.LinkedList;

public class Jogo {
	private ArrayList<Peao> peoes;
	private String vencedor;
	private LinkedList<Celula> celulas;
	
	
	public Jogo() {
		peoes = new ArrayList<>();
		vencedor = null;
		celulas = new LinkedList<>();
	}
	

	public void iniciarJogoLista() {
		int cont = 0;
		Celula[][] auxiliar = new Celula[4][14];
		for(int i = 0; i < 4; i++) {
			for( int j = 0; j < 14; j++) {
				Celula celula = new Celula(cont, i, j);
				auxiliar[i][j] = celula;
				cont++;
			}
		}
		for(int i = 0; i < 4; i++) {
			for( int j = 0; j < 14; j++) {
				celulas.add(auxiliar[i][j]);
			}
		}
		celulas.get(celulas.size() - 1).setCelulafinal(true);
		
		for(int i = 0; i < 4; i++) {
			Peao aux = new Peao("Vermelho", 0, 0);
			peoes.add(aux);
		}

		for(int i = 0; i < 4; i++) {
			Peao aux = new Peao("Azul", 0, 0);
			peoes.add(aux);
		}
		
		for(int i = 0; i < 8; i++) {
			celulas.get(0).addPeao(peoes.get(i));
			peoes.get(i).setPosicao(0);
		}
		mostrarCelulas();
	}
	
	public void moverPecaLista(int index) {
		if(!celulas.get(peoes.get(index).getPosicao()).isCelulafinal()) {
			int movimento = rolarDado();
			System.out.println("Peao [" + index + "] rolou [" + movimento + "]");
			Peao peaoAuxiliar = peoes.get(index);
			Celula celulaMovimento = null;
			Iterator<Celula> celulasIterator = celulas.iterator();
			int cont = 0;
			while(cont != peaoAuxiliar.getPosicao()) {
				celulasIterator.next();
				cont++;
			}
				
			
			for(int i = 0; i < movimento && celulasIterator.hasNext(); i++ ) {
				celulaMovimento = celulasIterator.next();
			}
			if(celulaMovimento.verificaPeao(peaoAuxiliar)) {
				celulas.get(peaoAuxiliar.getPosicao()).removePeao(peaoAuxiliar);
				celulaMovimento.addPeao(peaoAuxiliar);
				atualizarPeao(celulaMovimento.getLinha(), celulaMovimento.getColuna(), celulaMovimento.getPosicao(), peaoAuxiliar);
				System.out.println("Peao [" + index + "] andou [" + movimento + "] casas");
			} else {
				celulas.get(peaoAuxiliar.getPosicao()).removePeao(peaoAuxiliar);
				celulas.get(0).addPeao(peaoAuxiliar);
				atualizarPeao(0, 0, 0, peaoAuxiliar);
				System.out.println("Peao [" + index + "] voltou para o inicio :c");
			}
		} else {
			System.out.println("Peao [" + index + "] esta na última casa!");
			return;
		}
			
		
	}
	
	public void atualizarPeao(int linha, int coluna, int posicao, Peao peao) {
		peao.setLinha(linha);
		peao.setColuna(coluna);
		peao.setPosicao(posicao);
	}
	
	
	public int rolarDado() {
		Random dado = new Random();
		return dado.nextInt(6) + 1;
	}

	
	public void mostrarCelulas() {
		Iterator<Celula> iterator = celulas.iterator();
		int cont = 0;
		while(iterator.hasNext()) {
			System.out.printf(" %5s" , iterator.next().getPeoes().size());
			cont++;
			if(cont == 14) {
				cont = 0;
				System.out.println();
			}
		}
		
		Iterator<Peao> peoesIterator = peoes.iterator();
		cont = 0;
		while(peoesIterator.hasNext()) {
			Peao auxiliar = peoesIterator.next();
			System.out.println("Peao [" + cont + "] esta na posicao [" + auxiliar.getLinha() + "][" + auxiliar.getColuna() + "]");
			cont++;
		}
	}
	
	

	/**
	 * @return the vencedor
	 */
	public String getVencedor() {
		return vencedor;
	}
	
	
	public boolean temosVencedor() {
		if(celulas.get(celulas.size() -1).getPeoes().size() == 4) {
			this.vencedor = celulas.get(celulas.size() -1).getPeoes().get(0).getCor();
			return true;
		} else 
			return false;
			
	}
	
}
