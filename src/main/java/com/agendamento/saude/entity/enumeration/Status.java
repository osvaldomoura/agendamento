package com.agendamento.saude.entity.enumeration;

public enum Status {
    A("Agendado"),
    CON("Concluído"),
    CANC("Cancelado"),
    E("Etc");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
