package com.omm.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.omm.controller.CotaParlamentarController;

public class ParlamentarControllerTest {
	
	private CotaParlamentarController ParlamentarController;
	
	@Before
	public void setUp() throws Exception {
		ParlamentarController = Mockito.mock(CotaParlamentarController.class);
		ParlamentarController.listar("João");
		}
	
	@Test
	public void test() {
		Mockito.verify(ParlamentarController).listar("João");
		}

}