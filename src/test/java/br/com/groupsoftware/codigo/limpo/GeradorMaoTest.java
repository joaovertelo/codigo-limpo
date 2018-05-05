package br.com.groupsoftware.codigo.limpo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeradorMaoTest {

	@Test
	public void gerarCartaTest() {
		GeradorMao gerador = new GeradorMao();
		assertTrue(gerador.gerarCarta() != null);
	}

	@Test
	public void gerarMaoTest() {
		GeradorMao gerador = new GeradorMao();
		Mao mao = gerador.gerarMao(new Jogador());
		assertTrue(mao.getCartas().size() == 5);
	}

	@Test
	public void VerificarrMaosDiferentesTest() {
		GeradorMao gerador = new GeradorMao();
		Mao mao1 = gerador.gerarMao(new Jogador());
		Mao mao2 = gerador.gerarMao(new Jogador());

		assertTrue(!mao1.getCartas().equals(mao2.getCartas()));
	}

}
