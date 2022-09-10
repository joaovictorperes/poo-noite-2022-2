package br.edu.fatecfranca.Lista1.exe4;

public class Rio {
    
    public String nome;
    public double nivel;
    public boolean poluido; // true -está poluido, false- não está poluido
    
  // construtor sem parametros
    public Rio(){
        
    }
    
    public Rio(String nome, double nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void ensolarado (double x){
       if(x <= this.nivel){
           this.nivel -= x;
           System.out.println("Nível do Rio foi diminuido");
       }
       else {
           System.out.println("Nível não pode ser negativo");
       }
    }
    
    public void chover(double x){
        this.nivel += x;
        System.out.println("Nível do Rio foi aumentado");
    }
    
    public void sujar(){
        if(this.poluido){
            System.out.println("Rio já poluido");
        }
        else {
            this.poluido = true;
            System.out.println("Rio foi sujado");
        }
    }
    
    public void limpar(){
        if (!this.poluido) {
            System.out.println("Rio já limpo");
        }
        else{
            this.poluido = false;
            System.out.println("Rio foi limpo");
        }
    }

    public void mostra() {
        String aux = this.poluido ? "Sim" : "Não";
        System.out.printf("\nNome: " + this.nome +
                " Nível: " + this.nivel +
                " Poluído: " + aux + "\n");
    }
}
