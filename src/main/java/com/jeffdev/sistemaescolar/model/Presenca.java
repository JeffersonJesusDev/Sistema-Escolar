package com.jeffdev.sistemaescolar.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_presenca")
    private Long id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Professor professor;

    @Column(name = "data_presenca")
    private LocalDate dataPresenca;


    public Presenca() {
    }

    public Presenca(Long id, Aluno aluno, Sala sala, Professor professor, LocalDate dataPresenca) {
        this.id = id;
        this.aluno = aluno;
        this.sala = sala;
        this.professor = professor;
        this.dataPresenca = dataPresenca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getDataPresenca() {
        return dataPresenca;
    }

    public void setDataPresenca(LocalDate dataPresenca) {
        this.dataPresenca = dataPresenca;
    }
}
