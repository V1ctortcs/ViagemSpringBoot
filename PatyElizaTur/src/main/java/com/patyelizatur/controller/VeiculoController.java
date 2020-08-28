package com.patyelizatur.controller;

import com.patyelizatur.model.Veiculo;
import com.patyelizatur.repository.PassageiroRepository;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
