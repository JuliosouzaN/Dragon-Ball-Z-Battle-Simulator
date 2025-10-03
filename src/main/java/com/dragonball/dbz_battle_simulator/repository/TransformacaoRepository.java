package com.dragonball.dbz_battle_simulator.repository;

import com.dragonball.dbz_battle_simulator.entities.Transformacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransformacaoRepository extends JpaRepository<Transformacao, Long> {
}
