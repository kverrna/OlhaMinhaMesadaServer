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
	public void testSetId() {
		cotaParlamentar.setId(1);
		assertEquals(1, cotaParlamentar.getId());
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
	public void testSetValorJaneiro() {
		cotaParlamentar.setValorJaneiro(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorJaneiro(), .01f);
	}
	
	@Test
	public void testSetValorFevereiro() {
		cotaParlamentar.setValorFevereiro(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorFevereiro(), .01f);
	}
	
	@Test
	public void testSetValorMarco() {
		cotaParlamentar.setValorMarco(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorMarco(), .01f);
	}
	
	@Test
	public void testSetValorAbril() {
		cotaParlamentar.setValorAbril(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorAbril(), .01f);
	}
	
	@Test
	public void testSetValorMaio() {
		cotaParlamentar.setValorMaio(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorMaio(), .01f);
	}
	@Test
	public void testSetValorJunho() {
		cotaParlamentar.setValorJunho(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorJunho(), .01f);
	}
	@Test
	public void testSetValorJulho() {
		cotaParlamentar.setValorJulho(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorJulho(), .01f);
	}
	
	@Test
	public void testSetValorAgosto() {
		cotaParlamentar.setValorAgosto(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorAgosto(), .01f);
	}
	
	@Test
	public void testSetValorSetembro() {
		cotaParlamentar.setValorSetembro(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorSetembro(), .01f);
	}
	
	@Test
	public void testSetValorOutubro() {
		cotaParlamentar.setValorOutubro(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorOutubro(), .01f);
	}
	
	@Test
	public void testSetValorNovembro() {
		cotaParlamentar.setValorNovembro(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorNovembro(), .01f);
	}
	
	@Test
	public void testSetValorDezembro() {
		cotaParlamentar.setValorDezembro(1.0f);
		assertEquals(1.0f, cotaParlamentar.getValorDezembro(), .01f);
	}
}
