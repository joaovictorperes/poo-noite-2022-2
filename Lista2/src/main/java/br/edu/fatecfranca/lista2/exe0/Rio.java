package br.edu.fatecfranca.lista2.exe0;

public final class Rio {
    
    private String nome;
    private double nivel;
    private boolean poluido; // true -está poluido, false- não está poluido
    
  // construtor sem parametros
    public Rio(){
        
    }
    
    public Rio(String nome, double nivel, boolean poluido){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setPoluido(poluido);
    }
    
    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNivel(double nivel) {
        if(nivel <= 0){
           this.nivel = nivel;
           System.out.println("Nível do Rio foi diminuido");
       } else {
           System.out.println("Nível não pode ser negativo");
       }
    }
    
    public void setPoluido(boolean poluido) {
        this.poluido = poluido;
    }
    
    //get
    public String getNome() {
        return this.nome;
    }
    
    public double getNivel() {
        return this.nivel;
    }
    
    public boolean isPoluido() { //excepcionalmente
        return this.poluido;
    }

    //métodos
    public void ensolarado (double x){
        this.setNivel(this.nivel - x);
       /*if(x <= this.nivel){
           this.nivel -= x;
           System.out.println("Nível do Rio foi diminuido");
       }
       else {
           System.out.println("Nível não pode ser negativo");
       }*/
    }
    
    public void chover(double x){
        this.nivel += x;
        System.out.println("Nível do Rio foi aumentado");
    }
    
    public void sujar(){
        if(this.poluido){
            System.out.println("Rio já poluido");
        } else {
            this.poluido = true;
            System.out.println("Rio foi sujado");
        }
    }
    
    public void limpar(){
        if (!this.poluido) {
            System.out.println("Rio já limpo");
        } else {
            this.poluido = false;
            System.out.println("Rio foi limpo");
        }
    }

    public String mostra() {
        String aux = this.poluido ? "Sim" : "Não";
        return "\nNome: " + this.nome +
                " Nível: " + this.nivel +
                " Poluído: " + aux + "\n";
    }
}
