package com.ronal.project.repository;

import java.util.List;

import com.ronal.project.entity.Cliente;

public interface ClienteRepository {
	
	public List<Cliente> findAll();

}
