package com.dragonball.dbz_battle_simulator.entities;

import com.dragonball.dbz_battle_simulator.entities.enums.RacaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_raca")
public class Raca {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RacaEnum nome;

    @OneToMany(mappedBy = "raca", cascade = CascadeType.ALL)
    private List<Personagem> personagens;
}
