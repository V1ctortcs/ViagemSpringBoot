package com.patyelizatur.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codVeiculo;
    private Integer qtdAssentos;
    private Integer tipoAssentos;
//    private Empresa codEmpresa;
    private String tipoVeiculo;
    private String fabricante;
    private String modelo;
    private String descricaoVeiculo;
    private Boolean banheiro;
    private Boolean acessibilidade;

}

