package com.grupoTres.doacommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grupoTres.doacommerce.model.Juridica;

@Repository
public interface JuridicaRepository extends JpaRepository<Juridica, Long> {
	public List<Juridica> findAllByNomeFantasiaContainingIgnoreCase(String nome_fantasia);

}
