package br.edu.fatecfranca.Lista1.exe2;

public class Cliente {
    
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;   //atributo

    //construtor sem parâmetros
    public Cliente(){

    }
    
    public Cliente( int nroConta, int nroAgencia, String nome, double saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void depositar(double x){
        this.saldo += x;
    }
    
    public void sacar(double x){
        if(x <= this.saldo){
            this.saldo -= x;
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }
    
    //retornar
    //parastring convertendo objeto em string
    public String paraString(){
        return  " Nro Agência: " + this.nroAgencia +
                " Nro Conta: " + this.nroConta +
                " Nome: " + this.nome +
                " Saldo: " + this.saldo;
    }
}
