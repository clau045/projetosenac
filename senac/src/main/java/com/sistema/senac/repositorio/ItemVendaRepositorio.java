package com.sistema.senac.repositorio;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sistema.senac.modelo.ItemVenda;

public interface ItemVendaRepositorio extends JpaRepository<ItemVenda,Long> {

	@Query("SELECT e FROM ItemVenda e WHERE e.venda.id= ?1")
	List<ItemVenda>buscaporVenda(long id);
}

