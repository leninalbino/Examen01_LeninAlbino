package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Profesor;
@Service
public interface ProfesorService {
	public void guardarProfesor(Profesor profesor);
	public void editarProfesor(Profesor profesor);
	public void eliminarProfesor(Integer id);
	public List<Profesor>listarProfesor();
	public Profesor buscarProfesorId(Integer id);
}
