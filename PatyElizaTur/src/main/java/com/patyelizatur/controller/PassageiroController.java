package com.patyelizatur.controller;

import com.patyelizatur.model.Passageiro;
import com.patyelizatur.repository.PassageiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<?> getPassageiroByCpf(@PathVariable("cpf") String cpf) {
        verifyIfPassageiroExists(cpf);
        Optional<Passageiro> passageiro = passageiroDao.findById(cpf);
        return new ResponseEntity<>(passageiroDao.findByCpfIgnoreCaseContaining(cpf), HttpStatus.OK);
    }

    @GetMapping(path = "/findByrg/{rg}")
    public ResponseEntity<?> findPassageiroByRg(@PathVariable String rg) {
        return new ResponseEntity<>(passageiroDao.findByRgIgnoreCaseContaining(rg), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Passageiro passageiro) {
        return new ResponseEntity<>(passageiroDao.save(passageiro), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{cpf}")
    public ResponseEntity<?> delete(@PathVariable String cpf) {
        verifyIfPassageiroExists(cpf);
        passageiroDao.deleteById(cpf);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private void verifyIfPassageiroExists(String cpf) {
        Optional<Passageiro> passageiro = passageiroDao.findById(cpf);
        if (passageiro.isEmpty())
            System.out.println("ERRO!! Cpf: " + cpf + " não encontrado");
    }

}
