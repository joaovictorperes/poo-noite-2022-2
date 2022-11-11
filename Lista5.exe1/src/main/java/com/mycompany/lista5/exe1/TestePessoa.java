/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista5.exe1;

/**
 *
 * @author 1090482111028
 */
public class TestePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        
        objPessoa.come();
        objPessoa.ensina();
        objPessoa.pagaIr();
        objPessoa.tiraCpf();
        objPessoa.tiraRG();
        objPessoa.trabalha();
        objPessoa.vota();
        objPessoa.respira();

        IContribuinte objContribuinte = new Pessoa();
        objContribuinte.pagaIr();
        objContribuinte.tiraCpf();
        
        IProfessor objProfessor = new Pessoa();
        objProfessor.ensina();
    }
    
}
