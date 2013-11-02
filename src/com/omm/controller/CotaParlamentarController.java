package com.omm.controller;

import java.util.List;

import com.omm.dao.CotaParlamentarDao;
import com.omm.dao.DefaultCotaParlamentarDao;
import com.omm.model.CotaParlamentar;

public class CotaParlamentarController {

	CotaParlamentarDao dao;
	
	public CotaParlamentarController() {

		dao = new DefaultCotaParlamentarDao();
	}
	
	public List<CotaParlamentar> listar(String nome) {

		return dao.listar(nome);
	}
	
}
