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

import com.grupoTres.doacommerce.model.Produto;
import com.grupoTres.doacommerce.repository.ProdutoRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Produto>> findAllProduto(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Produto> findByIdProduto(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping 
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping 
	public ResponseEntity<Produto> putProduto(@RequestBody Produto produtoPut){//não sei qual nome colocar aqui
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtoPut));
	}
	
	@DeleteMapping 
	public void deleteProduto(@PathVariable Long id) {
		repository.deleteById(id);
	}	
}
