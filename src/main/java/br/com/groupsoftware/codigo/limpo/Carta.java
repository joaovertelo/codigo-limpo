package br.com.groupsoftware.codigo.limpo;

import lombok.Data;

@Data
public class Carta {

	String numero;
	String naipe;

	public Carta(String numero, String naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}

}
