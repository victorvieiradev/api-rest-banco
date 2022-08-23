package com.example.banco.service;

import com.example.banco.model.ContaBancariaModel;
import com.example.banco.model.DadosContaModel;
import com.example.banco.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {
    @Autowired
    private ContaBancariaRepository contaBancariaRepository;
    @Autowired
    private ContaBancariaFactory contaBancariaFactory;
    public List<ContaBancariaModel> buscarContasCadastradas(){
        return contaBancariaRepository.findAll();
    }
    public Optional<ContaBancariaModel> buscarContaPorId(Long id){
        return contaBancariaRepository.findById(id);
    }
    public ContaBancariaModel cadastrarNovaConta(DadosContaModel dados ){
        ContaBancariaModel conta = contaBancariaFactory.gerarNovaConta(dados);
        return  contaBancariaRepository.save(conta);
    }
    public void excluirConta(Long id){
        contaBancariaRepository.deleteById(id);
    }
    public ContaBancariaModel atualizarConta(DadosContaModel dados ){
        ContaBancariaModel conta = contaBancariaFactory.gerarNovaConta(dados);
        return contaBancariaRepository.save(conta);
    }
    public ContaBancariaModel depositar(DadosContaModel dados ){
        ContaBancariaModel conta = contaBancariaFactory.gerarServico(dados);
        return contaBancariaRepository.save(conta);
    }
    public ContaBancariaModel sacar(DadosContaModel dados ){
        ContaBancariaModel conta = contaBancariaFactory.gerarServico(dados);
        return contaBancariaRepository.save(conta);
    }
}
