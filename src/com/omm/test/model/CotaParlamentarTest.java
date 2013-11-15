package com.omm.test.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.omm.model.CotaParlamentar;
import com.omm.model.Parlamentar;

public class CotaParlamentarTest {

	CotaParlamentar cotaParlamentar;
	
	@Before
	public void setUp() throws Exception {
		cotaParlamentar = new CotaParlamentar();
	}

	@After
	public void tearDown() throws Exception {
	}



	@Test
	public void testSetAno() {
		cotaParlamentar.setAno(2013);
		assertEquals(2013, cotaParlamentar.getAno());
	}
	@Test
	public void testSetDescricao() {
		cotaParlamentar.setDescricao("descrição cota parlamentar");
		assertEquals("descrição cota parlamentar", cotaParlamentar.getDescricao());
	}
	@Test
	public void testSetNumeroSubCota() {
		cotaParlamentar.setNumeroSubCota(1);
		assertEquals(1, cotaParlamentar.getNumeroSubCota());
	}
	
	
	@Test
	public void testSetMes() {
		cotaParlamentar.setMes(1);
		assertEquals(1, cotaParlamentar.getMes());
	}
	
	@Test
	public void testSetValor() {
		cotaParlamentar.setValor(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValor(),.01f);
	}
	
}
