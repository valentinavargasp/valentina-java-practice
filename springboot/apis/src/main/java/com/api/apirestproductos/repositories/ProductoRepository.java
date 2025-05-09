package com.api.apirestproductos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apirestproductos.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
