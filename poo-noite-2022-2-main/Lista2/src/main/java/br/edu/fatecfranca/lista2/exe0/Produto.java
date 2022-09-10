package br.edu.fatecfranca.Lista2.exe0;

// Classe serve como ABSTRATO e serve de modelo para seus objetos
public final class Produto {
    //criar variáveis apenas privadas
    private String nome; // tipo de dado string (uma classe)
    private int qtde; // tipo de dado é int (tipo primitivo)
    private double preco; // tipo de dado double (tipo primitivo)
    
    //cria um método construtor
    public Produto(){
        
    }
    
    //Criar um metódo construtor
    public Produto(String nome, int qtde, double preco){
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    
    //Set
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQtde(int qtde) {
        if (qtde >= 0) 
            this.qtde = qtde;
        else 
            System.out.println("Qtde negativa");
    }
    
    public void setPreco(double preco) {
        if (preco >= 0)
            this.preco = preco;
        else
            System.out.println("Preço negativo");
    }
    
    //Get
    public String getNome() { //Tem tipo de retorna da variável
        return this.nome;     //Não tem parâmetro
    }
    
     public int getQtde() {
        return this.qtde;
    }
     
     public double getPreco() {
         return this.preco;
     }
    
    // metodo que compra um produto, aumentando a quantidade
    //metodo não retorna nada
    public void comprar(int x){
        this.qtde = this.qtde + x;
        
    }
    
    public void vender(int x) {
        this.setQtde(this.qtde - x);
        /*if (x <= this.qtde) {
            this.qtde = this.qtde - x;
        } else {
            System.out.println("\nSem estoque");
        }*/
    }
    
    public void mostrar(){
        System.out.println("\nNome: " + this.nome + " Qtde: " +
                this.qtde + " Preço: " + this.preco);
    }
    
    public void subir(double x){
         this.preco += x;
    }
    
    public void descer(double x){
        this.setPreco(this.preco - x);
        /*if(x <= this.preco){
         this.preco -= x;
        } else {
            System.out.println("\nPreço não pode ser negativo");
        }*/ 
    }
}
    
