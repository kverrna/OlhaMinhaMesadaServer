package com.omm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Parlamentar")
public class Parlamentar {

	@Id
	@Column(name="idParlamentar")
	int id;
	
	@Column(name="nomeParlamentar")
	String nome;
	
	@Column(name="partidoParlamentar")
	String partido;
	
	@Column(name="ufParlamentar")
	String uf;
	
	@Transient
	byte[] foto;
	
	public Parlamentar() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
}
