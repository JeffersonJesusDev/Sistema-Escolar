package com.jeffdev.sistemaescolar.repositories;

import com.jeffdev.sistemaescolar.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
