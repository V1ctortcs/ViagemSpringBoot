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

    private PassageiroRepository passageiroDao;

    @Autowired
    public PassageiroController(PassageiroRepository passageiroDao) {
        this.passageiroDao = passageiroDao;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(passageiroDao.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/findBycpf/{cpf}")
    public ResponseEntity<?> findPassageiroByCpf(@PathVariable("cpf") String cpf) {
        verifyIfPassageiroExistsCpf(cpf);
        Optional<Passageiro> passageiro = passageiroDao.findById(cpf);
        return new ResponseEntity<>(passageiroDao.findByCpf(cpf), HttpStatus.OK);
    }

    @GetMapping(path = "/findBynome/{nome}")
    public ResponseEntity<?> findPassageiroByNome(@PathVariable("nome") String nome){
        verifyIfPassageiroExistsNome(nome);
        Optional<Passageiro> passageiro = passageiroDao.findById(nome);
        return new ResponseEntity<>(passageiroDao.findByNomeIgnoreCaseContaining(nome),HttpStatus.OK);
    }


    @GetMapping(path = "/findByrg/{rg}")
    public ResponseEntity<?> findPassageiroByRg(@PathVariable String rg) {
        return new ResponseEntity<>(passageiroDao.findByRg(rg), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Passageiro passageiro) {
        return new ResponseEntity<>(passageiroDao.save(passageiro), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/deletBycpf/{cpf}")
    public ResponseEntity<?> delete(@PathVariable String cpf) {
        verifyIfPassageiroExistsCpf(cpf);
        passageiroDao.deleteById(cpf);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private void verifyIfPassageiroExistsNome(String nome) {
        Optional<Passageiro> passageiro = passageiroDao.findById(nome);
        if (!passageiro.isPresent())
            System.out.println("ERRO!! nome: " + nome + " não encontrado");
    }


    private void verifyIfPassageiroExistsCpf(String cpf) {
        Optional<Passageiro> passageiro = passageiroDao.findById(cpf);
        if (!passageiro.isPresent())
            System.out.println("ERRO!! Cpf: " + cpf + " não encontrado");
    }

}
