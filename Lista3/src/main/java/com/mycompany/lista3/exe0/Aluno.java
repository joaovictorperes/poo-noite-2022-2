package com.mycompany.lista3.exe0;

public class Aluno {
    private int id;
    private String nome;
    private String endereco;

    public Aluno() {
        
    }

    public Aluno(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override // método foi anulado
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    
}
