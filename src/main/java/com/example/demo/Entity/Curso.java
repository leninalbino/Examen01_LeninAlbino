package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Setter;
@Data
@Setter
@Entity
@Table(name="cursos")
public class Curso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	
	
	@JoinColumn(
			name = "id_malla",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_malla_curricular) references mallas_curriculares (id_malla_curricular)"))
	@ManyToOne()
	private MallaCurricular mallaCurricular;
	
	@ManyToMany(mappedBy = "cursos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Profesor> profesores = new ArrayList<Profesor>();

	
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
