package com.patyelizatur.controller;

import com.patyelizatur.model.Passageiro;
import com.patyelizatur.repository.PassageiroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Api(tags="Passenger")
@RestController
@RequestMapping("passageiro")
public class PassageiroController {

    private PassageiroRepository passageiroRepository;

    @Autowired
    public PassageiroController(PassageiroRepository passageiroRepository) {
        this.passageiroRepository = passageiroRepository;
    }

    @ApiOperation("Lista todos Passageiros cadastrados")
    @GetMapping(path = "/findall")
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(passageiroRepository.findAll(), HttpStatus.OK);
    }

    @ApiOperation("Lista Passageiros por CPF")
    @GetMapping(path = "/findBycpf/{cpf}")
    public ResponseEntity<?> findPassageiroByCpf(@PathVariable("cpf") String cpf) {
        try {
            Optional<Passageiro> passageiro = passageiroRepository.findById(cpf);
            return new ResponseEntity<>(passageiroRepository.findByCpf(cpf), HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            return new ResponseEntity<>("Passageiro não localizado!!", HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation("Lista Passageiros por nome")
    @GetMapping(path = "/findBynome/{nome}")
    public ResponseEntity<?> findPassageiroByNome(@PathVariable("nome") String nome){
        try {
            Optional<Passageiro> passageiro = passageiroRepository.findById(nome);
            return new ResponseEntity<>(passageiroRepository.findByNomeIgnoreCaseContaining(nome),HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            return new ResponseEntity<>("Passageiro não localizado!!", HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation("Lista Passageiros por RG")
    @GetMapping(path = "/findByrg/{rg}")
    public ResponseEntity<?> findPassageiroByRg(@PathVariable("rg") String rg) {
        try {
            return new ResponseEntity<>(passageiroRepository.findByRg(rg), HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            return new ResponseEntity<>("Passageiro não localizado!!", HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation("Cadastra novos passageiros")
    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Passageiro passageiro) {
        return new ResponseEntity<>(passageiroRepository.save(passageiro), HttpStatus.CREATED);
    }

    @ApiOperation("Deleta Passageiros por CPF")
    @DeleteMapping(path = "/deletBycpf/{cpf}")
    @PreAuthorize ("hasRole('ADMIN')")
    public ResponseEntity<?> delete(@PathVariable String cpf) {
        try {
            passageiroRepository.deleteById(cpf);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            return new ResponseEntity<>("Passageiro não localizado!!", HttpStatus.NOT_FOUND);
        }
    }
}
