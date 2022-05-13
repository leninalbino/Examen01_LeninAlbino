package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Universidad;
@Service
public interface UniversidadService {
	public void guardarUniversidad(Universidad universidad);
	public void editarUniversidad(Universidad universidad);
	public void eliminarUniversidad(Integer id);
	public List<Universidad>listarUniversidad();
	public Universidad buscarUniversidadId(Integer id);
}
