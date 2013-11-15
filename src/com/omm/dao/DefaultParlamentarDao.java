package com.omm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.omm.model.Parlamentar;

public class DefaultParlamentarDao extends DataAccessObject implements ParlamentarDao{

	public List<Parlamentar> listar(String id) {
		int numId = Integer.parseInt(id);

		EntityManager manager = getEntityManagerFactory().createEntityManager();
		
		Query query = manager.createQuery("SELECT p FROM Parlamentar p WHERE p.id = :id");
		query.setParameter("id", numId);
		
		List<Parlamentar> resultado = (List<Parlamentar>) query.getResultList();
		
		manager.close();
		
		return resultado;
	}
}
