package com.patyelizatur.repository;

import com.patyelizatur.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {
    List<Viagem> findByCodViagem(Long codViagem);
}
