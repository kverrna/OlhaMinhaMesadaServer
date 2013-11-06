package com.omm.test.dao;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.omm.dao.DefaultCotaParlamentarDao;

public class DefaultCotaParlamentarDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEntityManagerFactoryNotNull() {
		DefaultCotaParlamentarDao dao = new DefaultCotaParlamentarDao();
		assertNotNull(dao.getEntityManagerFactory());
	}
	
	@Test
	public void testEntityManagerSame() {
		DefaultCotaParlamentarDao dao1 = new DefaultCotaParlamentarDao();
		DefaultCotaParlamentarDao dao2 = new DefaultCotaParlamentarDao();
	
		assertEquals(dao1.getEntityManagerFactory(), dao2.getEntityManagerFactory());
	}

}
