/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista3.exe1;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        Passageiro objP = new Passageiro(1, "Fulano", "Franca");
        
        Voo objV = new Voo(10, "Campinas", "Belo Horizonte");
        
        Reserva objR = new Reserva(100, new Date(), objP, objV);
        
        System.out.println(objR.toString());
        
    }
    
}
