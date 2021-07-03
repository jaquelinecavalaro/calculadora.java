package com.calculadora.calculadora.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_cadastro")
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nomeDoAnuncio;
	
	private String cliente;
	
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date dataDeInicio;
	
	private Date dataDeTermino;
	
	private float investimentoPorDia;
	
	
	public String getNomeDoAnuncio() {
		return nomeDoAnuncio;
	}

	public void setNomeDoAnuncio(String nomeDoAnuncio) {
		this.nomeDoAnuncio = nomeDoAnuncio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public Date getDataDeTermino() {
		return dataDeTermino;
	}

	public void setDataDeTermino(Date dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}

	public float getInvestimentoPorDia() {
		return investimentoPorDia;
	}

	public void setInvestimentoPorDia(float investimentoPorDia) {
		this.investimentoPorDia = investimentoPorDia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	
	
	
	
	
}
