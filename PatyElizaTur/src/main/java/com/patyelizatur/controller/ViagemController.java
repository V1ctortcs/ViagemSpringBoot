package com.patyelizatur.controller;

import com.patyelizatur.model.Viagem;
import com.patyelizatur.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("viagens")
public class ViagemController  {

    private  ViagemRepository viagemDao;
    @Autowired
    public ViagemController (ViagemRepository viagemDao){this.viagemDao = viagemDao;}

    @GetMapping
    public ResponseEntity<?> listAll(){return new ResponseEntity<>(viagemDao.findAll(), HttpStatus.OK);}

    @GetMapping(path = "/findbycodviagem/{codViagem}")
    public ResponseEntity<?> findviagembycod(@PathVariable("codViagem") Long codViagem){
        verifyViagemExist(codViagem);
        Optional<Viagem> viagem = viagemDao.findById(codViagem);
        return new ResponseEntity<>(viagemDao.findByCodViagem(codViagem),HttpStatus.OK);

    }

    private void verifyViagemExist(Long codViagem){
        Optional<Viagem> viagem = viagemDao.findById(codViagem);
        if (viagem.isEmpty())
            System.out.println("codigo não localizado");

    }

}
