package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Universidad;

public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {

}
