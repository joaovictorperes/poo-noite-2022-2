package br.edu.fatecfranca.Lista1.exe3;

// Classe serve como ABSTRATO e serve de modelo para seus objetos
public class Produto {
    public String nome; // tipo de dado string (uma classe)
    public int qtde; // tipo de dado é int (tipo primitivo)
    public double preco; // tipo de dado double (tipo primitivo)
    
    //cria um método construtor
    public Produto(){
        
    }
    
    //Criar um metódo construtor
    public Produto(String nome, int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    // metodo que compra um produto, aumentando a quantidade
    //metodo não retorna nada
    public void comprar(int x){
        this.qtde = this.qtde + x;
        
    }
    
    public void vender(int x) {
        if (x <= this.qtde) {
            this.qtde = this.qtde - x;
        } else {
            System.out.println("\nSem estoque");
        }
    }
    
    public void mostrar(){
        System.out.println("\nNome: " + this.nome + " Qtde: " +
                this.qtde + " Preço: " + this.preco);
    }
    
    public void subir(double x){
         this.preco += x;
    }
    
    public void descer(double x){
        if(x <= this.preco){
         this.preco -= x;
        } else {
            System.out.println("\nPreço não pode ser negativo");
        }
    }
}
    
