package com.itb.inf2em.pizzariae.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 45, nullable = false)
    private String nome;
    @Column(length = 255, nullable = true)
    private String descricao;
    private boolean codstatus;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        public String getDescricao () {
            return descricao;
        }

    public Boolean getCodStatus() {
        return codstatus;
    }

    public void setcodstatus(Boolean codstatus) {
        this.codstatus = codstatus;
    }
}
