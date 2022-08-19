package br.edu.fatecfranca.lista1;

public class Lista1 {

    public static void main(String[] args) {
        
        // criar objetos da classe Produto
        // criar instâncias da classe Produto
        Produto obj1 = new Produto();
        obj1.nome = "Máscara";
        obj1.qtde = 100;
        obj1.preco = 5;
        
        obj1.comprar(10);
        obj1.vender(5);
        
        System.out.println(" Nome: " + obj1.nome + " Qtde: " +
                obj1.qtde + " Preço: " + obj1.preco);
        
        // vamos instanciar explorando o método contrutor
        // método que tem o mesmo nome da classe
        // método que inicializa as variáveis da classe
        Produto obj2 = new Produto("Bola de basquete",10,120);
        obj2.comprar(3);
        obj2.vender(2);
        System.out.println(" Nome: " + obj2.nome + 
                " Qtde: " + obj2.qtde + " Preço: " + obj2.preco);
        
        
        Produto obj3 = new Produto("Fortinite",1,39.90);
        obj3.comprar(1);
        obj3.vender(3);
        System.out.println(" Nome: " + obj3.nome + 
                " Qtde: " + obj3.qtde + " Preço: " + obj3.preco);
    }
}

// objetos são campos únicos na memória
// this é quem chamou o construtor
