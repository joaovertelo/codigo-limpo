package br.com.groupsoftware.codigo.limpo;

public class Carta implements Comparable<Carta> {

	private String numero;
	private String naipe;

	public Carta(String numero, String naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naipe == null) ? 0 : naipe.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (naipe == null) {
			if (other.naipe != null)
				return false;
		} else if (!naipe.equals(other.naipe))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + numero + naipe + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public int compareTo(Carta o) {
		return new Integer(BaralhoUtil.cartas.indexOf(this.numero))
				.compareTo(new Integer(BaralhoUtil.cartas.indexOf(o.numero)));
	}

}
