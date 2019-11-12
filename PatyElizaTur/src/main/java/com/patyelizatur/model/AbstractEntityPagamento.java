package com.patyelizatur.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntityPagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntityPagamento that = (AbstractEntityPagamento) o;
        return idPagamento == that.idPagamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPagamento);
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }
}
