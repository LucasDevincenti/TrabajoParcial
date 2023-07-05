package com.bytecode.core.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.bytecode.core.dao.PersonaDao;
import com.bytecode.core.model.Persona;

@RestController
public class PersonaController {
	
	@Autowired
	private PersonaDao personaDao;
	
	
	@RequestMapping (value="persona")
	public List<Persona> List(){
		
		ArrayList<Persona>persona=new ArrayList<>();
		
		Persona persona1= new Persona();
		persona1.setId(5);
		persona1.setNombre("Jorge");
		persona1.setApellido("Soria");
		persona1.setDni(12543678);
		persona1.setEdad(65);
		
		Persona persona2 = new Persona();
		persona2.setId(3);
		persona2.setNombre("Lucas");
		persona2.setApellido("Devincenti");
		persona2.setDni(95283300);
		persona2.setEdad(21);
	
		Persona persona3 = new Persona();
		persona3.setId(2);
		persona3.setNombre("Ignacio");
		persona3.setApellido("Movio");
		persona3.setDni(78956412);
		persona3.setEdad(50);
		
		persona.add(persona1);
		persona.add(persona2);
		persona.add(persona3);
		
		
		return persona;	
	}
	
	@RequestMapping(value="api/personas")
	public List<Persona> getPersona(){
		
		List<Persona> user=personaDao.obtenerPersona();
		return user;
	}
}
