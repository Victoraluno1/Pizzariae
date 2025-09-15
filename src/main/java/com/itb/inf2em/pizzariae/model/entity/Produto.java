package com.itb.inf2em.pizzariae.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto") // O uso de @Table é facultativo quando o nome da classe é igual ao nome da tabela
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento, ou seja, sequêncial de 1 em 1
    private Long id;
    @Column(length = 45, nullable = false) // nullable: false (NOT NULL) true (NULL)
    private String nome;
    @Column(length = 255, nullable = true)
    private String descricao;
    @Column(length = 45, nullable = true)
    private Double tipo;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true) // DECIMAL(5,2) Ex: R$ 99.999,99
    private Double valorVenda;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)
    private Double valorCompra;
    @Column(nullable = true)
    private int quantidadeEstoque;
    private boolean codStatus;

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getTipo() {
        return tipo;
    }

    public void setTipo(Double tipo) {
        this.tipo = tipo;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
