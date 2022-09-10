package br.edu.fatecfranca.lista1.exe0;

// algo abstrato e serve de modelo para seus objetos
public class Produto {
    public String nome; //Tipo de dado é String (uma class)
    public int qtde; //Tipo de dados é int (tipo primitivo)
    public double preco; //Tipo de dado é double (tipo primitivo)

    //cria um método construtor 
    public Produto() {
        
    }
    //cria um método construtor
    public Produto(String nome, int qtde, double preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    // método que compra um produto, aumentando sua qtde
    // método não retorna nada
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x) {
        if(x <= this.qtde) {
            this.qtde = this.qtde - x;
        } else {
            System.out.println("Sem estoque"); 
        }
       
    }
    
    // this representa o objeto que chama o método
    public void mostrar() {
        System.out.println(" Nome: " + this.nome + " Qtde: " +
                this.qtde + " Preço: " + this.preco);
    }
    
    // subir preço
    public void subir(int x) {
        this.preco += x;
    }
    
    // abaixar preço
    public void descer(int x) {
        if(x <= this.preco) {
            this.preco -= x;
        } else {
            System.out.println("Preço não pode ser negativo");
        }
    }
}

