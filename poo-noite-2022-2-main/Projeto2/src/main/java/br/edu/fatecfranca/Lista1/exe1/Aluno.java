
package br.edu.fatecfranca.Lista1.exe1;


public class Aluno {
    public int nroAluno; // tipo primitivo
    public String nome; // tipo de classe
    public int idade;
    public double p1, p2; // tipo primitivo
    
    
    // construtor sem parâmetro
    public Aluno(){
                
    }
    
    public Aluno (int nroAluno, String nome, int idade, double p1, double p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // calcula e retorna média final
    public double notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    // retorna os dados do Aluno
    public String dadosAluno(){
        return " Nome: " + this.nome +
                " Nro Aluno: " + this.nroAluno +
                " Idade: " + this.idade +
                " Média: " + this.notaFinal();
    }
    
    // verifica se os alunos passaram
    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println("Aluno Aprovado");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
}
