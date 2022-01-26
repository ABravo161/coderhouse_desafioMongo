package com.coderhouse.desafioMongo.service;

import com.coderhouse.desafioMongo.model.Producto;
import com.coderhouse.desafioMongo.repository.RepositoryProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceProductoImp implements ServiceProducto {

    @Autowired
    RepositoryProductos productos;

    @Override
    public List getAllProductos() {
        return productos.findAll();
//        List listaProductos = new ArrayList<>();
//        productos.findAll().forEach(listaProductos::add);
//        return listaProductos;
    }

    @Override
    public Producto createProducto(Producto producto) {
        productos.save(producto);
        return producto;
    }

    @Override
    public Producto readProducto(String id) {
        return productos.findById(id).get();
    }

    @Override
    public Producto updateProducto(Producto producto, String id) {
        producto.setId(id);
        productos.save(producto);
        return producto;
    }

    @Override
    public String deleteProducto(String id) {
        productos.deleteById(id);
        return "se borro el producto";
    }
}
