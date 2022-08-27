/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe0;

/**
 *
 * @author Lidiane
 */
public class Carro {
    public String marca;
    public String modelo;
    public double velAtual;
    public boolean statusMotor; // true ou false


public Carro(){
}
    
    // crie os dois construtores da classe carro
      public Carro(String marca, String modelo, double velAtual, boolean statusMotor){
      this.marca = marca;
      this.modelo = modelo;
      this.velAtual = velAtual;
      this.statusMotor = statusMotor;
        
      }
    
    
  // faça um metodo para ligar o motor do carro

public void ligar(){
this.statusMotor = true;
}
    

 // faça um metodo para desligar o motor do carro

public void desligar(){
    if (this.velAtual > 0){
        this.velAtual = 0;
    }
    if (this.statusMotor){
        this.statusMotor = false;
    }
}


//Faça um metodo para acelerar o carro de x unidades

public void acelerar(double x){
    if (this.statusMotor){
this.velAtual += x;

    }
}
//Faça um método para frear o carro x de unidades

public void frear(double x){
    if(this.statusMotor){
        if (x <=this.velAtual){
             this.velAtual -=x;
             }
         } else System.out.println("Vel não pode ser negativo");
    }

}
