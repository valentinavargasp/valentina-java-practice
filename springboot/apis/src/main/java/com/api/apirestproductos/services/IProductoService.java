package com.api.apirestproductos.services;

import java.util.List;

import com.api.apirestproductos.models.Producto;

public interface IProductoService {
    Producto save(Producto producto);
    List<Producto> findAll();
}
