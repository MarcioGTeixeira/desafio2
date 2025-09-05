package com.devsuperior.evento.entities;
import jakarta.persistence.*;

@Entity
@Table(name ="tb_participante")
    public class Participante {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;

        @Column(unique = true)
        private String email;

        @ManyToOne
        @JoinColumn(name = "atividade_id")
        private Atividade atividade;

    public Participante() {
    }

    public Participante(Long id, String nome, String email, Atividade atividade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.atividade = atividade;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}

