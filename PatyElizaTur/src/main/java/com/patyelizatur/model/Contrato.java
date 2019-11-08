package com.patyelizatur.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
@Entity
public class Contrato extends AbstractEntityContrato{
    //FK passageiroViagem

    //fk cpfpassageiro
    @ManyToOne
    private Passageiro passageiro;
    //fk codViagem
    @ManyToOne
    private  Viagem viagem;

    //anexar pdf do contrato no BD

    private String formPagamento;
    private int numParcelas;
    private BigDecimal valParcelas;
    private int parcRestantes;
    private BigDecimal valorTotPago;
    private BigDecimal valorDesconto;
    private BigDecimal valorJuros;


    //getter and setter
    public String getFormPagamento() {
        return formPagamento;
    }

    public void setFormPagamento(String formPagamento) {
        this.formPagamento = formPagamento;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public BigDecimal getValParcelas() {
        return valParcelas;
    }

    public void setValParcelas(BigDecimal valParcelas) {
        this.valParcelas = valParcelas;
    }

    public int getParcRestantes() {
        return parcRestantes;
    }

    public void setParcRestantes(int parcRestantes) {
        this.parcRestantes = parcRestantes;
    }

    public BigDecimal getValorTotPago() {
        return valorTotPago;
    }

    public void setValorTotPago(BigDecimal valorTotPago) {
        this.valorTotPago = valorTotPago;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(BigDecimal valorJuros) {
        this.valorJuros = valorJuros;
    }
}
