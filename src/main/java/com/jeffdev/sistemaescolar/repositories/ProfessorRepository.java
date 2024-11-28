package com.jeffdev.sistemaescolar.repositories;

import com.jeffdev.sistemaescolar.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
