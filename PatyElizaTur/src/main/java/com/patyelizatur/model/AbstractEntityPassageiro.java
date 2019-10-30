package com.patyelizatur.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public class AbstractEntityPassageiro implements Serializable {

    @Id
    @NotEmpty(message = "CPF é obrigatório!!")
    private String cpf;

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntityPassageiro that = (AbstractEntityPassageiro) o;
        return cpf == that.cpf;
    }
    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    //get and set CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
