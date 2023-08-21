package com.agendamento.saude.entity.enumeration;

public enum Status {
    A("Agendado"),
    CON("Concluído"),
    CAN("Cancelado"),
    E("Etc");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
