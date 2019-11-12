package com.patyelizatur.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrato extends AbstractEntityContrato {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPagamento", referencedColumnName = "idPagamento")
    private Pagamento pagamento;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Passageiro passageiro;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codViagem", referencedColumnName = "codViagem")
    private  Viagem viagem;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }
}
