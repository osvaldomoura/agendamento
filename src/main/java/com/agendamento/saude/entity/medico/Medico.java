package com.agendamento.saude.entity.medico;

import com.agendamento.saude.entity.agendamento.Agendamento;
import com.agendamento.saude.entity.enumeration.Especialidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medico")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="especialidade")
    private Especialidade especialidade;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agendamento", referencedColumnName = "id")
    private Agendamento agendamento;
}
