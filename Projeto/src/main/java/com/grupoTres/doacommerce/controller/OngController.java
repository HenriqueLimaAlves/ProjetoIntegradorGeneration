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

import com.grupoTres.doacommerce.model.OngModel;
import com.grupoTres.doacommerce.repository.OngRepositorio;

@RestController
@RequestMapping("/ong")
@CrossOrigin("*")
public class OngController {

	@Autowired
	private OngRepositorio repository;

	@GetMapping
	public ResponseEntity<List<OngModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<OngModel> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/ong/{nome}")
	public ResponseEntity<List<OngModel>> GetByTurma(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}

	@PostMapping
	public ResponseEntity<OngModel> post(@RequestBody OngModel nome) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}

	@PutMapping
	public ResponseEntity<OngModel> put(@RequestBody OngModel nome) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
