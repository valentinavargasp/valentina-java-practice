package com.api.apirestproductos.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.api.apirestproductos.models.Producto;
import com.api.apirestproductos.repositories.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    
    @Override
    public Producto save(Producto producto) {
        // Implementación del método para guardar un producto
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        // Implementación del método para obtener todos los productos
        return productoRepository.findAll();
    }

}
