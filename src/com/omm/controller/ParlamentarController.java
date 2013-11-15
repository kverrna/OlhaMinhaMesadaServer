package com.omm.controller;

import java.util.List;

import com.omm.dao.DefaultParlamentarDao;
import com.omm.dao.ParlamentarDao;
import com.omm.model.Parlamentar;

public class ParlamentarController {

	ParlamentarDao dao;
	
	public ParlamentarController() {
		dao = new DefaultParlamentarDao();
	}
	
	public List<Parlamentar> findParlamentarById(String id) {
		return dao.listar(id);
	}
	
	public List<Parlamentar> getAllParlamentares() {
		return dao.getAllParlamentares();
	}
	
}
