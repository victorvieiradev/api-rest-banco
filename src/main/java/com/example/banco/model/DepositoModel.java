package com.example.banco.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@Entity
public class DepositoModel extends  ContaBancariaModel{
    public DepositoModel(Long id, String agencia, String numero, String titular, double valorFornecido, String servico) {
        super(id, agencia, numero, titular, valorFornecido, servico);
        this.depositar();
    }


    public void depositar() {
        this.setSaldoFinal(this.getSaldoAtual()+this.getValorFornecido());
    }
}
