package com.agendamento.saude.entity.enumeration;

public enum Especialidade {

    CARDIOLOGIA("Cardiologia"),
    DERMATOLOGIA("Dermatologia"),
    ENDOSCOPIA("Endoscopia"),
    GERIATRIA("Geriatria"),
    NEUROLOGIA("Neurologia");

    private String descricao;

    Especialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
