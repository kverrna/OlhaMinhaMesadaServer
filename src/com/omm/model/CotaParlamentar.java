package com.omm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cota")
public class CotaParlamentar {
		@Id
	@Column(name="ID_COTA")
	int cod;
	

	@Column(name = "ID_PARLAMENTAR")
	int idParlamentar;

	@Column(name = "MES")
	int mes;

	@Column(name = "ANO")
	int ano;

	@Column(name = "NUM_SUBCOTA")
	int numeroSubCota;

	@Column(name = "DESCRICAO")
	String descricao;

	@Column(name = "VALOR")
	double valor;

	public CotaParlamentar() {
	}

	public int getIdParlamentar() {
		return idParlamentar;
	}

	public void setIdParlamentar(int idParlamentar) {
		this.idParlamentar = idParlamentar;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumeroSubCota() {
		return numeroSubCota;
	}

	public void setNumeroSubCota(int numeroSubCota) {
		this.numeroSubCota = numeroSubCota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
