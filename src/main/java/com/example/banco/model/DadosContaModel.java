package com.example.banco.model;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class DadosContaModel {
    private Long id;
    private String agencia;
    private String numero;
    private String titular;
    private BigDecimal saldoAtual;
    private BigDecimal saldoFinal;
    private BigDecimal valorFornecido;
    private String servico;
}
