package br.com.groupsoftware.codigo.limpo;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IdentificadorMaoTest {

	@Test
	public void isStraightTest() {
		List<Carta> cartas = new ArrayList<Carta>();
		cartas.add(new Carta("3", "Hearts"));
		cartas.add(new Carta("4", "Hearts"));
		cartas.add(new Carta("5", "Hearts"));
		cartas.add(new Carta("6", "Hearts"));
		cartas.add(new Carta("7", "Hearts"));

		IdentificadorMao identificador = new IdentificadorMao();
		assertTrue(identificador.isStraight(cartas));

	}

	@Test
	public void isFlushTest() {
		List<Carta> cartas = new ArrayList<Carta>();
		cartas.add(new Carta("3", "Hearts"));
		cartas.add(new Carta("4", "Hearts"));
		cartas.add(new Carta("5", "Hearts"));
		cartas.add(new Carta("6", "Hearts"));
		cartas.add(new Carta("J", "Hearts"));

		IdentificadorMao identificador = new IdentificadorMao();
		assertTrue(identificador.isFlush(cartas));

	}

	@Test
	public void isRoyalFlushTest() {
		List<Carta> cartas = new ArrayList<Carta>();
		cartas.add(new Carta("10", "Hearts"));
		cartas.add(new Carta("J", "Hearts"));
		cartas.add(new Carta("Q", "Hearts"));
		cartas.add(new Carta("K", "Hearts"));
		cartas.add(new Carta("A", "Hearts"));

		IdentificadorMao identificador = new IdentificadorMao();
		assertTrue(identificador.isRoyalFlush(cartas));

	}

	@Test
	public void isStraightFlushTest() {
		List<Carta> cartas = new ArrayList<Carta>();
		cartas.add(new Carta("5", "Hearts"));
		cartas.add(new Carta("6", "Hearts"));
		cartas.add(new Carta("7", "Hearts"));
		cartas.add(new Carta("8", "Hearts"));
		cartas.add(new Carta("9", "Hearts"));

		IdentificadorMao identificador = new IdentificadorMao();
		assertTrue(identificador.isStraightFlush(cartas));

	}

}
