package com.itb.inf2em.pizzariae.model.entity;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private double valorPedido;
    private LocalDateTime data_hora_pedido;
    private LocalDateTime data_hora_entrega;
    private boolean codstatus;
    private String status;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setStatus(String Status) {
        this.status = status;
    }
    public String getNome() {
        return status;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getData_hora_pedido() {
        return data_hora_pedido;
    }

    public void setData_hora_pedido(LocalDateTime data_hora_pedido) {
        this.data_hora_pedido = data_hora_pedido;
    }

    public LocalDateTime getData_hora_entrega() {
        return data_hora_entrega;
    }

    public void setData_hora_entrega(LocalDateTime data_hora_entrega) {
        this.data_hora_entrega = data_hora_entrega;
    }

    public String getStatus() {
        return status;
    }
}
