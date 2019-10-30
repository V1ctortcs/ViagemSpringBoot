package com.patyelizatur.model;
import javax.persistence.Entity;
import java.math.BigDecimal;


@Entity
public class Viagem extends AbstractEntityViagem{
    private String nomeViagem;
    private BigDecimal precoViagem;
    private String empresaTrans;

    //getter and setter

    public String getNomeViagem() {
        return nomeViagem;
    }

    public void setNomeViagem(String nomeViagem) {
        this.nomeViagem = nomeViagem;
    }

    public BigDecimal getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(BigDecimal precoViagem) {
        this.precoViagem = precoViagem;
    }

    public String getEmpresaTrans() {
        return empresaTrans;
    }

    public void setEmpresaTrans(String empresaTrans) {
        this.empresaTrans = empresaTrans;
    }
}
