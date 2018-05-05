package br.com.groupsoftware.codigo.limpo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeradorMaoTest {

	@Test
	public void gerarCartaTest() {
		GeradorMao gerador = new GeradorMao();
		assertTrue(gerador.gerarCarta() != null);
	}

}
