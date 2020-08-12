package com.patyelizatur.controller;

import com.patyelizatur.model.Contrato;
import com.patyelizatur.model.Passageiro;
import com.patyelizatur.repository.ContratoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("contrato")
public class ContratoController {
    private ContratoRepository contratoDao;

    @Autowired
    public ContratoController(ContratoRepository contratoDao){
        this.contratoDao = contratoDao;
    }

    @GetMapping
    public ResponseEntity<?> lisAll(){
        return new ResponseEntity<>(contratoDao.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/findByCodContrato/{codContrato}")
    public ResponseEntity<?>findContratoByCodContrato(@PathVariable("codContrato") Long codContrato){
        VerifyIfContratoExistsCodContrato(codContrato);
        Optional<Contrato> contrato = contratoDao.findById(codContrato);
        return new ResponseEntity<>(contratoDao.findByCodContrato(codContrato), HttpStatus.OK);
    }

    private void VerifyIfContratoExistsCodContrato(Long codContrato){
        Optional<Contrato> contrato = contratoDao.findById(codContrato);
        if (!contrato.isPresent()){
            System.out.println("ERRO!! Contrato: " + codContrato + "Não encontrado");
        }
    }



//    @GetMapping(path = "/findyByCpf/{cpf}")
//    public ResponseEntity<?>findContratoByCpfPassageiro(@PathVariable("cpf") String cpf){
//        verifyIfContratoExistsCpf(cpf);
//        Optional<Contrato> contrato = contratoDao.findById(cpf);
//        return  new ResponseEntity<>(contratoDao.findByCpf(cpf), HttpStatus.OK);
//    }

//    private void verifyIfContratoExistsCpf(String cpf) {
//        Optional<Contrato> contrato = contratoDao.findById(cpf);
//        if (contrato.isEmpty())
//            System.out.println("ERRO!! Cpf: " + cpf + " não encontrado");
//    }








}
