package com.coderhouse.desafioMongo.controller;

import com.coderhouse.desafioMongo.model.Producto;
import com.coderhouse.desafioMongo.service.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class itemsController {

    @Autowired
    ServiceProducto serviceProducto;

    @GetMapping("/all")
    public List getAllProductos(){
        return serviceProducto.getAllProductos();
    }

    @PostMapping()
    public Producto createProducto(@RequestBody Producto producto){
        return serviceProducto.createProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto readProducto(@PathVariable String id){
        return serviceProducto.readProducto(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable String id){
        return serviceProducto.deleteProducto(id);
    }

}
