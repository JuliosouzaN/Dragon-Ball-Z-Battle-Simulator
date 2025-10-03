package com.dragonball.dbz_battle_simulator.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CriarPersonagemDto(
        @NotBlank(message = "O nome é obrigatório") String nome,
        @NotNull(message = "O nível de poder é obrigatório") Integer nivelPoder,
        @NotNull(message = "A raça é obrigatória") Long racaId,
        List<Long> transformacoesIds) {
}
