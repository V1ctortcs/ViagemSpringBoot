package com.patyelizatur.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
@Entity
public class Contrato extends AbstractEntityContrato {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPagamento", referencedColumnName = "idPagamento")
    private Pagamento pagamento;

    //fk cpfpassageiro
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Passageiro passageiro;

    //fk codViagem
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codViagem", referencedColumnName = "codViagem")
    private  Viagem viagem;

    //anexar pdf do contrato no BD



}
