package com.dragonball.dbz_battle_simulator.repository;

import com.dragonball.dbz_battle_simulator.entity.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
}
