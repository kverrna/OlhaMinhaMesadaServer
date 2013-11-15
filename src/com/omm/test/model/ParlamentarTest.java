package com.omm.test.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.omm.model.Parlamentar;

public class ParlamentarTest {

	Parlamentar parlamentar;
	
	@Before
	public void setUp() throws Exception {
		parlamentar = new Parlamentar();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetNome() {
		parlamentar.setNome("João");
		assertEquals("João", parlamentar.getNome());
	}

	@Test
	public void testSetId() {
		parlamentar.setId(1);
		assertEquals(1, parlamentar.getId());
	}
	@Test
	public void testSetPartido() {
		parlamentar.setPartido("PT");
		assertEquals("PT", parlamentar.getPartido());
	}
	@Test
	public void testSetUf() {
		parlamentar.setUf("DF");
		assertEquals("DF", parlamentar.getUf());
	}
	
}
