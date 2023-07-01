package com.bytecode.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.bytecode.core.model.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;





@Repository

public class PersonaDaoImp implements PersonaDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<Persona> obtenerPersona() {
		
		String query="from Persona";
		return entityManager.createQuery(query).getResultList();
			
	}
}
