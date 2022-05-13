package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Curso;
import com.example.demo.Service.CursoService;

@RestController
@RequestMapping(name = "/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping(name = "/litarCurso")
	public ResponseEntity<List<Curso>>listarCurso(){
		return new ResponseEntity<List<Curso>>(service.listarCurso(),HttpStatus.CREATED);
		
	}
	
	@PostMapping(name = "/guardarCurso")
	public ResponseEntity<Void> guardarCurso(@RequestBody Curso curso){
		service.guardarCurso(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	@PatchMapping(name = "/listarXId/{id}")
	public ResponseEntity<Curso>listarCursoId(@PathVariable Integer id){
		Curso c = service.obtenerCursoId(id);
		if(c!= null)
		return new ResponseEntity<Curso>(c,HttpStatus.OK);
		return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
		
	}
	public ResponseEntity<Void>EditarCurso(@RequestBody Curso curso){
		Curso c = service.obtenerCursoId(curso.getIdCurso());
		if(c!= null) {
			service.editarCurso(curso);
			return new ResponseEntity<Void>(HttpStatus.OK);

		}
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			
		
	}
	public ResponseEntity<Void>eliminarCurso(@PathVariable Integer id){
		Curso c = service.obtenerCursoId(id);

		if(c!= null) {
			service.eliminarCurso(id);
			return new ResponseEntity<Void>(HttpStatus.OK);

		}
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
}
