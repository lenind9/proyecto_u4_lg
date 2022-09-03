package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaRepository personaJpaRepository;
	
	@Override
	public void guardar(Persona p) {
		// TODO Auto-generated method stub
		this.personaJpaRepository.insertar(p);
	}
	
	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.personaJpaRepository.buscarPorId(id);
	}

	@Override
	public void actualizar(Persona p) {
		// TODO Auto-generated method stub
		this.personaJpaRepository.actualizar(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.personaJpaRepository.eliminar(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.personaJpaRepository.buscarTodos();
	}
	
}
