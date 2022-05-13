package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.MallaCurricular;
@Service
public interface MallaCurricularService {

	public void guardarMallaCurricular(MallaCurricular mallaCurricular);
	public void editarMallaCurricular(MallaCurricular mallaCurricular);
	public void eliminarMallaCurricular(Integer id);
	public List<MallaCurricular> listarMallaCurricular();
	public MallaCurricular burcarMallaCurricularId(Integer id);
}
