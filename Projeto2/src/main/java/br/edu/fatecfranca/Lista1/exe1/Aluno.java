
package br.edu.fatecfranca.Lista1.exe1;


public class Aluno {
    public int nroAluno; // tipo primitivo
    public String nome; // tipo de classe
    public double p1, p2; // tipo primitivo
    
    
    // construtor sem parâmetro
    
    public Aluno(){
                
    }
    
    public Aluno (int nroAluno, String nome, double p1, double p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // calcula e retorna média final
    
    public double notaFinal(){
        return (this.p1 + this.p2) / 2;
        
    }
    
    // retorna os dados do Aluno
    
    public String dadosAluno(){
        return " Nome: " + this.nome + " Nro Aluno " + this.nroAluno + " Média " + this.notaFinal()+ "\n";
    }
    
    // verifica se os alunos passaram
    
    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println("Aluno Aporvado");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
}
