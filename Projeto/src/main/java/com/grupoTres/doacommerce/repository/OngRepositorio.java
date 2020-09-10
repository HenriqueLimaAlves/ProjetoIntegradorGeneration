package com.grupoTres.doacommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoTres.doacommerce.model.OngModel;

public interface OngRepositorio extends JpaRepository<OngModel, Long> {

	public List<OngModel> findAllByNomeContainingIgnoreCase(String nome);
}
