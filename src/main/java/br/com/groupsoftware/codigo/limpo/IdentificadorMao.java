package br.com.groupsoftware.codigo.limpo;

import java.util.List;

public class IdentificadorMao {

	public JogadaEnum identificarMao(List<Carta> cartas) {

		return JogadaEnum.CARTAALTA;
	}

	public boolean isFlush(List<Carta> cartas) {
		Boolean isNaipesIguais = true;
		for (Carta cartaA : cartas) {
			for (Carta cartaB : cartas) {
				if (!cartaA.getNaipe().equals(cartaB.getNaipe())) {
					isNaipesIguais = false;
					break;
				}
			}
		}

		return isNaipesIguais;
	}

	public boolean isStraight(List<Carta> cartas) {

		int indexFirst = 0;
		for (int i = 0; i < cartas.size(); i++) {
			if (i == 0) {
				indexFirst = BaralhoUtil.getPesoCarta(cartas.get(0).getNumero());
				continue;
			}

			if ((indexFirst + 1) != BaralhoUtil.getPesoCarta(cartas.get(i).getNumero())) {
				return false;
			}
			indexFirst++;
		}

		return true;
	}

	public boolean isRoyalFlush(List<Carta> cartas) {
		return isStraightFlush(cartas) && BaralhoUtil.getPesoCarta(cartas.get(0).getNumero()) == 8;
	}

	public boolean isStraightFlush(List<Carta> cartas) {
		return isFlush(cartas) && isStraight(cartas);
	}

}
