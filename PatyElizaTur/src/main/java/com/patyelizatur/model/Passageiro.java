package com.patyelizatur.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Passageiro{

    @Id
    @NotEmpty(message = "CPF é obrigatório!!")

    @Email
    private String email;

    private String cpf;

    private String rg;

    private String nome;

    private String celular;

    private String telResidencia;

    private String cep;

    private Date dtaNascimento;
}
