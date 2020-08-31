package com.patyelizatur.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class PacoteViagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPacoteViagem;
    private Date dataCadastro;
    private String nomePacoteViagem;
    private String descricao;
    private Date dataViagem;
    private Date dataRetorno;
    @OneToMany(mappedBy = "codHospedagem")
    private List<Hospedagem> hospedagens;
    @OneToMany(mappedBy = "codVeiculo")
    private List<Veiculo> veiculos;
    private double valorPessoaAdulto;
    private double valorPessoaInfantil;
    private Integer qntPessoas;
    private String observacoes;

}
