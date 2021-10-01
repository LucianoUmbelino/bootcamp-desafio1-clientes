package com.devsuperior.desafio1clientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1clientes.entities.Client;
import com.devsuperior.desafio1clientes.repositories.ClientRepository;

@Service			
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll() {
		
		return repository.findAll();
		
	}

}
