package com.devsuperior.desafiocrudclientes.DTO;

import java.time.LocalDate;

import com.devsuperior.desafiocrudclientes.entities.Client;

public class ClientDTO {

	private Long id;
	private String name; 
	private String cpf;
	private Double income;
	private LocalDate bithDate;
	private Integer children;
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate bithDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.bithDate = bithDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();;
		cpf = entity.getCpf();;
		income = entity.getIncome();;
		bithDate = entity.getBithDate();;
		children = entity.getChildren();;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBithDate() {
		return bithDate;
	}

	public Integer getChildren() {
		return children;
	}
	
	
}
