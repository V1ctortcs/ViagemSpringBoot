package com.patyelizatur.repository;


import com.patyelizatur.model.Passageiro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PassageiroRepository extends CrudRepository<Passageiro, Long>   {
    List<Passageiro> findByNameIgnoreCaseContaining(String name);

}
