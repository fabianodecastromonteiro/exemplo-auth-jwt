package com.ws.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.auth.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
