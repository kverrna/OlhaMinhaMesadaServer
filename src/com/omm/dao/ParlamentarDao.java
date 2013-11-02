package com.omm.dao;

import java.util.List;

import com.omm.model.Parlamentar;

public interface ParlamentarDao {

	public List<Parlamentar> listar(String nome);
}
