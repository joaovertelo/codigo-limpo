package br.com.groupsoftware.codigo.limpo;

import java.util.Arrays;
import java.util.List;

public class BaralhoUtil {

	private BaralhoUtil() {

	}

	protected static final List<String> cartas = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
			"K", "A");
	protected static final String[] naipes = { "Hearts", "Clubs", "Spades", "Diamonds" };

	public static int getPesoCarta(String numero) {
		return cartas.indexOf(numero);
	}

}
