package br.com.groupsoftware.codigo.limpo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorMao {

	private String[] cartas = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private String[] naipes = { "Hearts", "Clubs", "Spades", "Diamonds" };
	List<Carta> cartasSorteadas = new ArrayList<Carta>();

	public Mao gerarMao(Jogador jogador) {
		Mao mao = new Mao();
		mao.setJogador(jogador);
		List<Carta> cartas = new ArrayList<Carta>();
		int contador = 0;
		while (contador < 5) {
			Carta carta = gerarCarta();

			if (cartasSorteadas.contains(carta)) {
				cartasSorteadas.add(carta);
				contador++;
			}
		}

		mao.setCartas(cartas);
		return mao;
	}

	public Carta gerarCarta() {
		Random r = new Random();
		return new Carta(cartas[r.nextInt(13)], naipes[r.nextInt(4)]);

	}

}
