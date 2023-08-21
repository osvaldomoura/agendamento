package com.agendamento.saude.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor

public class Paciente {

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String documento;
}
