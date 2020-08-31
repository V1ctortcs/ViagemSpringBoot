package com.patyelizatur.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Data
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEmpresa;
    private String cnpj;
    @JsonProperty("name")
    private String nome;
    @JsonProperty("adress")
    private String endereco;
    @JsonProperty("telephone")
    private String telefoneFixo;
    @JsonProperty("cellphone")
    private String telefoneCelular;
    @Email
    private String email;
}
