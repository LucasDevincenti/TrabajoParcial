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
		persona1.setId(6);
		persona1.setNombre("Jorge");
		persona1.setApellido("Soria");
		persona1.setDni(52125487);
		persona1.setEdad(23);
		
		Persona persona2 = new Persona();
		persona2.setId(3);
		persona2.setNombre("Leonel");
		persona2.setApellido("Alamo");
		persona2.setDni(95283300);
		persona2.setEdad(19);
	
		Persona persona3 = new Persona();
		persona3.setId(4);
		persona3.setNombre("Patricia");
		persona3.setApellido("Movio");
		persona3.setDni(18930420);
		persona3.setEdad(57);
		
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
