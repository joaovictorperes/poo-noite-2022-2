package br.edu.fatecfranca.lista2;

import br.edu.fatecfranca.Lista2.exe0.Produto;
import br.edu.fatecfranca.lista2.exe0.Rio;

public class Lista2 {

    public static void main(String[] args) {
        Produto obj1 = new Produto();
        //utilza-se set para passar um valor por objeto
        //Toda variável privada deve ter getters e setters
        //Settar => atribuir um valor
        //Get => recuperar um valor
        obj1.setNome("Ovo");
        obj1.setQtde(-10);
        obj1.setPreco(-52);
        System.out.println("Nome: " + obj1.getNome());
        
        Produto obj2 = new Produto();
        obj2.setNome("Pão");
        obj2.setQtde(10);
        obj2.setPreco(52);
        System.out.println("Preço: " + obj2.getPreco());

        Produto obj3 = new Produto("Remédio para memória ",-4,-35.2);
        obj3.setNome("casa");
        
        //////////Rios
        Rio obj4 = new Rio();
        obj4.setNivel(0.004);
        obj4.setNome("Nilo");
        obj4.setPoluido(false);

        Rio obj5 = new Rio("Paraná", 2.34f, true);
        System.out.println(obj5.mostra());
    }
}
