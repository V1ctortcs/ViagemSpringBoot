package com.patyelizatur.controller;

import com.patyelizatur.model.Empresa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.service.Tags;

import javax.validation.Valid;

@RestController
@RequestMapping("empresa")
@Api(tags = "company")

public class EmpresaController {
    @GetMapping
    @ApiOperation("lista todas as empresa cadastradas")
    public ResponseEntity<Empresa> listall(){
        return new ResponseEntity<Empresa>(HttpStatus.OK);
    }

    @GetMapping(path = "/findCnpj/{cnpj}")
    @ApiOperation("listar empresas por cnpj")
    public ResponseEntity<Empresa> listCnpj(@PathVariable("cnpj")String cnpj){
        return new ResponseEntity<Empresa>(HttpStatus.OK);

    }

    @GetMapping(path = "/findNome/{nome}")
    @ApiOperation("listar por nome")
    public ResponseEntity<Empresa> listNome(@PathVariable("nome")String nome){
        return  new ResponseEntity<Empresa>(HttpStatus.OK);
    }

    @PostMapping
    @ApiOperation("cadastra empresas")
    public ResponseEntity<Empresa> save(@Valid Empresa empresa){
        return new ResponseEntity<Empresa>(HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ApiOperation("deleta empresa de acordo com Id")
    public ResponseEntity<Empresa> delete(@PathVariable("id")Integer id){
        return new ResponseEntity<Empresa>(HttpStatus.OK);
    }

    @PutMapping(path = "/update/{id}")
    @ApiOperation("atualiza empresa por Id")
    public ResponseEntity<Empresa> update(@PathVariable("id")Integer id){
        return  new ResponseEntity<Empresa>(HttpStatus.OK);
    }

}
