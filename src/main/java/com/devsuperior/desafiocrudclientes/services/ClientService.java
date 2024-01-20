package com.devsuperior.desafiocrudclientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.desafiocrudclientes.DTO.ClientDTO;
import com.devsuperior.desafiocrudclientes.entities.Client;
import com.devsuperior.desafiocrudclientes.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly=true)
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
	}

}
