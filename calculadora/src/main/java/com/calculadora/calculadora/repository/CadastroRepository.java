package com.calculadora.calculadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calculadora.calculadora.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository <Cadastro, Long>{
	
	public List<Cadastro>findAllByClienteContainingIgnoreCase(String cliente);

}
