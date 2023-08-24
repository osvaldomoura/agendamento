package com.agendamento.saude.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Table(name = "unidade_saude")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class UnidadeSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_unidade_saude", referencedColumnName = "id")
    private Collection<Medico> medicos;

    public UnidadeSaude(Long id) {
        this.id = id;
    }
}
