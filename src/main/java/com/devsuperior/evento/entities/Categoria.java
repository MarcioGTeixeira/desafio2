package com.devsuperior.evento.entities;

import com.devsuperior.evento.entities.Atividade;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Atividade> atividades = new ArrayList<>();

    public Categoria() {}
    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    // Getters e Setters
}