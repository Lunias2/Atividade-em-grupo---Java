package jogo;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

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
		
		System.out.print("\n\nOrdem dos peoes a rolar o dado:");
		Queue<Integer> filaTemp = new LinkedList<Integer>(fila);
        while (!filaTemp.isEmpty()) {
            int elemento = filaTemp.remove();
            System.out.printf(" %5s",elemento - 1);
        }
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

		while(!jogo.temosVencedor()) {
			filaTemp = new LinkedList<Integer>(fila);
			while (!filaTemp.isEmpty()) {
				int elemento = filaTemp.remove();
				jogo.moverPecaLista(elemento -1);
				jogo.mostrarCelulas();
			}
		}
		
		
		
		
//		int cont = 0;
//		while(!jogo.temosVencedor()) {
//			if(cont == 8)
//				cont = 0;
//			jogo.moverPecaLista(cont);
//			cont++;
//			jogo.mostrarCelulas();
//			
//		}
		
		System.out.println("\n\n!!!!Parabens vencedor do jogo: [" + jogo.getVencedor() + "]!!!!");
	}
	
	
}