package com.patyelizatur.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntityContrato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codContrato;

    //getter and setter
    public Long getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(Long codContrato) {
        this.codContrato = codContrato;
    }
}
