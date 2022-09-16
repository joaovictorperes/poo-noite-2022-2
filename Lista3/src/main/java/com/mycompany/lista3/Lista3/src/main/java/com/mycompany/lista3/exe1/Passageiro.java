
package com.mycompany.lista3.exe1;

public class Passageiro {
    private int id;
    private String nome;
    private String cidade;

    public Passageiro() {
        
    }

    public Passageiro(int id, String nome, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "id=" + id + ", nome=" + nome + ", cidade=" + cidade + '}';
    }
    
    
}
