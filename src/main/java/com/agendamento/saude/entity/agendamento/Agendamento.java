package com.agendamento.saude.entity.agendamento;

import com.agendamento.saude.entity.enumeration.Status;
import com.agendamento.saude.entity.medico.Medico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

@Entity
@Table(name = "agendamento")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant dataConsulta;

    @Enumerated(EnumType.STRING)
    private Status status;

}
