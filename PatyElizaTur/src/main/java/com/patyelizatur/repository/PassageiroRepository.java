package com.patyelizatur.repository;

import com.patyelizatur.model.Passageiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassageiroRepository extends JpaRepository<Passageiro, String> {
}
