package com.dragonball.dbz_battle_simulator.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_personagem")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name  = "raca_id")
    private Raca raca;

    @Column(name = "nome", unique = true, nullable = false)
    private String nome;

    @Column(name = "nivel_poder", nullable = false)
    private Integer nivelPoder;
}
