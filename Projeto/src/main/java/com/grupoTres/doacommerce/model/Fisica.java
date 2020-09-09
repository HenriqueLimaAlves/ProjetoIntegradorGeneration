package com.grupoTres.doacommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name= "Cadastro_pf")
public class Fisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size( min=20, max=150)//min e max aprovados?
	private String nome;
	
	@NotNull
	private String email;
	
	@NotNull
	@Size(min=7, max=10)
	private String senha;
	
	@NotNull
	private long cpf;
	
	@Temporal(TemporalType.TIMESTAMP)// sobre idade?
	private Date idade = new java.sql.Date(System.currentTimeMillis());//captura a data q o dado passou pela classe

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getIdade() {
		return idade;
	}

	public void setIdade(Date idade) {
		this.idade = idade;
	}
	
	
	
}