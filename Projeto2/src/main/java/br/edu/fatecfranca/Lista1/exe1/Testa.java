package br.edu.fatecfranca.Lista1.exe1;

public class Testa {
    public static void main(String[] args) {
        //Aluno 1
        Aluno obj1 = new Aluno(); //construtor s/ parâmetro
        obj1.nome = "Pedro";
        obj1.nroAluno = 123;
        obj1.idade = 18;
        obj1.p1 = 7.4;
        obj1.p2 = 6.9;
        System.out.println(obj1.dadosAluno());
        obj1.passou();

        //Aluno 2
        Aluno obj2 = new Aluno(456, "João",21, 3.9,6.1 );
        System.out.println(obj2.dadosAluno());
        obj2.passou();
    }
}
