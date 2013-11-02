package com.omm.dao;

import java.util.List;

import com.omm.model.CotaParlamentar;

public interface CotaParlamentarDao {

	public List<CotaParlamentar> listar(String nome);
}
