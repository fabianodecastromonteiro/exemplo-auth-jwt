package com.ws.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.auth.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
