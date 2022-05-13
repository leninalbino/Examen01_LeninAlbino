package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Curso;

public interface CursoService {
	public void guardarCurso(Curso curso);
	public void editarCurso(Curso curso);
	public void eliminarCurso(Integer id);
	public List<Curso>listarCurso();
	public Curso obtenerCursoId  (Integer id);
	
}
