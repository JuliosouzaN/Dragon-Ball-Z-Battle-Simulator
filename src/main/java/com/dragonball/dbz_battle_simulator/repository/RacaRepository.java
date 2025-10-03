package com.dragonball.dbz_battle_simulator.repository;

import com.dragonball.dbz_battle_simulator.entity.Raca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Long> {
}
