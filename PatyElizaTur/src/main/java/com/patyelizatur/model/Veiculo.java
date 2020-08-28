package com.patyelizatur.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codVeiculo;
    private Integer qtdAssentos;
    private Integer tipoAssentos;
    private Empresa codEmpresa;
    private String tipoVeiculo;
    private String fabricante;
    private String modelo;
    private String descricaoVeiculo;
    private Boolean banheiro;
    private Boolean acessibilidade;
}

