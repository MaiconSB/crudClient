package com.devsuperior.desafiocrudclientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	@Transactional(readOnly=true)
	public Page<ClientDTO> findAll(Pageable pageable) {
		Page<Client> client = repository.findAll(pageable);
		return client.map(x -> new ClientDTO(x));
	}

	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBithDate(dto.getBithDate());
		entity.setChildren(dto.getChildren());
		
		entity = repository.save(entity);
		
		return new ClientDTO(entity);
	}
}
