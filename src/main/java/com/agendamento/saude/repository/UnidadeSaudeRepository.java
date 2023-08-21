package com.agendamento.saude.repository;

import com.agendamento.saude.entity.UnidadeSaude;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnidadeSaudeRepository extends JpaRepository<UnidadeSaude, Long> {
}
