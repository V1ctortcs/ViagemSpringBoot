package com.patyelizatur.controller;

import com.patyelizatur.model.Hospedagem;
import com.patyelizatur.model.Veiculo;
import com.patyelizatur.repository.PassageiroRepository;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("veiculo")
public class VeiculoController {

    @ApiOperation("Lista todos Veiculos cadastrados")
    @GetMapping(path = "/findall")
    public ResponseEntity<Veiculo> listAll(){
        List<Veiculo> veiculos = new ArrayList();
        return new ResponseEntity<Veiculo>(HttpStatus.OK);
    }

    @ApiOperation("Lista todos Veiculos cadastrados por id")
    @GetMapping(path = "/findCnpj/{id}")
    public ResponseEntity<Veiculo> listId(@PathVariable("id") Integer id){
        return new ResponseEntity<Veiculo>(HttpStatus.OK);
    }

    @ApiOperation("Lista todos Veiculos cadastrados por nome")
    @GetMapping(path = "/findNome/{nome}")
    public ResponseEntity<Veiculo> listNome(@PathVariable("nome") String nome){
        return new ResponseEntity<Veiculo>(HttpStatus.OK);
    }

    @ApiOperation("Cadastrar Veiculos")
    @PostMapping
    public ResponseEntity<Veiculo> save(@Valid Hospedagem hospedagem){
        return new ResponseEntity<Veiculo>(HttpStatus.CREATED);
    }

    @ApiOperation("Deletar Veiculos de acordo com o id")
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Veiculo> delete(@PathVariable("id") Integer id){
        return new ResponseEntity<Veiculo>(HttpStatus.OK);
    }

    @ApiOperation("Atualizar Veiculos de acordo com o id")
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Veiculo> update(@PathVariable("id") Integer id){
        return new ResponseEntity<Veiculo>(HttpStatus.OK);
    }

}
