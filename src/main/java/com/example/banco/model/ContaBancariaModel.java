package com.example.banco.model;

import lombok.*;

import javax.persistence.*;

@Data
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
    private double saldoAtual;
    private double saldoFinal;
    private double valorFornecido;
    private String servico;

    public ContaBancariaModel(Long id, String agencia, String numero, String titular) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldoAtual = 0;
        this.saldoFinal = 0;
        this.valorFornecido = 0;
    }

    public ContaBancariaModel(Long id, String agencia, String numero, String titular, double valorFornecido, String servico) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.valorFornecido = valorFornecido;
        this.servico = servico;
    }




}
