package com.calculadora.calculadora.service;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculadora.calculadora.repository.CadastroRepository;

@Service
public class ClienteService {

	@Autowired
	private CadastroRepository repository;
	
	public <String> ClienteService(String nomeDoAnuncio,String cliente, Date dataDeInicio, Date dataDeTermino, float investimentoPorDia ) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor investido:");
		investimentoPorDia = entrada.nextInt();
		
		Object visualizaramAnuncioOriginal = investimentoPorDia * 30;
		System.out.println( visualizaramAnuncioOriginal + " pessoas visualizaram o anúncio original");

	
		
		System.out.println();
		System.out.printf("Valor investido R$ %d %nNúmero estimado de visualizações: %.2f", investimentoPorDia, visualizaramAnuncioOriginal);
		
	}
	
	
}
