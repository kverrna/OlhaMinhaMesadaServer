package com.omm.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.omm.controller.CotaParlamentarController;

public class CotaParlamentarControllerTest {
	
	private CotaParlamentarController cotaParlamentarController;
	
	@Before
	public void setUp() throws Exception {
		cotaParlamentarController = Mockito.mock(CotaParlamentarController.class);
		cotaParlamentarController.listar("1");
	}
	
	@Test
	public void test() throws Exception {
		Mockito.verify(cotaParlamentarController).listar("1");
		}
	
	@Test
	public void testIsNotNull() throws Exception {
		
	}
}
