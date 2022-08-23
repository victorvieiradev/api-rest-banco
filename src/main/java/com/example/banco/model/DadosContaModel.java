package com.example.banco.model;

import lombok.Data;

@Data
public class DadosContaModel {
    private Long id;
    private String agencia;
    private String numero;
    private String titular;
    private double saldoAtual;
    private double saldoFinal;
    private double valorFornecido;
    private String servico;
}
