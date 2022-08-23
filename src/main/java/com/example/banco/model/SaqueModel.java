package com.example.banco.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@Entity
public class SaqueModel extends ContaBancariaModel{
    public SaqueModel(Long id, String agencia, String numero, String titular, double valorFornecido, String servico) {
        super(id, agencia, numero, titular, valorFornecido, servico);
        this.sacar();
    }
    public void sacar(){
        this.setSaldoFinal(this.getSaldoAtual()-this.getValorFornecido());
    }

}
