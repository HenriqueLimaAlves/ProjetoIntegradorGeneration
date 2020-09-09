package com.grupoTres.doacommerce.controller;

import java.util.List;

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


import com.grupoTres.doacommerce.model.Fisica;
import com.grupoTres.doacommerce.repository.FisicaRepository;

@RestController
@RequestMapping("/pessoafisica")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FisicaController {
	
	@Autowired
	private FisicaRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Fisica>> getAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Fisica> getById (@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity <Fisica> post (@RequestBody Fisica cadastro)//cadastro?
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cadastro));
	}
	
	@PutMapping
	public ResponseEntity<Fisica> put (@RequestBody Fisica cadastro)//cadastro?
	{
		return ResponseEntity.ok(repository.save(cadastro));				
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) 
	{
		repository.deleteById(id);
	}
}