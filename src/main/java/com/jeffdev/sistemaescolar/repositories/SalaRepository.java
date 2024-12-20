package com.jeffdev.sistemaescolar.repositories;

import com.jeffdev.sistemaescolar.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
}
