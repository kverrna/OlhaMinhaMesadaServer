package com.omm.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DataAccessObject {
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("OMM");
		}
		return entityManagerFactory;
	}
}
