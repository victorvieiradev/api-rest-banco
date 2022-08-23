package com.example.banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contabancaria")
public abstract class ContaBancariaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String agencia;
    private String numero;
    private String titular;
    private BigDecimal saldoAtual;
    private BigDecimal saldoFinal;
    private BigDecimal valorFornecido;
    private String servico;

    public ContaBancariaModel(Long id, String agencia, String numero, String titular) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldoAtual = new BigDecimal("0.0");
        this.saldoFinal = new BigDecimal("0.0");
        this.valorFornecido = new BigDecimal("0.0");
    }

    public ContaBancariaModel(Long id, String agencia, String numero, String titular, BigDecimal valorFornecido, String servico) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.valorFornecido = valorFornecido;
        this.servico = servico;
    }




}
