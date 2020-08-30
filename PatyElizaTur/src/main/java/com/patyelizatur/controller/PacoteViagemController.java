package com.patyelizatur.controller;

import com.patyelizatur.model.PacoteViagem;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pacoteViagem")
public class PacoteViagemController {

    @ApiOperation("Lista os pacotes cadastrados no sistema")
    @GetMapping(path = "/findAll")
    public ResponseEntity<PacoteViagem> listAll(){
        List<PacoteViagem> pacoteViagens = new ArrayList();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation("Lista um ou mais pacote de viagem por nome")
    @GetMapping(path = "/findByName/{name}")
    public ResponseEntity<PacoteViagem> listByName(@PathVariable("nomePacoteViagem") String nomePacoteViagem){
        List<PacoteViagem> pacoteViagens = new ArrayList<>();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation("Lista um ou mais pacote de viagem por data da viagem")
    @GetMapping(path = "/findByDateTravel/{dateTravel}")
    public ResponseEntity<PacoteViagem> listByDateTravel(@PathVariable("dateTravel") String dateTravel){
        List<PacoteViagem> pacoteViagens = new ArrayList<>();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation("Cadastrar Pacote de Viagem")
    @PostMapping
    public ResponseEntity<PacoteViagem> save(@Valid PacoteViagem pacoteViagem){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ApiOperation("Deletar Pacote de Viagem de acordo com o id")
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<PacoteViagem> delete(@PathVariable("id") Integer id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation("Atualizar Pacote de Viagem de acordo com o id")
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<PacoteViagem> update(@PathVariable("id") Integer id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
