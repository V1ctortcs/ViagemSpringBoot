package com.patyelizatur.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@MappedSuperclass
public abstract class AbstractEntityViagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codViagem;


    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntityViagem that = (AbstractEntityViagem) o;
        return codViagem == that.codViagem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codViagem);
    }

    //get and setter

    public Long getCodViagem() {
        return codViagem;
    }

    public void setCodViagem(Long codViagem) {
        this.codViagem = codViagem;
    }
}
