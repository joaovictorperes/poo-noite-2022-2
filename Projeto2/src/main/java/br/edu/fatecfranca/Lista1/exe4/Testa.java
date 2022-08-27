
package br.edu.fatecfranca.Lista1.exe4;


public class Testa {

    
  
    public static void main(String[] args) {
       Rio rio1 = new Rio("Amazonas", 1.86, false);
       rio1.chover(0.54);
       rio1.ensolarado(0.3);
       
        Rio rio2 = new Rio("Tietê", 0.87, true);
        rio2.chover(0.8);
        rio2.ensolarado(0.4);
       
    }
    
}
