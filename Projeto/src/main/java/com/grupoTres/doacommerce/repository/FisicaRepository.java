package com.grupoTres.doacommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoTres.doacommerce.model.Fisica;

@Repository
public interface FisicaRepository extends JpaRepository<Fisica, Long>{
	
	public List<Fisica> findAllByNomeContainingIgnoreCase (String nome);//nome atributo da classe model
}