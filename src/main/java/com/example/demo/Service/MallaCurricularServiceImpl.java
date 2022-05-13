package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MallaCurricular;
import com.example.demo.Repository.MallaCurricularRespository;
@Service
public class MallaCurricularServiceImpl implements MallaCurricularService{

	@Autowired
	MallaCurricularRespository repo;
	@Override
	public void guardarMallaCurricular(MallaCurricular mallaCurricular) {
		// TODO Auto-generated method stub
		repo.save(mallaCurricular);


	}

	@Override
	public void editarMallaCurricular(MallaCurricular mallaCurricular) {
		// TODO Auto-generated method stub
		repo.saveAndFlush(mallaCurricular);
	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<MallaCurricular> listarMallaCurricular() {
		// TODO Auto-generated method stub
		List<MallaCurricular> m = new ArrayList<MallaCurricular>();
		return m;
	}

	@Override
	public MallaCurricular burcarMallaCurricularId(Integer id) {
		// TODO Auto-generated method stub
		MallaCurricular m=repo.findById(id).orElse(null);
		return m;
	}

}
