package com.example.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curriculo.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}
