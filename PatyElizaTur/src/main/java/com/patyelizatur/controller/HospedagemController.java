package com.patyelizatur.controller;

import com.patyelizatur.model.Hospedagem;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("hospedagem")
public class HospedagemController {

    @ApiOperation("Listar todas as hospedagens cadastradas")
    @GetMapping(path = "/findall")
    public ResponseEntity<Hospedagem> listAll(){
        return new ResponseEntity<Hospedagem>(HttpStatus.OK);
    }

    @ApiOperation("Listar todas as hospedagens cadastradas por cnpj")
    @GetMapping(path = "/findCnpj/{cnpj}")
    public ResponseEntity<Hospedagem> listCnpj(@PathVariable("cnpj") String cnpj){
        return new ResponseEntity<Hospedagem>(HttpStatus.OK);
    }

    @ApiOperation("Listar todas as hospedagens cadastradas por nome")
    @GetMapping(path = "/findNome/{nome}")
    public ResponseEntity<Hospedagem> listCNome(@PathVariable("nome") String nome){
        return new ResponseEntity<Hospedagem>(HttpStatus.OK);
    }

    @ApiOperation("Cadastrar hospedagens")
    @PostMapping
    public ResponseEntity<Hospedagem> save(@Valid Hospedagem hospedagem){
        return new ResponseEntity<Hospedagem>(HttpStatus.CREATED);
    }

    @ApiOperation("Deletar hospedagens de acordo com o id")
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Hospedagem> delete(@PathVariable("id") Integer id){
        return new ResponseEntity<Hospedagem>(HttpStatus.OK);
    }

    @ApiOperation("Atualizar hospedagens de acordo com o id")
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Hospedagem> update(@PathVariable("id") Integer id){
        return new ResponseEntity<Hospedagem>(HttpStatus.OK);
    }
}
