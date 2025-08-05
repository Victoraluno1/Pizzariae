package com.itb.inf2em.pizzariae.model.entity;

public class Item_Pedido {

    private long id;
    private int quantidadeitem;
    private boolean codstatus;
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
