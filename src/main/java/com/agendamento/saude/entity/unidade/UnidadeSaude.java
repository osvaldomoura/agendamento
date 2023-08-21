package com.agendamento.saude.entity.unidade;

import com.agendamento.saude.entity.medico.Medico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "unidade_saude")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UnidadeSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;
}
