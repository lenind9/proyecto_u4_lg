package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaRepository {
	
	public void insertar(Persona p);
	public Persona buscarPorId(Integer id);
	public void actualizar(Persona p);
	public void eliminar(Integer id);
	
	public List<Persona> buscarTodos();
	
}
