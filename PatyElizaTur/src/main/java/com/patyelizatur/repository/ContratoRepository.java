package com.patyelizatur.repository;

import com.patyelizatur.model.Contrato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContratoRepository extends CrudRepository<Contrato,Long> {

    List<Contrato> findByCodContrato (Long codContrato);
    //List<Contrato> findByCpf(String cpf);
//    List<Contrato> findByCodViagem(Long codViagem);
}
