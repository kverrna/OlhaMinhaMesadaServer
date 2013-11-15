package com.omm.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.omm.controller.ParlamentarController;

public class ParlamentarControllerTest {
	
	private com.omm.controller.ParlamentarController parlamentarController;
	
	@Before
	public void setUp() throws Exception {
		parlamentarController = Mockito.mock(ParlamentarController.class);
		parlamentarController.findParlamentarById("1");
		parlamentarController.getAllParlamentares();
	}
	
	@Test
	public void testFindParlamentarById() {
		Mockito.verify(parlamentarController).findParlamentarById("1");
	}
	
	@Test
	public void testGetAllParlamentares() {
		Mockito.verify(parlamentarController).getAllParlamentares();
	}
}