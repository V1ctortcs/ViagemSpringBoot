package com.patyelizatur.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class PacoteViagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idTravelPackage")
    private Integer idPacoteViagem;
    @JsonProperty("registerDate")
    private Date dataCadastro;
    @JsonProperty("travelPackageName")
    private String nomePacoteViagem;
    @JsonProperty("description")
    private String descricao;
    @JsonProperty("travelDate")
    private Date dataViagem;
    @JsonProperty("returnDate")
    private Date dataRetorno;
    @JsonProperty("accommodation")
    @OneToMany(mappedBy = "codHospedagem")
    private List<Hospedagem> hospedagens;
    @JsonProperty("vehicles")
    @OneToMany(mappedBy = "codVeiculo")
    private List<Veiculo> veiculos;
    @JsonProperty("amountAdultPerson")
    private double valorPessoaAdulto;
    @JsonProperty("amountChildPerson")
    private double valorPessoaInfantil;
    @JsonProperty("amountPeople")
    private Integer qntPessoas;
    @JsonProperty("comments")
    private String observacoes;

}
