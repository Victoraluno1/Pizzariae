package com.itb.inf2em.pizzariae.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ItemPedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = true)
    private int quantidadeitem;
    private boolean codstatus;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)
    private double valorunitario;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public int getQuantidadeitem() {
        return quantidadeitem;
    }

    public void setQuantidadeitem(int quantidadeitem) {
        this.quantidadeitem = quantidadeitem;
    }
}
