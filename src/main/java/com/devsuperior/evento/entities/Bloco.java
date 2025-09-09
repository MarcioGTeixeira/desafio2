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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }

}