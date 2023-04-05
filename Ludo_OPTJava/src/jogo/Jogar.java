package jogo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Jogar {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.iniciarJogoLista();
		Queue<Integer> fila = new LinkedList<Integer>();
		Random dado = new Random();
		 
		while(fila.size() != 8) {
			Integer rolagem = dado.nextInt(8) + 1;
			if(fila.isEmpty() || !fila.contains(rolagem))
				fila.add(rolagem);
		}
		Queue<Integer> filaTemp;
		filaTemp = new LinkedList<Integer>(fila);
        while (!filaTemp.isEmpty()) {
            int elemento = filaTemp.remove();
            System.out.printf(" %5s",elemento - 1);
        }
        System.out.println("\n");

		while(!jogo.temosVencedor()) {
			filaTemp = new LinkedList<Integer>(fila);
			while (!filaTemp.isEmpty()) {
				int elemento = filaTemp.remove();
				jogo.moverPecaLista(elemento -1);
				jogo.mostrarCelulas();
			}
		}
		System.out.println("\n\n!!!!Parabens vencedor do jogo: [" + jogo.getVencedor() + "]!!!!");
		System.out.print("\n\nOrdem dos peoes a rolar o dado:");
		filaTemp = new LinkedList<Integer>(fila);
        while (!filaTemp.isEmpty()) {
            int elemento = filaTemp.remove();
            System.out.printf(" %5s",elemento - 1);
        }
        System.out.println("\n");
	}
	
	
}