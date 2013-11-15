package com.omm.test.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.omm.dao.DefaultParlamentarDao;

public class DefaultParlamentarDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEntityManangerFactoryNotNull() {
		DefaultParlamentarDao dao = new DefaultParlamentarDao();
		assertNotNull(dao.getEntityManagerFactory());
	}
	
	@Test
	public void testEntityManangerSame() {
		DefaultParlamentarDao dao1 = new DefaultParlamentarDao();
		DefaultParlamentarDao dao2 = new DefaultParlamentarDao();
		
		assertEquals(dao1.getEntityManagerFactory(), dao2.getEntityManagerFactory());
		
	}

}
