package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="mallaCurriculares")
public class MallaCurricular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private String anio;
	
	
	@OneToOne
	@JoinColumn(name = "id_universidad", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_universidad) references universidades (id_universidad)"))
	private Universidad universidad;
	
	@OneToMany(mappedBy = "mallaCurricular")
	private List<Curso> curso = new ArrayList<Curso>();

}
