package com.api.apirestproductos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirestproductos.models.Producto;
import com.api.apirestproductos.services.IProductoService;

@RestController
public class ProductoController {

    private IProductoService iProducto;

    public ProductoController(IProductoService iProducto) {
        this.iProducto = iProducto;
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return iProducto.save(producto);
    }

    @GetMapping
    public List<Producto> findAll() {
        return iProducto.findAll();
    }

}
