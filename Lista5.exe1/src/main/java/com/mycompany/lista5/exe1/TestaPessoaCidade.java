/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista5.exe1;

/**
 *
 * @author 1090482111028
 */
public class TestaPessoaCidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa fulano = new Pessoa();
        Cidade franca = new Cidade();
        franca.contrata(fulano); //contrata professor
        
        //conversão de objetos - convertendo um professor em um empregado
        franca.contrata((IEmpregado) fulano); //contrata Empregado
        franca.cobraDe(fulano);
        franca.cobraDe(fulano);
        franca.registra(fulano);
        franca.alimenta(fulano);
    }
    
}
