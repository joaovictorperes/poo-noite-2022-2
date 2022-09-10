/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.Lista1.exe3;

import br.edu.fatecfranca.Lista1.exe1.*;

public class Testa {
    public static void main(String[] args) {
        // vamos criar um objeto da classe Produto -> INSTANCIAR A CLASSE
        Produto obj1 = new Produto();
        obj1.nome = "Liquidificador";
        obj1.qtde = 3;
        obj1.preco = 348;
        obj1.mostrar();
        obj1.vender(2);
        obj1.subir(20);

        System.out.println("\nNome: " + obj1.nome + " Qtde: " + obj1.qtde +
                " Preço: " + obj1.preco);

        // instanciar mais um objeto como exercício
        Produto obj2 = new Produto();
        obj2.nome = "Bola de futebol";
        obj2.preco = 90.30f;
        obj2.qtde = 6;
        System.out.println("\nNome: " + obj2.nome + " Qtde: " + obj2.qtde +
                " Preço: " + obj2.preco);
        obj2.comprar(10);
        obj2.descer(30);
        obj2.mostrar();
    }
}
    

