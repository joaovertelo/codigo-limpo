package br.com.groupsoftware.codigo.limpo;

public enum JogadaEnum {
	ROYAL(10), STRAIGHTFLUSH(9), QUADRA(8), FULLHOUSE(7), FLUSH(6), STRAIGHT(5), TRINCA(4), DOISPARES(3), PAR(
			2), CARTAALTA(1);

	JogadaEnum(int peso) {
		this.peso = peso;
	}

	private int peso;

	public int getPeso() {
		return peso;
	}

}
