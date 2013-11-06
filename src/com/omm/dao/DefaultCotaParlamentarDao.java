package com.omm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.omm.model.CotaParlamentar;

public class DefaultCotaParlamentarDao extends DataAccessObject implements CotaParlamentarDao {

	public List<CotaParlamentar> listar(String id) {

		EntityManager manager = getEntityManagerFactory().createEntityManager();
		Query query = manager.createQuery("SELECT c FROM CotaParlamentar c WHERE c.idParlamentar = :id");
		query.setParameter("id", Integer.parseInt(id));

		List<CotaParlamentar> resultado = (List<CotaParlamentar>) query.getResultList();

		manager.close();

		return resultado;
	}
}
