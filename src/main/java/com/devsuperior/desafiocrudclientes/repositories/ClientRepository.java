package com.devsuperior.desafiocrudclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafiocrudclientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
