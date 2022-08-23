package com.example.banco.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@NoArgsConstructor
@Entity
public class ContaModel extends ContaBancariaModel{
    public ContaModel(Long id, String agencia, String numero, String titular) {
        super(id, agencia, numero, titular);
    }
}
