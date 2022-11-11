/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista5.exe1;

/**
 *
 * @author 1090482111028
 */

//quando uma classe implementa uma interface, ela é obrigada a
//implementar todos os métodos da interface
public class Pessoa extends Animal implements ICidadao, IContribuinte, IProfessor{
    
    @Override
    public void vota() {
        System.out.println("Pessoa votando...");
    }

    @Override
    public void tiraRG() {
        System.out.println("Pessoa tirando RG...");
    }

    @Override
    public void pagaIr() {
        System.out.println("Pessoa pagando IR...");
    }

    @Override
    public void tiraCpf() {
        System.out.println("Pessoa tirando CPF...");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando...");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhando...");
    }

    
}
