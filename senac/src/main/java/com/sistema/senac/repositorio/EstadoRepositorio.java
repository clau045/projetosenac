package com.sistema.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.senac.modelo.Produto;

public interface EstadoRepositorio extends JpaRepository<Produto,Long> {


}

