package com.patyelizatur.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Scanner;

@Entity
@Data
public class Pagamento{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

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
}
