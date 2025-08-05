package com.itb.inf2em.pizzariae.controller;

import com.itb.inf2em.pizzariae.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    private List<Categoria> categorias = new ArrayList<Categoria>();

    @GetMapping

    public List<Categoria> findAllcategorias() {

        Categoria c1 = new Categoria();
        c1.setNome("Doce");
        c1.setDescricao("Nessa categoria é abrigado todas as opções doces do estabelecimento, como sorvetes, pizzas doces, Petit gateau etc.");


        categorias.add(c1);

        Categoria c2 = new Categoria();
        c2.setNome("Bebidas");
        c2.setDescricao("Nessa categoria é abrigado todas as opções de bebidas do estabelecimento, como refrigerantes, sucos naturais, milkshakes etc.");


        categorias.add(c2);

        return categorias;
    }

}
