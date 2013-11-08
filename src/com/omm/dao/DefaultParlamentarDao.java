package com.omm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.omm.model.Parlamentar;

public class DefaultParlamentarDao extends DataAccessObject implements ParlamentarDao{

	public List<Parlamentar> listar(String id) {
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		Query query = manager.createQuery("SELECT p FROM Parlamentar p WHERE p.id LIKE :id");
		query.setParameter("id", id+"%");
		
		List<Parlamentar> resultado = (List<Parlamentar>) query.getResultList();
		
		manager.close();
		
		return resultado;
	}
}
