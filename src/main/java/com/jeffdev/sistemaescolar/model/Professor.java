package com.jeffdev.sistemaescolar.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_professor")
    private Long id;

    @Column(name = "nome_professor")
    private String nome;

    @Column(name = "email_professor")
    private String email;

    @OneToMany(mappedBy = "professor")
    private List<Aluno> alunos;

    public Professor() {
    }

    public Professor(Long id, String nome, String email, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        //this.alunos = alunos;
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


}
