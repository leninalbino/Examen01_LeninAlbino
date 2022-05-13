package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Universidad;
import com.example.demo.Repository.UniversidadRepository;
@Service
public class UniversidadServiceImpl implements UniversidadService{

	@Autowired
	UniversidadRepository repo;
	@Override
	public void guardarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repo.save(universidad);
	}

	@Override
	public void editarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repo.saveAndFlush(universidad);
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Universidad> listarUniversidad() {
		// TODO Auto-generated method stub
		List<Universidad>uni= new ArrayList<Universidad>();
		return uni;
	}

	@Override
	public Universidad buscarUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		Universidad uni = repo.getById(id);
		return uni;
	}

}
