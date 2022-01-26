package com.coderhouse.desafioMongo.service;

import com.coderhouse.desafioMongo.model.Producto;

import java.util.List;


public interface ServiceProducto {
    List getAllProductos();
    Producto createProducto(Producto producto);
    Producto readProducto(String id);
    Producto updateProducto(Producto producto, String id);
    String deleteProducto(String id);

}
