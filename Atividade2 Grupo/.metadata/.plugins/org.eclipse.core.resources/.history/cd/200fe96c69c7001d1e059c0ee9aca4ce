package jogo;

public class Jogar {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.iniciarJogo();
		int cont = 0;
		int index = 0;
		jogo.mostrarTabuleiro();
		while(!jogo.fimDeJogo()) {
			if(index == 8)
				index = 0;
			System.out.println();
			jogo.moverPeca(index);
			cont++;
			index++;
			jogo.mostrarTabuleiro();
		}
		
		System.out.println("\n\n!!!!Parabens vencedor do jogo: [" + jogo.getVencedor() + "]!!!!");
	}
}