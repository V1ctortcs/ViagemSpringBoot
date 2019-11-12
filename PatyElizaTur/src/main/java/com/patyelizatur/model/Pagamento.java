package com.patyelizatur.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Scanner;

@Entity
public class Pagamento extends AbstractEntityPagamento{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codViagem", referencedColumnName = "codViagem")
    private Viagem viagem;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Passageiro passageiro;
    private String formPagamento;
    private int numParcelas;
    private int parcRestantes;
    private BigDecimal valParcelas;
    private BigDecimal valorTotPago;
    private BigDecimal valorDesconto;
    private BigDecimal valorJuros;

//    Scanner scan = new Scanner(System.in);
//
//    public BigDecimal pagAvista(){
//        BigDecimal valViagem = getPrecoViagem();
//        BigDecimal porceDesconto = BigDecimal.ZERO;
//        int div = 100;
//        System.out.println("Informe a porcentagem do desconto: ");
//        porceDesconto = scan.nextBigDecimal();
//        setValorDesconto(porceDesconto.multiply(valViagem).divide(BigDecimal.valueOf(div)));
//        return getValorDesconto();
//    }
//
//    public BigDecimal pagParcelado(){
//        BigDecimal valViagem = getPrecoViagem();
//        BigDecimal porceJuros = BigDecimal.ZERO;
//        int div = 100;
//        System.out.println("Informe a porcentagem de juros: ");
//        porceJuros = scan.nextBigDecimal();
//        setValorJuros(porceJuros.multiply(valViagem).divide(BigDecimal.valueOf(div)));
//        return getValorJuros();
//    }
//
//    public BigDecimal metodoPagamento(){
//        if (getFormPagamento().toUpperCase().equals("AVISTA")){
//            return pagAvista();
//        }else if (getFormPagamento().toUpperCase().equals("PARCELADO")){
//            return pagParcelado();
//        }else {
//            return null;
//        }
//    }


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
