package br.edu.fatecfranca.Lista1.exe2;

public class Testa {
    public static void main(String[] args) {
      //Cliente 1
      Cliente obj1 = new Cliente();
      obj1.nome = "Fulano";
      obj1.nroAgencia = 111;
      obj1.nroConta = 222;
      obj1.saldo = 0;
      System.out.println(obj1.paraString());
      obj1.depositar(2000);
      obj1.sacar(300);
      System.out.println(obj1.paraString());

      //Cliente 2
      Cliente obj2 = new Cliente(444, 333, "Beltrano", 0 );
      System.out.println(obj2.paraString());
      obj2.depositar(800);
      obj2.sacar(1300);
      System.out.println(obj2.paraString());
    }
}
