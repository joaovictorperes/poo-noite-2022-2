
package br.edu.fatecfranca.lista2.exe1;

public final class Cliente {
    private String numeroConta, numeroAgencia,nome;
    private float saldo;
    
    public Cliente() {
        
    }   
    
    public Cliente(String numeroConta, String numeroAgencia,
        String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            if (numeroConta.charAt(6) == "-") {
                this.numeroConta = numeroConta;
            } else {
                System.out.println("Digito verificador errado");
            } 
        } else {
            System.out.println("Tamanho Inválido");
        }
    }
    
    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6) {
            if (numeroAgencia.charAt(6) == "-") {
                this.numeroAgencia = numeroAgencia;
            } else {
                System.out.println("Digito verificador errado");
            } 
        } else {
            System.out.println("Tamanho Inválido");
        }
    }
    

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Tamanho Inválido");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo negativo");
        }
    }
    
    public void depositar(float x) {
        this.saldo += x;
    }
    
    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }
    
    
}


