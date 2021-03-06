package com.patyelizatur.repository;

import com.patyelizatur.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContratoRepository extends JpaRepository<Contrato,Long> {
    List<Contrato> findByCodContrato (Long codContrato);
}
