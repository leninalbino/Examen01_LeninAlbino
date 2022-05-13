package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Profesor;
import com.example.demo.Repository.ProfesorRepository;
@Service
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	ProfesorRepository repo;
	@Override
	public void guardarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repo.save(profesor);
	}

	@Override
	public void editarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repo.saveAndFlush(profesor);
	}

	@Override
	public void eliminarProfesor(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		List<Profesor>p=new ArrayList<Profesor>();
		return p;
	}

	@Override
	public Profesor buscarProfesorId(Integer id) {
		// TODO Auto-generated method stub
		Profesor prof = repo.findById(id).orElse(null);
		return prof;
	}

}
