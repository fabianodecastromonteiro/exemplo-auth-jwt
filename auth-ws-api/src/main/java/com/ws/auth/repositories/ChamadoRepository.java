package com.ws.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.auth.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
