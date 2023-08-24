package com.agendamento.saude.entity;

import com.agendamento.saude.entity.enumeration.Status;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

@Entity
@Table(name = "agendamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant dataConsulta;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_medico", referencedColumnName = "id")
    private Medico medico;

    @Embedded
    @AttributeOverrides(value={@AttributeOverride(name= "nome", column = @Column(name = "ageNomePaciente"))})
    private Paciente paciente;
}
