package com.patyelizatur.controller;

import com.patyelizatur.model.Passageiro;
import com.patyelizatur.repository.PassageiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("passageiro")
public class PassageiroController {

    private final PassageiroRepository passageiroDao;

    @Autowired
    public PassageiroController(PassageiroRepository passageiroDao) {
        this.passageiroDao = passageiroDao;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(passageiroDao.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{cpf}")
    public ResponseEntity<?> getPassageiroById(@PathVariable("cpf") String cpf) {

        verifyIfPassageiroExists(cpf);
        Optional<Passageiro> passageiro = passageiroDao.findById(cpf);
        return new ResponseEntity<>(passageiroDao.findByCpfIgnoreCaseContaining(cpf), HttpStatus.OK);
    }

    private void verifyIfPassageiroExists(String cpf) {
        Optional<Passageiro> passageiro = passageiroDao.findById(cpf);
        if (passageiro.isEmpty())
            System.out.println("ERROR!! Cpf: " + cpf + " não encontrado");

    }
}
