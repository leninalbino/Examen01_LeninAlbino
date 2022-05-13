package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

import lombok.Data;
@Data
@Entity
@Table(name="profesores")
public class Profesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfesor;
	private String profesor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "profesor_curso",
	joinColumns =
		@JoinColumn(
			name = "id_curso",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_curso) references cursos (id_curso)")),
	inverseJoinColumns =
		@JoinColumn(
				name = "id_profesor",
				nullable = false,
				unique = true,
				foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_profesor) references profesores (id_profesor)"))
	)
	private List<Curso> cursos = new ArrayList<Curso>();
}
