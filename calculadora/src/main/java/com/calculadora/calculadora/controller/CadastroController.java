package com.calculadora.calculadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.calculadora.model.Cadastro;
import com.calculadora.calculadora.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cadastro>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cadastro> getById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeDoAnuncio/{nomeDoAnuncio}")
	public ResponseEntity<List<Cadastro>> getByNomeCompleto(@PathVariable String nomeDoAnuncio){
		return ResponseEntity.ok(repository.findAllByNomeDoAnuncioContainingIgnoreCase(nomeDoAnuncio));
	}
	
	@PostMapping
	public ResponseEntity<Cadastro> post (@RequestBody Cadastro cliente) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<Cadastro> put (@RequestBody Cadastro postagem) {
		return ResponseEntity.ok(repository.save(postagem));
	}
	
}
