package br.com.groupsoftware.codigo.limpo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeradorMao {

	List<Carta> cartasSorteadas = new ArrayList<Carta>();

	public Mao gerarMao(Jogador jogador) {
		Mao mao = new Mao();
		List<Carta> cartasDaMao = new ArrayList<Carta>();
		int contador = 0;
		while (contador < 5) {
			Carta carta = gerarCarta();

			if (!cartasSorteadas.contains(carta)) {
				cartasSorteadas.add(carta);
				cartasDaMao.add(carta);
				contador++;
			}
		}
		Collections.sort(cartasDaMao);
		mao.setCartas(cartasDaMao);
		return mao;
	}

	public Carta gerarCarta() {
		Random r = new Random();
		return new Carta(BaralhoUtil.cartas.get(r.nextInt(12)), BaralhoUtil.naipes[r.nextInt(3)]);

	}

}
