package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Curso;
import com.example.demo.Repository.CursoRepository;
@Service
public class CursoServiceImpl implements CursoService{

	@Autowired CursoRepository cursoRepository;
	@Override
	public void guardarCurso(Curso curso) {
		// TODO Auto-generated method stub
		Curso c = new Curso();
		c.setIdCurso(curso.getIdCurso());
		c.setCurso(curso.getCurso());
		cursoRepository.save(curso);
	}

	@Override
	public void editarCurso(Curso curso) {
		// TODO Auto-generated method stub
		cursoRepository.saveAndFlush(curso);
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		
		return cursoRepository.findAll();
	}

	@Override
	public Curso obtenerCursoId(Integer id) {
		// TODO Auto-generated method stub
		Curso curso=cursoRepository.findById(id).orElse(null);
 


		return curso;
	}

}
