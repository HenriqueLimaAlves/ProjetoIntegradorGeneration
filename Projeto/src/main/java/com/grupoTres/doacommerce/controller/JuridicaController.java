package com.grupoTres.doacommerce.controller;

import java.util.List;

import com.grupoTres.doacommerce.model.Juridica;
import com.grupoTres.doacommerce.repository.JuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/juridica")
@CrossOrigin("*")

public class JuridicaController {
	
	@Autowired
	private JuridicaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Juridica>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}	
	
		@GetMapping("/{id}")
		public ResponseEntity<Juridica> GetById(@PathVariable Long id){
			return repository.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
			
		}
		
		@GetMapping("/nome_fantasia/{nome_fantasia}")
		public ResponseEntity<List<Juridica>> GetByNome_fantasia(@PathVariable String nome_fantasia){
			return ResponseEntity.ok(repository.findAllByNomeFantasiaContainingIgnoreCase(nome_fantasia));
			
		}
		
		@PostMapping
		public ResponseEntity <Juridica> post (@RequestBody Juridica juridica){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(juridica));
		}
		
		@PutMapping
		public ResponseEntity <Juridica> put (@RequestBody Juridica juridica){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(juridica));
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
}
