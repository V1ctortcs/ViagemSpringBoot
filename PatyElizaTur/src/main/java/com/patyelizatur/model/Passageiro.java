package com.patyelizatur.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.Set;

@Entity
public class Passageiro extends AbstractEntityPassageiro {

    private String rg;
    private String nome;
    @Email
    private String email;
    private String celular;
    private String telResidencia;
    private String cep;
    private Date dtaNascimento;

    //Criando tabela de log entre Passageiro e viagem
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "passageiroViagem",
            joinColumns = @JoinColumn(name = "viagem_codViagem"),
            inverseJoinColumns = @JoinColumn(name = "passageiro_cpf")
    )
    Set<Viagem> fkViagem;

    //get and setter
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelResidencia() {
        return telResidencia;
    }

    public void setTelResidencia(String telResidencia) {
        this.telResidencia = telResidencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDtaNascimento() {
        return dtaNascimento;
    }

    public void setDtaNascimento(Date dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }
}
