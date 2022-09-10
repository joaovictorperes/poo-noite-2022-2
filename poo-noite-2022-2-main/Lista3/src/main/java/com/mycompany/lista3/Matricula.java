/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Date;

/**
 *
 * @author 1090482111028
 */
public class Matricula {
    private int id;
    private Date data;
    //associação - agragação;
    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula() {
        
    }

    public Matricula(int id, Date data, Aluno aluno, Disciplina disciplina) {
        this.id = id;
        this.data = data;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
}