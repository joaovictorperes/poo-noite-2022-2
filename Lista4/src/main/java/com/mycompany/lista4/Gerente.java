
package com.mycompany.lista4;

// Classe não tem conteúdo de variável
public class Gerente extends Funcionario {
    private float bonificacao;

    public Gerente() {
        super();
    }

    public Gerente(float bonificacao, String nome, String cpf, 
            int codigo, float salario, float cargaHoraria) {
        
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.bonificacao = bonificacao;
    }

    // somente da bonificacao
    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override 
    public String toString() {
        return "Gerente{" + "bonificacao=" + bonificacao + 
                super.toString() + '}';
    }
    // super.toString() chama novamente a super classe
    
}
