package com.example.banco.service;

import com.example.banco.model.*;
import org.springframework.stereotype.Service;

@Service
public class ContaBancariaFactory {
    public ContaBancariaModel gerarServico(DadosContaModel dados ){
        if ("DEPOSITO".equalsIgnoreCase(dados.getServico())){
            return  new DepositoModel(dados.getId(), dados.getAgencia(), dados.getNumero(), dados.getTitular(), dados.getValorFornecido(), dados.getServico());
        }else if ("SACAR".equalsIgnoreCase(dados.getServico())){
            return  new SaqueModel(dados.getId(), dados.getAgencia(), dados.getNumero(), dados.getTitular(), dados.getValorFornecido(), dados.getServico());
        }
        return  null;
    }
    public ContaBancariaModel gerarNovaConta(DadosContaModel dados ){
        return  new ContaModel(dados.getId(), dados.getAgencia(), dados.getNumero(), dados.getTitular());
    }
}
