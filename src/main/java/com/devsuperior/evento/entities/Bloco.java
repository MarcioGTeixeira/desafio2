package com.devsuperior.evento.entities;

import com.devsuperior.evento.entities.Atividade;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="tb_bloco")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime inicio;
    private LocalDateTime fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco() {}
    public Bloco(LocalDateTime inicio, LocalDateTime fim, Atividade atividade) {
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }

    // Getters e Setters
}