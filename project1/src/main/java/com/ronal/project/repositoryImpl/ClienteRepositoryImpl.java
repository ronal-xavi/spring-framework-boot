package com.ronal.project.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ronal.project.entity.Cliente;
import com.ronal.project.repository.ClienteRepository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {
	
	
	@PersistenceContext
	private  EntityManager em;
	

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true) 
	@Override
	public List<Cliente> findAll() {
		 
		return em.createQuery("from Cliente").getResultList();   
	}

}
