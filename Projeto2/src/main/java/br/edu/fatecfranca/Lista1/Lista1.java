package br.edu.fatecfranca.Lista1;

import br.edu.fatecfranca.Lista1.exe3.Produto;

/**
 *
 * @author Lidiane
 */
public class Lista1 {
    public static void main(String[] args) {
        //criar objetos da classe Produto
        //criar instâncias da classe produto
        Produto obj1 = new Produto();
        obj1.nome = "Máscara";
        obj1.qtde = 100;
        obj1.preco = 5;
       
        
        //adicionar objeto na mascara
        obj1.comprar(10);
        obj1.vender(5);
        obj1.mostrar();
        obj1.subir(1);
        obj1.descer(0.50);
        
       // System.out.println("Nome: " + obj1.nome + "Qtde: " + obj1.qtde + "Preço" + obj1.preco);
    
        // Vamos instanciar  explorando o método construtor
        // metodo que tem o mesmo nome da classe
        // metodo que inicializa as váriaveis da classe
        //Primeira maneira de fazer
        //Produto obj2 = new Produto();
        //obj2.nome = "bola de basquete";
       // obj2.qtde = 10;
        //obj2.preco = 93.90;
       // System.out.println("Nome: " + obj2.nome + "Qtde: " + obj2.qtde + "Preço" + obj2.preco);
        
        Produto obj2 = new Produto("bola de basquete", 10, 93.90);
       
         obj2.comprar(3);
         obj2.vender(2);
         obj2.mostrar();
         obj2.subir(5);
         obj2.descer(10);
        // System.out.println("Nome: " + obj2.nome + "Qtde: " + obj2.qtde + "Preço" + obj2.preco);
        
        
        
        Produto obj3 = new Produto("Fortinite", 1, 39.90);
    
        obj3.comprar(1);
        obj3.vender(2);
        obj3.mostrar();
        obj3.subir(5);
        obj3.descer(10);
        
        //System.out.println("Nome: " + obj3.nome + "Qtde: " + obj3.qtde + "Preço" + obj3.preco);
        
    }
}
