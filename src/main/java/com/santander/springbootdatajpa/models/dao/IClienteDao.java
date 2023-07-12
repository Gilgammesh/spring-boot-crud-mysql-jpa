package com.santander.springbootdatajpa.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.santander.springbootdatajpa.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
    // Podemos agregar metodos personalizados para el CRUD
}