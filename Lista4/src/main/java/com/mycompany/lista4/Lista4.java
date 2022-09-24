/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista4;

import java.util.ArrayList;

/**
 *
 * @author 1090482111028
 */
public class Lista4 {

    public static void convertString(Funcionario objFuncionario) {
       // objFuncionario = objGerente
       // OU
       // objFuncionario = objAssistente
       // OU
       // objFuncionario = objDiretor
       // OU
       
       // Para termos polimorfismo, é necessário:
       // 1) herança
       // 2)anulação de métodos
       // 3)
       
       System.out.println(objFuncionario.toString()); // Ocorre o pofimorfismo
    }
    
    public static void salarioFun(Funcionario objFuncionario) {
       System.out.println("Salário Final: " + objFuncionario.calculaSalario());
    }
    
    public static void main(String[] args) {
       Gerente objGerente = new Gerente(2000, " Fulano", 
               " 123", 1, 4000, 40);
       convertString(objGerente);
       salarioFun(objGerente);

       Assistente objAssistente = new Assistente(10, " Fulano", 
                " Beltrano", " 345",2, 2000, 40);
       convertString(objAssistente);
       salarioFun(objAssistente);


       Diretor objDiretor = new Diretor(10, " Ciclano", 
               " 789", 3, 5000, 40);
       convertString(objDiretor);
       salarioFun(objDiretor);

       
       // criando vetor de Funcionário
       ArrayList<Funcionario> vetor = new ArrayList();
       vetor.add(objGerente);
       vetor.add(objDiretor);
       vetor.add(objAssistente);
   }
}
