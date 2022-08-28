
package br.edu.fatecfranca.Lista1.exe4;


public class Testa {
    public static void main(String[] args) {
        //Primeiro rio
       Rio rio1 = new Rio("Amazonas", 1.86, false);
       rio1.chover(0.54);
       rio1.ensolarado(0.3);
       rio1.mostra();
       rio1.chover(0.30);
       rio1.sujar();
       rio1.mostra();

       //Segundo rio
       Rio rio2 = new Rio("Tietê", 0.87, true);
       rio2.mostra();
       rio2.chover(0.8);
       rio2.ensolarado(0.4);
       rio2.limpar();
       rio2.mostra();

       //Terceiro rio
       Rio rio3 = new Rio();
       rio3.nome = "Grande";
       rio3.nivel = 1.30;
       rio3.poluido = true;
       rio3.mostra();
       rio3.chover(0.21);
       rio3.limpar();
       rio3.mostra();
    }
    
}
