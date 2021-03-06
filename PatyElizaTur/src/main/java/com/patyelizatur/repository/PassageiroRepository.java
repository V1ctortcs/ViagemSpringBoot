package com.patyelizatur.repository;


import com.patyelizatur.model.Passageiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PassageiroRepository extends JpaRepository<Passageiro, String> {
    List<Passageiro> findByCpf(String cpf);
    List<Passageiro> findByRg(String rg);
    List<Passageiro> findByNomeIgnoreCaseContaining(String Nome);
}
