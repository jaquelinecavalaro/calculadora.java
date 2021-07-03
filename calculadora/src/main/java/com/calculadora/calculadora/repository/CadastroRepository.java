package com.calculadora.calculadora.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.calculadora.calculadora.model.Cadastro;

@Repository
public class CadastroRepository extends JpaRepository <Cadastro, Long>{
	
	public List<Cadastro> findAllByClienteContainingIgnoreCase (String cliente);

}
