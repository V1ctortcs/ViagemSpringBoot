package com.patyelizatur.model;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Data
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codViagem;
    private String nomeViagem;
    private BigDecimal precoViagem;
    private String empresaTrans;
}
