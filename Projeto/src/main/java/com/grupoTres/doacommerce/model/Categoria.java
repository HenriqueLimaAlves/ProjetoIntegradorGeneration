package com.grupoTres.doacommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 250)
	private String alimentos;
	
	@NotNull
	@Size(max = 250)
	private String roupas;
	
	@NotNull
	@Size(max = 250)
	private String moveis;
	
	@NotNull
	@Size(max = 250)
	private String utensilios;
	
	@NotNull
	@Size(max = 250)
	private String higiene;
	
	@NotNull
	@Size(max = 250)
	private String educacao_cultura;
	
	@NotNull
	@Size(max = 250)
	private String urgente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	public String getRoupas() {
		return roupas;
	}

	public void setRoupas(String roupas) {
		this.roupas = roupas;
	}

	public String getMoveis() {
		return moveis;
	}

	public void setMoveis(String moveis) {
		this.moveis = moveis;
	}

	public String getUtensilios() {
		return utensilios;
	}

	public void setUtensilios(String utensilios) {
		this.utensilios = utensilios;
	}

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}

	public String getEducacao_cultura() {
		return educacao_cultura;
	}

	public void setEducacao_cultura(String educacao_cultura) {
		this.educacao_cultura = educacao_cultura;
	}

	public String getUrgente() {
		return urgente;
	}

	public void setUrgente(String urgente) {
		this.urgente = urgente;
	}	
}
