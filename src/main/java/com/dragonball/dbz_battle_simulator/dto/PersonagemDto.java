package com.dragonball.dbz_battle_simulator.dto;

import java.util.List;

public record PersonagemDto(
         Long id,
         String nome,
         Integer nivelPoder,
         String raca,
         List<String> transformacoes
) {
}
