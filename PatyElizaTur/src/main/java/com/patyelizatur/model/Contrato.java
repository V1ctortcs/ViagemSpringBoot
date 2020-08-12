package com.patyelizatur.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codContrato;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPagamento", referencedColumnName = "idPagamento")
    private Pagamento pagamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Passageiro passageiro;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codViagem", referencedColumnName = "codViagem")
    private  Viagem viagem;
}
