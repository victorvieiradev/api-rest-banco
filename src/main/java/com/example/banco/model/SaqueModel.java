package com.example.banco.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@NoArgsConstructor
@Entity
public class SaqueModel extends ContaBancariaModel{
    public SaqueModel(Long id, String agencia, String numero, String titular, BigDecimal valorFornecido, String servico) {
        super(id, agencia, numero, titular, valorFornecido, servico);
        this.sacar();
    }
    public BigDecimal sacar(){
        this.setSaldoAtual(this.getSaldoAtual().subtract(this.getValorFornecido()));
        this.setSaldoFinal(this.getSaldoAtual());
        return this.getSaldoAtual();
    }
}
