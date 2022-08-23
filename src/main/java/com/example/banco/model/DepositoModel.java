package com.example.banco.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@NoArgsConstructor
@Entity
public class DepositoModel extends  ContaBancariaModel{
    public DepositoModel(Long id, String agencia, String numero, String titular, BigDecimal valorFornecido, String servico) {
        super(id, agencia, numero, titular, valorFornecido, servico);
        this.depositar();
    }


    public BigDecimal depositar() {
        this.setSaldoFinal(this.getValorFornecido().add(this.getSaldoAtual()));
        this.setSaldoAtual(this.getSaldoFinal());
        return this.getSaldoFinal();
    }
}
