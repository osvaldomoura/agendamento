package com.agendamento.saude.entity;

import com.agendamento.saude.entity.enumeration.Especialidade;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;


@Entity
@Table(name = "medico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="especialidade")
    private Especialidade especialidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_unidade_saude", referencedColumnName = "id")
    private UnidadeSaude unidadeSaude;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medico")
    private Collection<Agendamento> agendamentos;

}
