package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="universidades")
public class Universidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUniversidad;
	private String Universidad;
}
