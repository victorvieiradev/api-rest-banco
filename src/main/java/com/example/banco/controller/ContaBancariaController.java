package com.example.banco.controller;

import com.example.banco.model.ContaBancariaModel;
import com.example.banco.model.DadosContaModel;
import com.example.banco.service.ContaBancariaFactory;
import com.example.banco.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {
    @Autowired
    private ContaBancariaService contaBancariaService;
    @GetMapping(path = "/buscar")
    public ResponseEntity<List<ContaBancariaModel>> exibirContas(){
        return ResponseEntity.ok(contaBancariaService.buscarContasCadastradas());
    }
    @GetMapping(path = "/buscar/{id}")
    public ResponseEntity<Optional<ContaBancariaModel>> buscarContaporId(@PathVariable Long id){
        return ResponseEntity.ok(contaBancariaService.buscarContaPorId(id));
    }
    @PostMapping(path = "/cadastrar")
    public ResponseEntity<ContaBancariaModel> cadastrarConta(@RequestBody DadosContaModel dados ){
        ContaBancariaModel conta = contaBancariaService.cadastrarNovaConta(dados);
        return new ResponseEntity<>(conta, HttpStatus.CREATED);
    }
    @PutMapping(path = "/editar/{id}")
    public ResponseEntity<ContaBancariaModel> editarConta(@RequestBody DadosContaModel dados ){
        return  ResponseEntity.ok(contaBancariaService.atualizarConta(dados));
    }
    @DeleteMapping(path = "/conta/{id}")
    public void excluirConta(@PathVariable Long id){
        contaBancariaService.excluirConta(id);
    }
    @PutMapping(path = "/depositar/{id}")
    public ContaBancariaModel depositar(@RequestBody DadosContaModel dados ){
        return contaBancariaService.depositar(dados);
    }
    @PutMapping(path = "/sacar/{id}")
    public ContaBancariaModel sacar(@RequestBody DadosContaModel dados ){
        return contaBancariaService.sacar(dados);
    }
}
