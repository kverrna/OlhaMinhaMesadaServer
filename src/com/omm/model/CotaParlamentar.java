package com.omm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ceap") 
public class CotaParlamentar {

	@Id
	@Column(name = "idCeap")
	int id;
	
	@Column(name="idParlametar")
	int idParlamentar;

	@Column(name = "anoCeap")
	int ano;

	@Column(name = "numeroSubCota")
	int numeroSubCota;

	@Column
	double valorJaneiro;

	@Column
	double valorFevereiro;

	@Column
	double valorMarco;

	@Column
	double valorAbril;

	@Column
	double valorMaio;

	@Column
	double valorJunho;

	@Column
	double valorJulho;

	@Column
	double valorAgosto;

	@Column
	double valorSetembro;

	@Column
	double valorOutubro;

	@Column
	double valorNovembro;

	@Column
	double valorDezembro;

	@Column(name = "descricaoCeap")
	String descricao;

	@Column(name = "especificacaoCeap")
	String especificacao;
	
	public CotaParlamentar() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getValorJaneiro() {
		return valorJaneiro;
	}

	public void setValorJaneiro(double valorJaneiro) {
		this.valorJaneiro = valorJaneiro;
	}

	public double getValorFevereiro() {
		return valorFevereiro;
	}

	public void setValorFevereiro(double valorFevereiro) {
		this.valorFevereiro = valorFevereiro;
	}

	public double getValorMarco() {
		return valorMarco;
	}

	public void setValorMarco(double valorMarco) {
		this.valorMarco = valorMarco;
	}

	public double getValorAbril() {
		return valorAbril;
	}

	public void setValorAbril(double valorAbril) {
		this.valorAbril = valorAbril;
	}

	public double getValorMaio() {
		return valorMaio;
	}

	public void setValorMaio(double valorMaio) {
		this.valorMaio = valorMaio;
	}

	public double getValorJunho() {
		return valorJunho;
	}

	public void setValorJunho(double valorJunho) {
		this.valorJunho = valorJunho;
	}

	public double getValorJulho() {
		return valorJulho;
	}

	public void setValorJulho(double valorJulho) {
		this.valorJulho = valorJulho;
	}

	public double getValorAgosto() {
		return valorAgosto;
	}

	public void setValorAgosto(double valorAgosto) {
		this.valorAgosto = valorAgosto;
	}

	public double getValorSetembro() {
		return valorSetembro;
	}

	public void setValorSetembro(double valorSetembro) {
		this.valorSetembro = valorSetembro;
	}

	public double getValorOutubro() {
		return valorOutubro;
	}

	public void setValorOutubro(double valorOutubro) {
		this.valorOutubro = valorOutubro;
	}

	public double getValorNovembro() {
		return valorNovembro;
	}

	public void setValorNovembro(double valorNovembro) {
		this.valorNovembro = valorNovembro;
	}

	public double getValorDezembro() {
		return valorDezembro;
	}

	public void setValorDezembro(double valorDezembro) {
		this.valorDezembro = valorDezembro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
//	public void setIdParlamentar(int id) {
//		this.idParlamentar = id;
//	}
	
	//public int getIdParlmanetar() {
	//	return this.idParlamentar;
//	}

}
